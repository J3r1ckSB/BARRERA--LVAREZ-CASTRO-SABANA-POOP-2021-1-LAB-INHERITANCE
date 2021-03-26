/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Usuario
 */
public class Rectangle extends Shape{
    double width = 1.0;
    double lenght = 1.0;
    
    public Rectangle() {
    }
    
    public Rectangle(String color) {
        super(color);
    }
    public Rectangle(double width, double lenght){
        this.width = 1.0;
        this.lenght = 1.0;
       
    }
    public Rectangle (String color, double width, double lenght){
        super(color);
        this.width = 1.0;
        this.lenght = 1.0;
    }
    public double getDiagonal(){
                               
        return 0;
                               
    }
    @Override
        public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }
}
