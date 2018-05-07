package se.kth.processSale.controller;

import se.kth.processSale.integration.*;
import se.kth.processSale.model.*;

public class Controller {
    private AccountingSystem accountingSystem;
    private InventorySystem invSystem;
    private ProductCatalogue productCatalogue;
    private ChangeCalculator changeCalc;
    TotalWithTax totalWithTax;
    private Printer printer;
    private Sale currentSale;
    private Receipt receipt;

    public Controller(AccountingSystem accountingSystem, InventorySystem invSystem, Printer printer, ProductCatalogue productCatalogue ){
        this.accountingSystem = accountingSystem;
        this.invSystem = invSystem;
        this.productCatalogue = productCatalogue;
        this.printer = printer;

    }

    public void beginSale(){
        this.currentSale = new Sale();

    }
    //Should instead make class in model layer that calls productCatalogue
    public SaleDTO searchItem(String identifier){
        ItemDTO item = productCatalogue.searchItem(identifier);
        if(item == null){
            return null;
        }
        else {
            currentSale.addItem(item);
            return currentSale.saleStatus();
        }

    }

    public TaxTotalDTO allItemsRegistered(){
        totalWithTax = new TotalWithTax(currentSale.saleStatus());
        return  totalWithTax.getTotalWithTax();

    }

    public ChangeDTO enterPayment( double payedAmount){
        changeCalc = new ChangeCalculator(payedAmount, totalWithTax.getTotalWithTax());
        ChangeDTO change = changeCalc.getChange();
        SaleInformation saleInformation = new SaleInformation(currentSale.saleStatus(), totalWithTax.getTotalWithTax(), change);
        invSystem.sendSaleInformation(saleInformation);
        accountingSystem.sendSaleInformation(saleInformation);
        receipt = new Receipt(saleInformation);
        printer.printReceipt(receipt);
        return change;





    }





}
