package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        Scanner scanner = new Scanner(System.in);
        for (int u = 0; u < 5; u++){

            List<Rectangle> rectangles = new ArrayList<>();
            int position = 1;
            

            for (int i = 0; i < 5; i++){
                Rectangle newRectangle = new Rectangle(Math.random(), Math.random());
                rectangles.add(newRectangle);
            }

            for (Rectangle rectangle: rectangles) {
                System.out.println("Rectangle" + position + "'s Area:" + rectangle.calcArea());
                System.out.println("Rectangle" + position + "'s largest line:" + rectangle.longestLineWithin());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                position++;

            }

            System.out.println("Which rectangle would you like to change?");
            String choice = scanner.nextLine();
            int choiceInt = Integer.parseInt(choice);
            choiceInt--;
            Rectangle UserPick = rectangles.get(choiceInt);
            UserPick.doubleSize();

            position = 1;
            for (Rectangle rectangle: rectangles) {
                System.out.println("Rectangle" + position + "'s Area:" + rectangle.calcArea());
                System.out.println("Rectangle" + position + "'s largest line:" + rectangle.longestLineWithin());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~");
                position++;

        }

    }



        scanner.close();
    }
}
