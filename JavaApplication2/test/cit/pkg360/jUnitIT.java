/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mount
 */
public class jUnitIT {
    
    public jUnitIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class jUnit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        jUnit instance = new jUnit();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        jUnit instance = new jUnit();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    //is this what you were expecting? 
    @Test
    public void testAdd3() {
        System.out.println("add");
        String s1 = "-2";
        String s2 = "3";
        jUnit instance = new jUnit();
        int expResult = 1;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd4() {
        System.out.println("add");
        String s1 = "0";
        String s2 = "0";
        jUnit instance = new jUnit();
        int expResult = 0;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    //Hope this is enough!
    @Test
    public void testAdd5() {
        System.out.println("add");
        String s1 = "100";
        String s2 = "342";
        jUnit instance = new jUnit();
        int expResult = 442;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
}
