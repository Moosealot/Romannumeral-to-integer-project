/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication24;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Moose
 */
public class JavaApplication24Test {
    
    public JavaApplication24Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test Single value value method, of class JavaApplication24.
     */
    @Test
    public void testsingleValue() {
        System.out.println("value");
        char r = 'V';
        JavaApplication24 instance = new JavaApplication24();
        int expResult = 5;
        int result = instance.value(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        /**
     * Test Many values value method, of class JavaApplication24.
     */
    @Test
    public void testmanyValues() {
        System.out.println("value");
        char r = 'IV';
        JavaApplication24 instance = new JavaApplication24();
        int expResult = 4;
        int result = instance.value(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        /**
     * Test invalid value value method, of class JavaApplication24.
     */
    @Test
    public void testinvalidValue() {
        System.out.println("value");
        char r = 'K';
        JavaApplication24 instance = new JavaApplication24();
        int expResult = 0;
        int result = instance.value(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
