import java.util.*;




public class BookCollection {

	private ArrayList<Book> books = new ArrayList<>();
    private int capacity;

    public BookCollection() {
   

        this.capacity = 20;
    }

    public BookCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
    	if(books.size() != capacity) {
    		books.add(book);
    	}
    }
 

    public Book findBookbyName(String title) {
    	for (Book s : books) { 		      
            if(s.getBookName().equals(title)) return s;
       }
    	return null;
    }
    public Book findBooksByAuth(String auth) {
    	for (Book s : books) { 		      
            if(s.getBookAuthor().equals(auth)) return s;
       }
    	return null;
    }
}

