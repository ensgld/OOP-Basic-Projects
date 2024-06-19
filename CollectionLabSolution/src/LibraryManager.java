import java.util.*;

public class LibraryManager {
	private Map<String, Book> books = new HashMap<>();
	
	boolean addBook(Book book) {
		if (book != null)
			return books.put(book.ISBN, book) == null;
		else
			return false;
	}
	
	boolean removeBook(Book book) {
		if (book != null)
			return books.remove(book.ISBN) != null;
		else
			return false;
	}	
	
	boolean removeBook(String ISBN) {
		Book book = searchBook(ISBN);
		
		if (book != null)
			return books.remove(book.ISBN) != null;
		else
			return false;
	}	
	
	Book searchBook(String ISBN) {
		if (ISBN != null && books.containsKey(ISBN))
			return books.get(ISBN);
		else
			return null;
	}
	
	Book[] getAllBooks() {
		return getAllBooks(null);
	}
	
	Book[] getAllBooks(Comparator<Book> comparator) {
		Book[] bookArray = new Book[books.size()];
		int index = 0;
		for (Book book : books.values()) {
			bookArray[index] = book;
			index++;
		}
		
		if (comparator != null) {
			Arrays.sort(bookArray, comparator);
		}
		
		return bookArray;
	}
	
	@Override
	public String toString() {
		String bookString = "";
		
		for (Book book : books.values()) {
			if (book != null) {
				bookString += book + "\n";
			}
		}
		
		return bookString;
	}
}
