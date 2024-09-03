package edu.ithaca.dragon.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class RectangleTest {


    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(1, 2);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(2, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(5, 2);
        assertEquals(10, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(5, 10);
        assertEquals(50, myRectangle.calcArea(), 0.0000000001);
    }
/* 
    @Test
    public void doubleAreaTest(){
        Rectangle myRectangle = new Rectangle(1, 2);
        assertEquals(4, myRectangle.doubleSize());

        myRectangle = new Rectangle(5, 2);
        assertEquals(20, myRectangle.doubleSize());

        myRectangle = new Rectangle(5, 10);
        assertEquals(100, myRectangle.doubleSize());

    }
        */

    @Test
    public void longestSideWithinTest(){
        Rectangle myRectangle = new Rectangle(1, 2);
        assertEquals(2, myRectangle.longestLineWithin());

        myRectangle = new Rectangle(5, 2);
        assertEquals(5, myRectangle.longestLineWithin());

        myRectangle = new Rectangle(5, 10);
        assertEquals(10, myRectangle.longestLineWithin());

    }
    
}
