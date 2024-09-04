package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
        
        /*create a list that holds shapes
        Create a loop that adds 10 shapes to the list, choosing randomly between whether each shape is a Circle, Rectangle, or triangle.
        Print each shape (by calling toString on the Shape).
        Then, write a loop that doubles the size of each shape and prints them again.
        */

        List<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        // Create 10 random shapes (Circle, Rectangle, Triangle)
        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); // 0: Circle, 1: Rectangle, 2: Triangle
            if (shapeType == 0) {
                shapes.add(new Circle(5 + random.nextDouble() * 10));
            } else if (shapeType == 1) {
                shapes.add(new Rectangle(5 + random.nextDouble() * 10, 5 + random.nextDouble() * 10));
            } else {
                shapes.add(new Triangle(5 + random.nextDouble() * 10, 5 + random.nextDouble() * 10));
            }
        }
        
        // Print original shapes
        System.out.println("Original Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        // Double size of each shape
        System.out.println("\nDoubled Shapes:");
        for (Shape shape : shapes) {
            shape.doubleSize();
            System.out.println(shape);
        }
        
        
        
        
        
        
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
