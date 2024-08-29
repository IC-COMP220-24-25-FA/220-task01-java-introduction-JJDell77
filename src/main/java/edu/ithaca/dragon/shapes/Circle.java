package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = 3.14159 * this.radius * this.radius;
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public double doubleSize(){
        double newRadius = this.radius * 2;
        return newRadius;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double diameter = this.radius * 2;
        return diameter;
    }
}
