
package Week6Class2;
import java.util.Date;

public class Triangle extends GeometricObject {
 
    private double slide1 = 1;
    private double slide2 = 1;
    private double slide3 = 1;
    
    public Triangle(double slide1,double slide2,double slid3 ){
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }
    
    public Triangle(String color, boolean filled, Date dateCreated, double slide1, double slide2, double slide3){
        super(color, filled, dateCreated);
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }
    public double getslide1(){
        return slide1;
    }
    public void setslide1(double slide1){
        this.slide1 = slide1;
    }
    public double getslide2(){
        return slide2;
    }
    public void setslide2(double slide2){
        this.slide2 = slide2;
    }
    public double getslide3(){
        return slide3;
    }
    public void setslide3(double slide3){
        this.slide3 = slide3;
    }
    
}