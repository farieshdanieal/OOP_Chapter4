/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author User
 */

//_________________________Interactive____________________________

/*import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num;
        int factorial = 1;
        
        System.out.print("Enter a number to calculate its factorial: ");
        num = reader.nextInt();


        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(num + "! = " + factorial);
    }
} */





//_________________________ non-Interactive____________________________

public class Factorial{

    public static void main(String[] args) {
        int num = 10; //set value as constant
        int factorial = 1; //initialize value

        for (int i = 1; i <= num; i++) { //looping statement
            factorial *= i; //assignment operators to add values where '10' was initialized
        }

        System.out.println(num + "! = " + factorial); //display result
    }
} 
