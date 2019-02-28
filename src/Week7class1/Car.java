package Week7class1;

public class Car extends Vehicle{
    
    private boolean hasHitch;

    
    
    public Car(double fuelCapacity, double weight, String color, boolean hasHitch){
        super(fuelCapacity, weight, color);
        this.hasHitch = hasHitch;


    }
    
    
    public boolean gethasHitch(){
        return hasHitch;
    }
    
    public void sethasHitch(boolean hasHitch){
        this.hasHitch = hasHitch;
    }
    
    public double getDistance(){
        return super.getDistance();
    } 
    
        public String toString()
    {
        return "This object is a car, it has a fuel capacity of "+ this.fuelCapacity +" and it's color is "+ this.color;
        
    }
        protected String getDescription(){
            return "I am a car and I'm a consumer vehicle.";
        }
        
}
