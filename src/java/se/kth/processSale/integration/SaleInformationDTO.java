package se.kth.processSale.integration;

import se.kth.processSale.model.ChangeDTO;
import se.kth.processSale.model.SaleDTO;
import se.kth.processSale.model.TaxTotalDTO;

public class SaleInformationDTO {
    private SaleDTO finishedSale;
    private TaxTotalDTO taxAndTotal;
    private ChangeDTO returnedChange;

    public SaleInformationDTO(SaleDTO finishedSale, TaxTotalDTO taxAndTotal, ChangeDTO returnedChange){
        this.finishedSale = finishedSale;
        this.taxAndTotal = taxAndTotal;
        this.returnedChange = returnedChange;

    }

    public SaleDTO getFinishedSale() {
        return finishedSale;
    }

    public TaxTotalDTO getTaxAndTotal() {
        return taxAndTotal;
    }

    public ChangeDTO getReturnedChange() {
        return returnedChange;
    }
}
