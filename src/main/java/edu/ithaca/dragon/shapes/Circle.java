package edu.ithaca.dragon.shapes;


public class Circle  implements Shape{
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
        if (radius <= 0){
            throw new IllegalArgumentException("Must be positive radius");
        }
    }
public double getRadius(){
    return radius;
}


    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI * radius * radius;
        
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        radius = radius * 2;
        
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return radius * 2;
    }

/*
     * The method should return a String that says the shape that it is and information about the side lengths or the radius (depending on the shape).
     */

     public String toString(){
        return "This is a Circle with a radius of:" + radius;

    }

} 
