package se.kth.processSale.model;

public class TotalWithTax {
    private final double TAX_RATE = 0.25;
    private TaxTotalDTO taxAndTotal;

    public TotalWithTax(SaleDTO currentSale){

        double total = currentSale.getRunningTotal();
        double tax = total + total*TAX_RATE;
        taxAndTotal = new TaxTotalDTO(total, tax);

    }


    public  TaxTotalDTO getTotalWithTax(){
        return taxAndTotal;
    }
}
