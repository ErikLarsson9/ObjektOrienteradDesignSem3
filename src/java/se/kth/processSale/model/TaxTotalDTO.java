package se.kth.processSale.model;

public class TaxTotalDTO {
    private double total;
    private double tax;


    public  TaxTotalDTO(double total, double tax){
        this.total = total;
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public double getTax() {
        return tax;
    }
}
