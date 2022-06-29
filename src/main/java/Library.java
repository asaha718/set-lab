import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private static HashMap<String, Book> collectionOfBooks = new HashMap<>();
    public static Set<String> setOfGenres = new HashSet<String>();

    public static HashMap<String, Book> showLibraryCollection() {
        return Library.collectionOfBooks;
    }

    public static void addBook(String genre, String title, Book book) {
        Library.collectionOfBooks.put(title, book);
        setOfGenres.add(genre); 
        
    }

}
