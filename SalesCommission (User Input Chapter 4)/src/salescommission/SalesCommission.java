/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salescommission;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class SalesCommission {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        float salary = (float)600.00; //constant value for base income
        float chPrice = (float)5.00; //constant value for Chicken Burger
        float bfPrice = (float)6.00; //constant value for Beef Burger
        float chsPrice = (float)6.50; //constant value for Cheese Burger
        float sales; //initialize sales
        
        //Displaying meny below
 
        System.out.println("------------------------------------");
        System.out.println("|     Welcome to Pak Mat Burger     |");
        System.out.println("------------------------------------");
        System.out.println("|         List of beverages         |");
        System.out.println("|   1. Chicken Burger : RM 5.00     |");
        System.out.println("|   2. Beef Burger    : RM 6.00     |");
        System.out.println("|   3. Cheese Burger  : RM 6.50     |");
        System.out.println("_____________________________________");
        System.out.println("");
        
        System.out.print("Enter number of Chicken Burger sold: "); //input from user
        float chBgr = reader.nextFloat(); //scan from user
        
        System.out.print("\nEnter number of Beef Burger sold: "); //input from user
        float bfBgr = reader.nextFloat(); //scan from user
        
        System.out.print("\nEnter number of Cheese Burger sold: "); //input from user
        float chsBgr = reader.nextFloat(); //scan from user
        
        sales = (chPrice * chBgr) + (bfPrice * bfBgr) + (chsPrice * chsBgr); //formula for sales earned
        float commission = (float)0.05 * sales; //commission formula
        float totalEarning = commission + salary; //total earning formula
        
        System.out.println("\nSales This Week: RM " +sales); //call back variable for display
        System.out.format("Commision: RM %.2f\n", commission); //call back variable for display
        System.out.println("Total Earning: RM " +totalEarning); //call back variable for display
        
        reader.close(); //close reader
    } 
     
}
