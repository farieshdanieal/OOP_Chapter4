/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequenceoddeven;



import java.util.Scanner;
public class SequenceOddEven {
    public static void main(String[] args) {
        boolean resume = true; //for continuing or exiting the sequence
        Scanner reader = new Scanner(System.in); //create an object named reader     

        while (resume == true) { //looping statement
            int totalEven = 0; //initialize even value
            int totalOdd = 0; //initialize odd value
            int totalnum; //initialize total sequence 
            int integer; //initialize number to put in a sequence
            String prompt; //for yes and no question

            System.out.print("\nEnter your sequence limit: "); //instruction for user
            totalnum = reader.nextInt();//scan from user
            
            System.out.println("\nInsert your Integer below\n"); //Display instruction
            for (int i = 0; i < totalnum; i++) { //looping statement to input integer

                System.out.print("Integer " + (i + 1) + ": "); //Instruction for user
                integer = reader.nextInt(); //scan from user
                if (integer % 2 == 0) { //Even if it can be divided by 2
                    totalEven++;
                } else {// Else, odd
                    totalOdd++;
                }
            }
            System.out.println("Total of even integers: " + totalOdd); // call back variable for display
            System.out.println("Total of odd integers: " + totalEven); //call back variable for display
            System.out.print("\nContinue the program? (Yes(y)/No(n)): "); //call back variable for display
            System.out.print(""); //spacing
            prompt = reader.next(); //for looping the program
            resume = prompt.equalsIgnoreCase("y"); //program will loop if y is inserted
        }
        reader.close(); //close reader
    }
}
