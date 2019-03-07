
package Week8Class1;


public abstract class StandardGrade implements IGrade {
    
    
    double grade;
    
    public double getValueGrade(){
    return grade;
    }
    public String getLetterGrade(){
        if(grade>90){
            return "A";
        }
        if(grade>80){
            return "B";
        }
        if(grade>70){
            return "C";
        }
        return "F";
    }
}
