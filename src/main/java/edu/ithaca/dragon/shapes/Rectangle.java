package edu.ithaca.dragon.shapes;

public class Rectangle  implements Shape{
    private double width;
    private double length;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       double area = this.length * this.width;
       return area;
    }

    public void doubleSize(){
        length = length * 2;
        width = width * 2;
       /* 
        double doubleSize = this.length * this.width * 2;
        return doubleSize;
        */
    }

    public double longestLineWithin(){
        if (this.width > this.length){
            return this.width;
        }
        else{
            return this.length;
        }

    }

    /*
     * The method should return a String that says the shape that it is and information about the side lengths or the radius (depending on the shape).
     */

    public String toString(){
        return "This is a Rectangle with a width of:" + width + " and a length of:" + length;

    }
    
}
