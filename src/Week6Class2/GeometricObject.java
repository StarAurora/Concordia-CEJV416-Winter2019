
package Week6Class2;
import java.util.Date;

public class GeometricObject {

protected String color;
protected boolean filled;
protected Date dateCreated;
 

 GeometricObject(){}
    
    public GeometricObject(String color, boolean filled, Date dateCreated){
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getfilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
        public Date getdateCreated(){
        return dateCreated;
    }
    
    public void setdateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }









}
