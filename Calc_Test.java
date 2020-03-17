/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_test;

/**
 *
 * @author Rikzter
 */
public class Calc_Test {

    /**
     * @param args the command line arguments
     */
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }

    public static void main(String[] args) {
        int num1,num2,answerAdd,answerMult,answerDiv,answerSub;
        
        num1 = 6;
        num2 = 5;
        answerAdd = add(num1,num2);
        answerSub = sub(num1,num2);
        
        System.out.println(num1 + " + " + num2 + " = " + answerAdd);
        System.out.println(num1 + " - " + num2 + " = " + answerSub);
    }
}
