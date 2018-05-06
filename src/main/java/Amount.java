public class Amount {
    public int amount = 0;

    public Amount(int amount){
        this.amount = amount;


    }
    public Amount(){

    }

    public boolean equals(Object other) {
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount otherAmount = (Amount) other;
        return amount == otherAmount.amount;
    }

}
