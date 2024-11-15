/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class Fibonacci {
    
 
    public static void main(String[] args) {
        int list; //user input for cycles
        int firstnum = 0; //initialize first value
        int secondnum = 1; //initialize second value
        
        Scanner reader = new Scanner(System.in); //create object for Scanner
        
        System.out.print("Enter number of cycle for Fibonacci Sequence: "); //input for user
        list = reader.nextInt(); //read input from user
        
        System.out.println("\nFibonacci Numbers:"); //display plain text
        
        for (int i = 1; i <= list; i++) { //looping statement
            System.out.println(firstnum + " "); //display result

            int nextseq = firstnum + secondnum; //formula for fibonacci; a + b = c
            firstnum = secondnum; //a = b
            secondnum = nextseq; //b = c
        }
    }
    
}
