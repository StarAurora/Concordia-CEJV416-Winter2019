
package Week8Class1;


public class GradeTester {


    public static void main(String[] args) {
        
        StandardGrade sg = new StandardGrade();
        sg.grade=40;
        
        if(evaluateGrade(sg))
        {
            System.out.println("Student passed the course");
        }
        else{
            System.out.println("Student failed the course");
        }
            
    }
    
    public static boolean evaluateGrade(IGrade g){
        
        if (g.getGradeValue()>60){
            return true;
        }
        return false;
    }
}
