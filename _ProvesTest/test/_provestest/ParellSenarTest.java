

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package _provestest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdo
 */
public class ParellSenarTest {
    
    public ParellSenarTest() {
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
     * Test of parell method, of class ParellSenar.
     */
    @Test
    public void testParell() {
        System.out.println("parell");
   
        assertEquals(true, ParellSenar.parell(2));
        assertEquals(false, ParellSenar.parell(1));
        assertEquals(true, ParellSenar.parell(0));
        assertEquals(false, ParellSenar.parell(-1));
   

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
