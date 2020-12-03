import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {
        intro();
        budget();
        time();
        distance();
    }
    public static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vacation planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
        System.out.print("*********** \n \n");
    }
    public static void budget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        String days_of_traveling = input.nextLine();
        int i = Integer.parseInt(days_of_traveling);  
        System.out.print("How much money, in USD, are you going to spend in your trip? ");
        String money_to_spend = input.nextLine();
        int y = Integer.parseInt(money_to_spend); 
        System.out.print("what are the three letter currency symbol for our travel destination? ");
        String trip_money = input.nextLine();
        System.out.print("how many " + trip_money + " are there in 1 USD? ");
        String multiply_by = input.nextLine();
        double z = Double.parseDouble(multiply_by);
        System.out.println("\n");
        System.out.println("if you travelling for " + i + " days that is the same as " + i*24 + " hours or " + i*24*60 + " minutes");
        double x = Double.parseDouble(money_to_spend);
        String strDouble = String.format("%.2f", x/i);
        System.out.println("if you are going to spend $" + money_to_spend + " USD that means per day you can spend up to $" + strDouble + " USD");
        String strDouble2 = String.format("%.2f", z*y/i);
        System.out.println("your total budget in " + trip_money + " is " +  + z*y + ", which per day is " + strDouble2 + " " + trip_money);
        System.out.print("*********** \n \n");
    }
    public static void time(){
        Scanner input = new Scanner(System.in);
        System.out.print("what is the time difference, in hours, between your home and your destination? ");
        String time_difference = input.nextLine();
    }
    public static void distance(){
        
    }
}