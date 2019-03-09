
package Week8Class2;


public class BookArray {


    public static void main(String[] args) {
        
        Book[] book = new Book[3];
        book[0] = new Book("Book1",1234);
        book[1] = new Book("Book2",2345);
        book[2] = new Book("Book3",3456);
        
        for(int i=0; i< book.length; i++){
            System.out.println(book[i]);
        }
        
        for (Book b: book){
            System.out.println("Book name is "+ b.getName());
            System.out.println("Book ISBN is "+ b.getISBN());
            System.out.println(b.toString());
        }
        
    }
    
}
