/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rikzter
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 6;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 11;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 10;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.sub(a, b);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of mult method, of class Calculator.
//     */
    
    @Test
    public void testMult() {
        System.out.println("mult");
        int a = 5;
        int b = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.mult(a, b);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of main method, of class Calculator.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Calculator.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
