package Week7class1;

public class Bus extends Vehicle{
    


    
    
    public Bus(double fuelCapacity, double weight, String color){
        super(fuelCapacity, weight, color);
    }
    
    public double getDistance(){
        return super.getDistance()-100;
    } 
        public String toString()
    {
        return "This object is a bus, it has a fuel capacity of "+ this.fuelCapacity +" and it's color is "+ this.color;
        
    }
}
