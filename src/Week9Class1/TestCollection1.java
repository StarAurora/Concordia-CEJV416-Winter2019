
package Week9Class1;

import java.util.ArrayList;


public class TestCollection1 {


    public static void main(String[] args) {
        
        BookShelf bookshelf = new BookShelf();
        
        String Book[]={};
        Book book1 = new Book("ABC", 65 );
        Book book2 = new Book("BCD", 95 );
        Book book3 = new Book("CDE", 125 );
        
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        
        bookshelf.removeBook(book2);

        System.out.println(bookshelf.listBooks());
        
    }
    
    
    
    
    
    
    
}
