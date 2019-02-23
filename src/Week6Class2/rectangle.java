
package Week6Class2;

import java.util.Date;


public class rectangle extends GeometricObject{
    private double width;
    private double height;
    
    rectangle(){}
    
//    public rectangle(double width, double height){
//        this.width = width;
//        this.height = height;
//    }
    public rectangle(String color, boolean filled, Date dateCreated,double width, double height){
        super(color, filled, dateCreated);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }


    public double getArea(){
        double area;
        area = width*height;
        return area;
    }
    
    
    public double getPerimeter(){
        double perimeter;
        perimeter = 2 * (width+height);
        return perimeter;
    }
    
    
}
