
package Week8Class1;

/**
 *
 * @author j_zho11
 */
public class TestBook {


    public static void main(String[] args) {
        Book book1 = new Book("Dune", 1234);
        Book book2 = new Book("Dune", 1234);
        Book book3 = new Book("The Joy of Cooking", 2345);
    
        if(book1.equals(book2)){
            System.out.println("Book1 = Book2");
        }
        if(book2.equals(book3)){
            System.out.println("Book2 = Book3");
        }
        else{
            System.out.println("Book2 not equals to Book3");
        }
    
    }
    
}
