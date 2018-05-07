package se.kth.processSale.model;

public class ChangeCalculator {
    private ChangeDTO change;

    public ChangeCalculator(double payedAmount, TaxTotalDTO totalWithTax){
        double calculatedChange = payedAmount - totalWithTax.getTax();
        change = new ChangeDTO(calculatedChange);

    }

    public ChangeDTO getChange() {
        return change;
    }
}
