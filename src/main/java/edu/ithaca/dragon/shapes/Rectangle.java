package edu.ithaca.dragon.shapes;

public class Rectangle {
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

    public double doubleSize(){
        double doubleSize = this.length * this.width * 2;
        return doubleSize;
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
