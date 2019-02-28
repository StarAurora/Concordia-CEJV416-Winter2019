
package Week7class1;


public class Testvehicle {


    public static void main(String[] args) {
        
    Car c = new Car(50,2000,"Silver",false);
    Bus b = new Bus(125,8000,"Yellow");
    Truck t = new Truck(200,15000,"Black",true);
    
    
    System.out.println(c.toString());
    System.out.println(b.toString());
    System.out.println(t.toString());
    }
    
}
