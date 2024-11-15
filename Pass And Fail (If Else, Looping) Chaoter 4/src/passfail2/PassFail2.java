/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passfail2;

/**
 *
 * @author User
 */
import java.util.Scanner;  //Library for user input

public class PassFail2 {         
    
    public static void main(String[] args) {
        int stuPass = 0; //initialize for passing student
        int stuFail = 0; //initialize for failing student
        int noStu; //Total of student that the user will input
        
        Scanner reader = new Scanner(System.in); //create an object called reader

        System.out.print("Enter the number of students: "); //instruction for user
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
        }
        reader.close(); // Close scanner               
    }
}
