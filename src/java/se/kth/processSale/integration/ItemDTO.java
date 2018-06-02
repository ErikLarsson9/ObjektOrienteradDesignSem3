package se.kth.processSale.integration;

public class ItemDTO {
    private final String identifier;
    private final double price;
    private final String itemDescription;

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

    public String toString(){
        return  "Item identifier: " + this.identifier + ", "+
        "Description: " + this.itemDescription + ", "+
                "Price: " + this.price + " ";
    }




}
