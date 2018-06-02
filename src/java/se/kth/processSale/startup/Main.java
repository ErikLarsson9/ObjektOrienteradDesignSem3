package se.kth.processSale.startup;

import se.kth.processSale.controller.Controller;
import se.kth.processSale.integration.AccountingSystem;
import se.kth.processSale.integration.InventorySystem;
import se.kth.processSale.integration.Printer;
import se.kth.processSale.integration.ProductCatalogue;
import se.kth.processSale.view.View;

public class Main {




    public static void main(String[] args){
        AccountingSystem accountingSystem = new AccountingSystem();
        InventorySystem invSystem = new InventorySystem();
        ProductCatalogue productCatalogue = new ProductCatalogue();
        //Printer printer = new Printer();
        Controller controller = new Controller(accountingSystem, invSystem, productCatalogue);
        View view = new View(controller);
        view.sampleExecution();



    }
}
