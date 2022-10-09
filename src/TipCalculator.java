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

    //getter methods
    public double getTotalBillBeforeTip() {

        return totalBillBeforeTip;
    }
    public double getTipPercentage() {

        return tipPercentage;
    }
    //adds the cost of meals to totalBillBeforeTip
    public void addMeal(double newMeal){
        totalBillBeforeTip += newMeal;

    }
    //calculates tip amount
    public double tipAmount(){
        double tip = totalBillBeforeTip * (tipPercentage / 100.00);
        return tip;
    }

    //total cost with tip
    public double totalBill(){
       double total = totalBillBeforeTip + tipAmount();
       return total;
    }
    //cost per person without tip
    public double perPersonCostBeforeTip(){
        double perPerson = totalBillBeforeTip / numPeople;
        return perPerson;
    }
    //tip amount per person
    public double perPersonTipAmount(){
        double perPersonTip = tipAmount() / numPeople;
        return perPersonTip;
    }
    // total cost per person
    public double perPersonTotalCost(){
        double perPersonCost = perPersonCostBeforeTip() + perPersonTipAmount();
        return perPersonCost;
    }
}
