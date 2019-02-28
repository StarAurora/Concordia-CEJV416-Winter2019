package Week7class1;


public class Employee {

protected double fuelCapacity;

    static int lastId= 0;

    int iD;
    String firstName;
    String lastName;
    double salary;
    
    public Employee(String firstName, String lastName, double salary){
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        
        this.iD = Employee.lastId+1;
    }
    
//    public String getfirstName(){
//        return firstName;
//    }
//    
//    public void setfirstName(String firstName){
//        this.firstName = firstName;
//    }
//    
//    public double getweight(){
//        return weight;
//    }
//    
//    public void setweight(double weight){
//        this.weight = weight;
//    }
// 
//    public String getColor(){
//        return color;
//    }
//    
//    public void setColor(String color){
//        this.color = color;
//    }


    
}
