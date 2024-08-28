package Seed.library;
import java.util.*;
public class Book {
	
	int id;
	String name;
	int price;
	Set<String> authors;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String name, int price, Set<String> authors) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.authors = authors;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Set<String> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", authors=" + authors + "]";
	}

}//end of class book