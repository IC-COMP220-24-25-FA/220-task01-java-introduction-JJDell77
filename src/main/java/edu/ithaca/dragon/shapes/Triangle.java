package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calcArea(){
        return base * height / 2;
    }

    public double doubleSize(){
        return calcArea() * 2;

    }

    public double longestLineWithin(){
        return Math.sqrt(((base * base) + (height * height)));
    }
    
    /*
     * The method should return a String that says the shape that it is and information about the side lengths or the radius (depending on the shape).
     */

     public String toString(){
        return "This is a Triangle with a Base of:" + base + " and a Height of:" + height;

    }

}
