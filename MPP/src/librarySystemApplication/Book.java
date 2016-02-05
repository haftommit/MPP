package librarySystemApplication;

import java.util.ArrayList;

public class Book extends Item {

	private String ISBN;
	private ArrayList<String> authorList;
	private int limit;

	public Book(String title, boolean available, String isbn, int limit) {
		super(title, available);
		this.ISBN = isbn;
		this.limit = limit;
		// TODO Auto-generated constructor stub
		authorList = new ArrayList<String>();
	}

	public void addAuthor(String author) {
		authorList.add(author);
	}

}