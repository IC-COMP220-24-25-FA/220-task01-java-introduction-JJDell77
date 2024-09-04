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
        myTriangle.doubleSize();
        assertEquals(24, myTriangle.calcArea());

        myTriangle = new Triangle(5, 8);
        myTriangle.doubleSize();
        assertEquals(80, myTriangle.calcArea());

        myTriangle = new Triangle(2, 100);
        myTriangle.doubleSize();
        assertEquals(400, myTriangle.calcArea());

    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(3, 4);
        assertEquals(5, myTriangle.longestLineWithin(), 0.01);

        myTriangle = new Triangle(5, 8);
        assertEquals(9.43, myTriangle.longestLineWithin(), 0.01);

        myTriangle = new Triangle(2, 100);
        assertEquals(100.01, myTriangle.longestLineWithin(), 0.01);

    }
    
}
