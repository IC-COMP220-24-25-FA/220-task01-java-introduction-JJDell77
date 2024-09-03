package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3, 4);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(6, myTriangle.calcArea(), 0.0001);
        
        myTriangle = new Triangle(5, 8);
        assertEquals(20, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(2, 100);
        assertEquals(100, myTriangle.calcArea(), 0.0000000001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3, 4);
        assertEquals(12, myTriangle.doubleSize());

        myTriangle = new Triangle(5, 8);
        assertEquals(40, myTriangle.doubleSize());

        myTriangle = new Triangle(2, 100);
        assertEquals(200, myTriangle.doubleSize());

    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(3, 4);
        assertEquals(5, myTriangle.longestLineWithin());

        myTriangle = new Triangle(5, 8);
        assertEquals(9.43, myTriangle.longestLineWithin());

        myTriangle = new Triangle(2, 100);
        assertEquals(141.42, myTriangle.longestLineWithin());

    }
    
}
