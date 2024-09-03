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
    
}
