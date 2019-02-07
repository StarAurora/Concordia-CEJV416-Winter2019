
package Week4Class1;
import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Pease enter a province code of Canada");
             String provinceCode = sc.next();
             String pc = "";
             
             switch(provinceCode.toLowerCase()){   
              case"ab":
                  pc= "Alberta";
                  break;
              case"bc":
                  pc= "British Columbia";
                  break;
                 case"mb":
                  pc= "Manitoba";
                  break;
                  case"nb":
                  pc= "New Brunswick";
                  break;
                  case"nl":
                  pc= "NewFoundLand";
                  break;
                  case"ns":
                  pc= "Nova Scotia";
                  break;

                  default:
                      pc="??";
             }
        System.out.println("The province is:"+pc);     
    }
    
}
