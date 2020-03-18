/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

/**
 *
 * @author joshm
 */
import java.util.Scanner;

public class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
        public int mult(int a, int b){
            return a * b;
        }

	public static final void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Calculator:");

            System.out.println("Press 'a' for addition, 'b' for subraction:");
            String input = scan.nextLine();
            
            if(input.equals("a"))
            {
                System.out.println("Enter first number:");
                int num1 = scan.nextInt();
                System.out.println("Enter second number:");
                int num2 = scan.nextInt();
                
                int result = add(num1, num2);
                System.out.println(result);
                
            }
            //System.out.println(input);
            
                
	}
}