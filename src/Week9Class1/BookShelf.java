
package Week9Class1;

import java.util.ArrayList;

/**
 *
 * @author j_zho11
 */
public class BookShelf {
    
    ArrayList<Book> books = new ArrayList<>();
    
    public int getSize()
    {
        return this.books.size();
    }
    
    public void addBook(Book b)
    {
        this.books.add(b);    
    }
 
    public void removeBook(Book b)
    {
        this.books.remove(b);
    }
    
    public String listBooks(Book b)
    {
    StringBuilder s = new StringBuilder();
    
    for(Book c : this.books){
        s.append(b.getName()+"\n");
    }
    
    return s.toString();
    }
}
