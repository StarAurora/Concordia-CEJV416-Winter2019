package Week7class1;

public class Truck extends Vehicle{
    
    private boolean hasTrailer;

    
    public Truck(double fuelCapacity, double weight, String color, boolean hasTrailer){
        super(fuelCapacity, weight, color);
        this.hasTrailer = hasTrailer;
    }
    
    
    public boolean gethasHitch(){
        return hasTrailer;
    }
    
    public void sethasTrailer(boolean hasTrailer){
        this.hasTrailer = hasTrailer;
    }
    public double getDistance(){
        return super.getDistance()-250;
    }     
    public String toString()
    {
        return "This object is a truck, it has a fuel capacity of "+ this.fuelCapacity +" and it's color is "+ this.color;
        
    }    
}
