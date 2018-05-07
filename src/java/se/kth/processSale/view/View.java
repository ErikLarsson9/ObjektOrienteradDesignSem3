package se.kth.processSale.view;

import se.kth.processSale.controller.Controller;
import se.kth.processSale.integration.ItemDTO;
import se.kth.processSale.model.*;

public class View {
    private Controller controller;
    private final String CURRENCY = "kr";

    public View(Controller controller){
        this.controller = controller;
    }

    public void sampleExecution(){
        System.out.println("Begin sample execution");

        controller.beginSale();
        SaleDTO currentSale = controller.searchItem("abc1001");
        showItemDescriptionRunningTotal(currentSale);
        currentSale = controller.searchItem("abc1002");
        showItemDescriptionRunningTotal(currentSale);
        currentSale = controller.searchItem("abc1003");
        showItemDescriptionRunningTotal(currentSale);
        TaxTotalDTO taxAndTotal = controller.allItemsRegistered();
        showTotalWithTax(taxAndTotal);
        double payedAmount = 200.50;
        ChangeDTO change = controller.enterPayment(payedAmount);
        showChange(change);





    }

    private void showItemDescriptionRunningTotal(SaleDTO currentSale){

        ItemDTO latestItem = currentSale.getLatestItemAdded();
        System.out.println("Item description: " + latestItem.getItemDescription() + " Item price: " +
                latestItem.getPrice() + " "+ CURRENCY);
        System.out.println("Running total: " + currentSale.getRunningTotal() + " "+ CURRENCY);
    }

    private void showTotalWithTax(TaxTotalDTO taxAndTotal){
        System.out.println("Running total: " + taxAndTotal.getTotal() + " "+ CURRENCY);
        System.out.println("Running total with tax: " + taxAndTotal.getTax() + " "+ CURRENCY);

    }

    private void showChange(ChangeDTO change){
        System.out.println("Change: " + change.getChange()+ " "+ CURRENCY);
    }







}
