package se.kth.processSale.integration;

import se.kth.processSale.model.SaleDTO;
import se.kth.processSale.model.SaleInformation;
import se.kth.processSale.util.Node;

public class InventorySystem {


    public InventorySystem(){

    }
    public void sendSaleInformation(SaleInformation saleInformation){
        SaleDTO finishedSale = saleInformation.getFinishedSale();
        Node<ItemDTO> itemsSold = finishedSale.getItemList();
        sendListOfItemsSold(itemsSold);

    }
    public void sendListOfItemsSold(Node<ItemDTO> itemsSold){
        //Send Items sold to external System
    }
}
