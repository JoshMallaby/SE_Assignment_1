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
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public static final void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Calculator:");

            System.out.println("Press 'a' for addition, 'b' for subraction:");
            String input = scan.nextLine();
            
            System.out.println(input);
            
                
	}
}
