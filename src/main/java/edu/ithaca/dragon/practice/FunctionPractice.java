package edu.ithaca.dragon.practice;

import java.util.List;


public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0) {
            throw new IllegalArgumentException("All numbers must be non-negative");
        }
        if (first > second && first > third){
            return first;
        }   else if (second > first && second > third){
                return second;
        }   else if (third > first && third > second){
                return third;
        }   else {
                return first;
        }
        
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double discountPrice = originalPrice - (originalPrice * (discountPercent / 100));
        return discountPrice + salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld > 6){
            return true;
        }   else if (daysSinceShoesChewed == 0 && fetchedThePaperToday == false){
            return false;
        }   else {
            return true;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int largestNumberPosition = 0;
        int largestNumber = 0;
        for (int i=0; i < numbers.size(); i++){
            if (numbers.get(i) > largestNumber){
                largestNumber = numbers.get(i);
                largestNumberPosition = i;
            }
        }
        return largestNumberPosition;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int largestNumberPosition = 0;
        int largestNumber = 0;
        for (int i=0; i < numbers.size(); i++){
            if (numbers.get(i) >= largestNumber){
                largestNumber = numbers.get(i);
                largestNumberPosition = i;
            }
        }
        return largestNumberPosition;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        if (words == null) {
            throw new IllegalArgumentException("The list cannot be null");
        }

        String mostOccurrences = null;
        int maxCount = -1;

        for (String word : words) {
            if (word == null) {
                continue; // Skip null strings in the list
            }

            int count = 0;
            for (char c : word.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostOccurrences = word;
            }
        }

        return mostOccurrences;
    }
}



