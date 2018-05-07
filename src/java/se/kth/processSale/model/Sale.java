package se.kth.processSale.model;

import se.kth.processSale.integration.ItemDTO;
import se.kth.processSale.util.Node;

public class Sale {
    private double runningTotal;
    private Node<ItemDTO> itemList;


    public Sale(){
        this.runningTotal = 0;
        this.itemList = null;

    }

    public void addItem(ItemDTO item){
        Node<ItemDTO> newItem = new Node<ItemDTO>();
        runningTotal += item.getPrice();
        newItem.item = item;
        newItem.next = itemList;
        itemList = newItem;


    }
    public SaleDTO saleStatus(){
        return new SaleDTO(this.runningTotal,itemList);
    }



}
