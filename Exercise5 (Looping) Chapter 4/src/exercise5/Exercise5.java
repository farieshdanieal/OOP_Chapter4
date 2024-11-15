/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise5;

/**
 *
 * @author User
*/ 


/* import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        float salary = 600.00f; // constant value for base income
        float chPrice = 5.00f; // constant value for Chicken Burger
        float bfPrice = 6.00f; // constant value for Beef Burger
        float chsPrice = 6.50f; // constant value for Cheese Burger
        float sales; // initialize sales
        boolean resume = true; 
        String prompt;
        
        // Displaying menu below
 
        while (resume) {
            System.out.println("------------------------------------");
            System.out.println("|     Welcome to Pak Mat Burger     |");
            System.out.println("------------------------------------");
            System.out.println("|         List of beverages         |");
            System.out.println("|   1. Chicken Burger : RM 5.00     |");
            System.out.println("|   2. Beef Burger    : RM 6.00     |");
            System.out.println("|   3. Cheese Burger  : RM 6.50     |");
            System.out.println("_____________________________________");
            System.out.println("");
        
            System.out.print("Enter number of Chicken Burger sold: "); // input from user
            float chBgr = reader.nextFloat(); // scan from user
        
            System.out.print("\nEnter number of Beef Burger sold: "); // input from user
            float bfBgr = reader.nextFloat(); // scan from user
        
            System.out.print("\nEnter number of Cheese Burger sold: "); // input from user
            float chsBgr = reader.nextFloat(); // scan from user
        
            sales = (chPrice * chBgr) + (bfPrice * bfBgr) + (chsPrice * chsBgr); // formula for sales earned
            float commission = 0.05f * sales; // commission formula
            float totalEarning = commission + salary; // total earning formula
        
            System.out.println("\nSales This Week: RM " + sales); // call back variable for display
            System.out.format("Commission: RM %.2f\n", commission); // call back variable for display
            System.out.println("Total Earning: RM " + totalEarning); // call back variable for display
        
            System.out.print("\nContinue Program? (yes/no): ");
            prompt = reader.next();
        
            if (prompt.equalsIgnoreCase("no")) { // user choose to continue or exit
                resume = false;
                reader.close(); // close reader
            }
        }
    }
} */





//_____________________________Program 2_________________________

//import java.util.Scanner;
//public class Exercise5 {
//    public static void main(String[] args) {
//        boolean resume = true; //for continuing or exiting the sequence
//        Scanner reader = new Scanner(System.in); //create an object named reader     
//
//        while (resume == true) { //looping statement
//            int totalEven = 0; //initialize even value
//            int totalOdd = 0; //initialize odd value
//            int totalnum; //initialize total sequence 
//            int integer; //initialize number to put in a sequence
//            String prompt; //for yes and no question
//
//            System.out.print("\nEnter your sequence limit: "); //instruction for user
//            totalnum = reader.nextInt();//scan from user
//            
//            System.out.println("\nInsert your Integer below\n"); //Display instruction
//            for (int i = 0; i < totalnum; i++) { //looping statement to input integer
//
//                System.out.print("Integer " + (i + 1) + ": "); //Instruction for user
//                integer = reader.nextInt(); //scan from user
//                if (integer % 2 == 0) { //Even if it can be divided by 2
//                    totalEven++;
//                } else {// Else, odd
//                    totalOdd++;
//                }
//            }
//            System.out.println("Total of even integers: " + totalOdd); // call back variable for display
//            System.out.println("Total of odd integers: " + totalEven); //call back variable for display
//            System.out.print("\nContinue the program? (Yes(y)/No(n)): "); //call back variable for display
//            System.out.print(""); //spacing
//            prompt = reader.next(); //for looping the program
//            resume = prompt.equalsIgnoreCase("y"); //program will loop if y is inserted
//        }
//        reader.close(); //close reader
//    }
//}




//_____________________________Program 3_________________________

import java.util.Scanner;  //Library for user input

public class Exercise5 {         
    
    public static void main(String[] args) {
        int stuPass = 0; //initialize for passing student
        int stuFail = 0; //initialize for failing student
        int noStu; //Total of student that the user will input
        boolean resume = true;
        Scanner reader = new Scanner(System.in); //create an object called reader
        String prompt;

        while (resume){
        System.out.print("\nEnter the number of students: "); //instruction for user
        noStu = reader.nextInt(); // scan input from user

        for (int i = 1; i <= noStu; i++) { //set an increment based on user input
            System.out.print("Enter marks for student " + i + " (0-100): ");
          int marks = reader.nextInt(); //scan marks from user

           if (marks > 39) { //create a condition for pass and fail grades
              stuPass++; //increment for pass
          } else {
              stuFail++; //increment for fail
          }
       }
       
          System.out.println("\nTotal students who passed: " + stuPass); //call back variable for display
          System.out.println("Total of students who failed: " + stuFail); // call back variable for display                
          if (stuPass > (noStu / 2)) { //create a condition if more than 50% passed
          System.out.println("Bonus to instructor!"); //Display this statement if it satisfy the condition
          System.out.print("\nContinue Program? (yes/no): ");
          prompt = reader.next();
          if(prompt.equalsIgnoreCase("no")){//user choose to continue or exit
          resume = false;
          reader.close(); //close reader
        } 

          }   
    }}
}