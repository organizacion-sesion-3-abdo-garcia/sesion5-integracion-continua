/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

 import org.junit.jupiter.api.AfterEach;
 import org.junit.jupiter.api.AfterAll;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.BeforeAll;
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 
 /**
  *
  * @author abdo
  */
 public class NumeroParTest {
 
     public NumeroParTest() {
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
 
     // TODO add test methods here.
     // The methods must be annotated with annotation @Test. For example:
     //
     // @Test
     // public void hello() {}
     @Test
     public void testEsPar() {
         assertTrue(NumeroPar.esPar(2), "el 2 és parell");
         assertFalse(NumeroPar.esPar(3), "el 3 és imparell");
         assertTrue(NumeroPar.esPar(0), "el 0 és parell");
         assertFalse(NumeroPar.esPar(-1), "el -1 és imparell");
     }
 
 }
 
