package se.kth.processSale.integration;

public class ReceiptDTO {
    private  String receipt;

    public ReceiptDTO(String receipt){
        this.receipt = receipt;

    }

    public String getReceipt() {
        return receipt;
    }
}
