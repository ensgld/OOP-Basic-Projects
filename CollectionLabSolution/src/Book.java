
public class Book {
	private String title;
	private String author;
	public final String ISBN;
	
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
		
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else {
			if (o instanceof Book) {
				Book book = (Book)o;
				
				return title.equals(book.title) 
						&& author.equals(book.author) 
						&& ISBN.equals(book.ISBN); 
			}
			else
				return false;
		}
	}
	
	@Override
	public int hashCode() {
		return ISBN.hashCode();
	}	

	@Override
	public String toString() {
		return "Title = " + title + ", Author = " + author + ", ISBN = " + ISBN;
	}	
}
