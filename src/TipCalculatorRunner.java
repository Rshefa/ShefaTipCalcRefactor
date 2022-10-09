//importing classes
import java.util.Scanner;
import java.text.DecimalFormat;

    public class TipCalculatorRunner {
        public static void main(String[] args){

            //objects
            Scanner scan =new Scanner(System.in);
            DecimalFormat formatter = new DecimalFormat("#.##");

            //welcoming
            System.out.println("Welcome to the tip calculator!");

            //user input and creating variables
            System.out.print("How many people are in your group? ");
            int group = scan.nextInt();
            System.out.print("What's the tip percentage? (0 - 100): ");
            int tip = scan.nextInt();
            scan.nextLine();

            //calculator object
            TipCalculator calc = new TipCalculator (group, tip);
            System.out.print("Enter a cost in dollars and cents, eg. 12.50 (-1 to end): ");
            double cost = scan.nextDouble();

            //While loop
            while ( cost != -1) {
                calc.addMeal(cost);
                System.out.print("Enter a cost in dollars and cents, eg. 12.50 (-1 to end): ");
                cost = scan.nextDouble();


            }
            //Printing the bill with decimal format
            System.out.println("-------------------------");
            System.out.println("Total Bill Before Tip: " + formatter.format(calc.getTotalBillBeforeTip()));
            System.out.println("Tip Percentage: " + formatter.format(calc.getTipPercentage()));
            System.out.println("Total Tip: " + formatter.format(calc.tipAmount()));
            System.out.println("Total Bill With Tip: " + formatter.format(calc.totalBill()));
            System.out.println("Per Person Cost Before Tip: " + formatter.format(calc.perPersonCostBeforeTip()));
            System.out.println("Tip Per Person: " + formatter.format((calc.perPersonTipAmount())));
            System.out.println("Total Cost Per Person: " + formatter.format(calc.perPersonTotalCost()));


            scan.close();
        }
    }

