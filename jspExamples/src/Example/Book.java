package Example;

public class Book {
	private String book_title;
	private String author;
	private String publisher;
	private String year_of_publication;

	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear_of_publication() {
		return year_of_publication;
	}
	public void setYear_of_publication(String year_of_publication) {
		this.year_of_publication = year_of_publication;
	}
	@Override
	public String toString() {
		return "Book [book_title=" + book_title + ", author=" + author + ", publisher=" + publisher
				+ ", year_of_publication=" + year_of_publication + "]";
	}

	
}
