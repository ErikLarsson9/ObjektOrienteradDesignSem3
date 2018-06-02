package se.kth.processSale.integration;

import se.kth.processSale.model.SaleDTO;
import se.kth.processSale.util.Node;

public class InventorySystem {


    public InventorySystem(){

    }
    public void sendSaleInformation(SaleInformationDTO saleInformationDTO){
        SaleDTO finishedSale = saleInformationDTO.getFinishedSale();
        Node<ItemDTO> itemsSold = finishedSale.getItemList();
        sendListOfItemsSold(itemsSold);

    }
    public void sendListOfItemsSold(Node<ItemDTO> itemsSold){
        //Send Items sold to external System
    }
}
