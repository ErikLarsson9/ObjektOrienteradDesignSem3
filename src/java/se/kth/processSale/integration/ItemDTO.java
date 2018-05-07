package se.kth.processSale.integration;

public class ItemDTO {
    String identifier;
    double price;
    String itemDescription;

    public ItemDTO(String identifier, double price, String itemDescription){
        this.identifier = identifier;
        this.price = price;
        this.itemDescription = itemDescription;
    }

    public String getIdentifier() {
        return identifier;
    }

    public double getPrice() {
        return price;
    }

    public String getItemDescription() {
        return itemDescription;
    }


}
