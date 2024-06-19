import java.util.Comparator;

public class CollectionLabTest {
	
	public static void main(String[] args) {
		
		LibraryManager libraryManager = new LibraryManager();
		libraryManager.addBook(new Book("Introduction to Numerical Optimization", "Dimitri P. Bertsekas", "978-1886529199"));
		libraryManager.addBook(new Book("Machine Learning: A Probabilistic Perspective", "Kevin P. Murphy", "978-0262018029"));
		libraryManager.addBook(new Book("Image Processing, Analysis, and Machine Vision", "Milan Sonka", "978-1133593608"));
		libraryManager.addBook(new Book("Point Cloud Data Processing with Applications", "Paolo Cignoni", "978-3030127202"));
		libraryManager.addBook(new Book("Geographic Information Systems: Concepts, Methodologies, Tools, and Applications", "Joseph K. Berry", "978-1466640774"));		

		System.out.println("All the books in the libary:");
		System.out.println(libraryManager);
		
		System.out.println("Search by ISBN: 978-0262018029");
		System.out.println("Search result : " + libraryManager.searchBook("978-0262018029"));
		System.out.println();

		System.out.println("Search by ISBN: 999-0262018029");
		System.out.println("Search result : " + libraryManager.searchBook("999-0262018029"));
		System.out.println();
		
		System.out.println("Remove by ISBN: 978-0262018029");
		Book aBook = libraryManager.searchBook("978-0262018029");
		System.out.println("Remove book : " + libraryManager.removeBook(aBook));
		System.out.println(libraryManager);		
		System.out.println();
		
		System.out.println("Default ordering in the library:");
		for (Book book : libraryManager.getAllBooks()) {
			System.out.println(book);
		}
		System.out.println();
		
		System.out.println("Sorted by the author name:");
		for (Book book : libraryManager.getAllBooks(new BookTitleComparator())) {
			System.out.println(book);
		}
	}

}
