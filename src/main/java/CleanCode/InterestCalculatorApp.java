package CleanCode;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class InterestCalculatorApp
{
    public static void main( String[] args ) throws IOException {
        Scanner sc = new Scanner(System.in);
        InterestCalculator calculator = new InterestCalculator();
        double p,r,t,interest,amt;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        int choice;
        do{
            System.out.write("\nEnter Principal, Rate and Time period(in years): ".getBytes());
            p = sc.nextDouble();
            r = sc.nextDouble();
            t = sc.nextDouble();
            System.out.write("\n**** MENU ****\n".getBytes());
            System.out.write("1. Calculate Simple Interest\n".getBytes());
            System.out.write("2. Calculate Compound Interest\n".getBytes());
            System.out.write("3. Exit\n".getBytes());
            choice = sc.nextInt();
            switch(choice){
                case 1: interest = calculator.simpleInterest(p,r,t);
                        System.out.write(("The simple interest on principal Rs. "+ p
                        + " @ "+ r+ "% for "+t
                        +" years is Rs."+df.format(interest)).getBytes());
                        amt = interest + p;
                    System.out.write(("\nThe total amount to be paid is Rs."+df.format(amt)).getBytes());
                    break;
                case 2: interest = calculator.compoundInterest(p,r,t);
                        System.out.write(("The compound interest on principal Rs. "+ p
                            + " @ "+ r+ "% for "+t
                            +" years is Rs."+df.format(interest)).getBytes());
                        amt = interest+p;
                        System.out.write(("\nThe total amount to be paid is Rs."+df.format(amt)).getBytes());
                    break;
                case 3: System.out.write("Program Terminated!!".getBytes());
                        System.exit(0);
                    break;
                default: System.out.write("Wrong choice!!".getBytes());
            }
        }while (choice!=3);
    }
}
