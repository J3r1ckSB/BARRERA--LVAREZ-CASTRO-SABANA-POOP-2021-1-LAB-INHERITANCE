/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import lab1.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class TriangleTest {
    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;
    
    @BeforeAll
    public static void setUp() {
        t1 = new Triangle(10);
        t2 = new Triangle(14.5);
        t3 = new Triangle("red", 23.5);
        t4 = new Triangle();
    }
    
     @Test
    public void shouldCalculateArea() {
        assertEquals(314, (int) t1.getArea());
        assertEquals(660, (int) t2.getArea());
        assertEquals(1735, (int) t3.getArea());
        assertEquals(3, (int) t4.getArea());
    }
    
     @Test
    public void shouldCalculateisEquilateral() {

        assertEquals(62, (int) t1.getEquilateral());
        assertEquals(91, (int) t2.getEquilateral());
        assertEquals(147, (int) t3.getEquilateral());
        assertEquals(6, (int) t4.getEquilateral());
    }
    @Test
    public void shouldCalculateisIsoceles() {

        assertEquals(62, (int) t1.getIscoceles());
        assertEquals(91, (int) t2.getIscoceles());
        assertEquals(147, (int) t3.getIscoceles());
        assertEquals(6, (int) t4.getIscoceles());
    }

     public void shouldPrintTriangle() {

        assertEquals("This is a Circle with color NONE and radius 10", t1.toString());
        assertEquals("This is a Circle with color NONE and radius 14.5", t2.toString());
        assertEquals("This is a Circle with color red and radius 23.5", t3.toString());
        assertEquals("This is a Circle with color NONE and radius 1", t4.toString());
    }
   
}
