package CleanCode;

import java.io.IOException;
import java.util.Scanner;

public class ConstructionCostApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ConstructionCost cost = new ConstructionCost();
        int choice;
        do{
            System.out.write("\nEnter area of house: ".getBytes());
            int area = sc.nextInt();
            System.out.write("**** Material Standards ****\n".getBytes());
            System.out.write("1. Standard Material Rs.1200/sq feet\n".getBytes());
            System.out.write("2. Above Standard Material Rs.1500/sq feet\n".getBytes());
            System.out.write("3. High Standard Material Rs.1800/sq feet\n".getBytes());
            System.out.write("4. High Standard Material and Fully Automated Rs.2500/sq feet\n".getBytes());
            System.out.write("5. Exit\n".getBytes());
            choice = sc.nextInt();
            switch (choice){
                case 1:  System.out.write(("The total cost of standard material for house of area " + area +" sq feet is Rs." + cost.standardHouseCost(area)).getBytes());
                    break;
                case 2:  System.out.write(("The total cost of above standard material for house of area " + area +" sq feet is Rs." + cost.aboveStandardHouseCost(area)).getBytes());
                    break;
                case 3:  System.out.write(("The total cost of high standard material for house of area " + area +" sq feet is Rs." + cost.highStandardHouseCost(area,false)).getBytes());
                    break;
                case 4:  System.out.write(("The total cost of high standard material and fully automated house of area " + area +" sq feet is Rs." + cost.highStandardHouseCost(area,true)).getBytes());
                    break;
                case 5:  System.out.write("Program Terminated!!".getBytes());
                         System.exit(0);
                    break;
                default: System.out.write("Wrong choice!!".getBytes());
            }
        }while(choice!=5);
    }
}
