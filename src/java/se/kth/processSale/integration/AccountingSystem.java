package se.kth.processSale.integration;

import se.kth.processSale.model.ChangeDTO;
import se.kth.processSale.model.SaleDTO;
import se.kth.processSale.model.TaxTotalDTO;
import se.kth.processSale.util.Node;

public class AccountingSystem {

    public AccountingSystem(){


    }
    public void sendSaleInformation(SaleInformationDTO saleInformationDTO){
        SaleDTO finishedSale = saleInformationDTO.getFinishedSale();
        sendListOfItemsSold(finishedSale.getItemList());
        sendReturnedChange(saleInformationDTO.getReturnedChange());
        sendTaxAndTotal(saleInformationDTO.getTaxAndTotal());

    }
    public void sendListOfItemsSold (Node<ItemDTO> itemsSold){
        //Send Items sold to external System
    }
    public void sendReturnedChange(ChangeDTO change){
        //code

    }
    public void sendTaxAndTotal(TaxTotalDTO taxAndTotal){
        //code

    }
}
