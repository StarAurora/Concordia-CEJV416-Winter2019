package Week7class1;


public class Vehicle {

protected double fuelCapacity;
    protected double weight;
    protected String color;

    
    public Vehicle(double fuelCapacity, double weight, String color){
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
        this.color = color;

    }
    
    protected abstract String getDescription();
    
    
    
    public double getfuelCapacity(){
        return fuelCapacity;
    }
    
    public void setfuelCapacity(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }
    
    public double getweight(){
        return weight;
    }
    
    public void setweight(double weight){
        this.weight = weight;
    }
 
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    
    protected double getDistance(){
        return this.fuelCapacity * 10.00;
    } 
    
    
}
