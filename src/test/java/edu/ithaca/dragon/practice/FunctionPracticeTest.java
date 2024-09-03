package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
  import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2)); //tests for the second position in the list
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2)); //tests for the first position in the list
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5)); //tests for the third position in the list
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5)); //tests for multipleoccurances

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1)); //tests for negative detection
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3)); //tests negative detection in second position
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1)); //tests negative detection in third position
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(10, FunctionPractice.calcSalePrice(10, 0, 0));
        assertEquals(5, FunctionPractice.calcSalePrice(10, 50, 0));
        assertEquals(12, FunctionPractice.calcSalePrice(10, 0, 2));
        assertEquals(10, FunctionPractice.calcSalePrice(10, 50, 5));
        assertEquals(0, FunctionPractice.calcSalePrice(0, 0, 0));

    }

    @Test
    public void isGoodDogTest(){
        assertFalse(FunctionPractice.isGoodDog(2, 0, false));
        assertTrue(FunctionPractice.isGoodDog(10, 0, false));
        assertTrue(FunctionPractice.isGoodDog(2, 20, true));

    }

    @Test
    public void findFirstLargestTest(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(0);
        assertEquals(5, FunctionPractice.findFirstLargest(numbers));
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(0);
        numbers1.add(5);
        numbers1.add(0);
        assertEquals(5, FunctionPractice.findFirstLargest(numbers1));
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(0);
        numbers2.add(0);
        numbers2.add(5);
        assertEquals(5, FunctionPractice.findFirstLargest(numbers2));

    }
    
}
