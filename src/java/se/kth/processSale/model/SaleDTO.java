package se.kth.processSale.model;

import se.kth.processSale.integration.ItemDTO;
import se.kth.processSale.util.Node;

public class SaleDTO {
    private double runningTotal;
    private Node<ItemDTO> itemList;


    public SaleDTO(double runningTotal, Node<ItemDTO> itemList){
        this.runningTotal = runningTotal;
        this.itemList = itemList;

    }

    public Node<ItemDTO> getItemList() {
        return itemList;
    }

    public double getRunningTotal() {
        return runningTotal;
    }


    public ItemDTO getLatestItemAdded(){

        return itemList.item;
    }


}
