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
public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

  

    public Triangle() {
    }
    
    public Triangle(String color) {
        super(color);
    }
    public Triangle(double side){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
        
    }
    public Triangle (String color, double side1, double side2, double side3 ){
        super(color);
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    
    }
    public boolean isIsosceles(){
        return false;                       
    }
        public boolean isEquilateral(){
        return false;                       
    }
    @Override
        public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }
    
    
    
}
