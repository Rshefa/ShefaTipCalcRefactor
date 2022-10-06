public class TipCalculator {
    //instance variables
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    //Constructor
    public TipCalculator(int numPeople, double tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    //methods
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }
    public void addMeal(double cost){

    }
    public double tipAmount(){
        return totalBillBeforeTip;
    }

}
