package se.kth.processSale.controller;

import se.kth.processSale.integration.*;
import se.kth.processSale.model.*;

public class Controller {
    private AccountingSystem accountingSystem;
    private InventorySystem invSystem;
    private ProductCatalogue productCatalogue;
    private ChangeCalculator changeCalc;
    CalculateTotalWithTax totalWithTax;
    //private Printer printer;
    private Sale currentSale;
    private Receipt receipt;

    public Controller(AccountingSystem accountingSystem, InventorySystem invSystem, ProductCatalogue productCatalogue ){
        this.accountingSystem = accountingSystem;
        this.invSystem = invSystem;
        this.productCatalogue = productCatalogue;
        //this.printer = printer;

    }

    public void beginSale(){
        this.currentSale = new Sale();

    }
    public SaleDTO searchItem(String identifier){
        ItemDTO item = productCatalogue.searchItem(identifier);
        if(item == null){
            return currentSale.saleStatus();
        }
        else {
            currentSale.addItem(item);
            return currentSale.saleStatus();
        }

    }

    public TaxTotalDTO allItemsRegistered(){
        totalWithTax = new CalculateTotalWithTax(currentSale.saleStatus());
        //SaleDTO sale = currentSale.saleStatus();
        //sale.getItemList().copyList().printList();
        return  totalWithTax.getTotalWithTax();

    }

    public ChangeDTO enterPayment( double payedAmount){
        changeCalc = new ChangeCalculator(payedAmount, totalWithTax.getTotalWithTax());
        ChangeDTO change = changeCalc.getChange();
        SaleInformationDTO saleInformationDTO = new SaleInformationDTO(currentSale.saleStatus(), totalWithTax.getTotalWithTax(), change);
        invSystem.sendSaleInformation(saleInformationDTO);
        accountingSystem.sendSaleInformation(saleInformationDTO);
        receipt = new Receipt(saleInformationDTO);
        receipt.sendReceipt();
        return change;





    }





}
