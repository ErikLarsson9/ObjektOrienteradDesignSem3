package se.kth.processSale.integration;


import se.kth.processSale.model.ChangeDTO;
import se.kth.processSale.model.SaleDTO;
import se.kth.processSale.util.Node;

import java.util.Date;

public class Receipt {
    private String receipt;
    private Printer printer;

    public Receipt(SaleInformationDTO saleInformationDTO){
        //Date date = new Date();
        double totalWithoutTaxes = saleInformationDTO.getTaxAndTotal().getTotalWithoutTaxes();
        double totalWithTaxes = saleInformationDTO.getTaxAndTotal().getTotalWithTaxApplied();
        ChangeDTO change = saleInformationDTO.getReturnedChange();
        SaleDTO sale = saleInformationDTO.getFinishedSale();
        Node<ItemDTO> itemList = sale.getItemList();
        receipt= "Receipt\n";
        //receipt+= date.toString()+"\n";
        receipt+="Items: \n";
        if(itemList != null){
            receipt+=itemList.toString();
        }
        receipt+="Total: "+totalWithoutTaxes+"\n";
        receipt+="Tax: "+(totalWithTaxes-totalWithoutTaxes)+"\n";
        receipt+="Total with Tax: "+totalWithTaxes+"\n";
        receipt+="Amount payed: "+change.getAmountPayed()+"\n";
        receipt+="Change returned: "+change.getChange()+" kr\n";
        printer = new Printer();




    }
    public void sendReceipt(){
        this.printer.printReceipt(new ReceiptDTO(this.receipt));
    }

}
