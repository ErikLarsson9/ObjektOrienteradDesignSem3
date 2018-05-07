package se.kth.processSale.model;

public class SaleInformation {
    private SaleDTO finishedSale;
    private TaxTotalDTO taxAndTotal;
    private ChangeDTO returnedChange;

    public SaleInformation(SaleDTO finishedSale, TaxTotalDTO taxAndTotal, ChangeDTO returnedChange){
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
