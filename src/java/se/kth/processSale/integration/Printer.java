package se.kth.processSale.integration;

public class Printer {


    public Printer(){

    }

    public void printReceipt(ReceiptDTO receipt){

        System.out.print(receipt.getReceipt());

    }
}
