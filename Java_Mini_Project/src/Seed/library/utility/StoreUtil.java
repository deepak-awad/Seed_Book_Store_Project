package Seed.library.utility;
import Seed.library.Book;

import java.util.*;

public class StoreUtil {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Book> blist = new ArrayList<>();
	
	
	public Book addRecord() {
		
		System.out.println("Enter Books Details");
		System.out.println("Enter Book id :");
		int id = sc.nextInt();
		System.out.println("Enter Book Name");
		String name = sc.next();
		System.out.println("Enter Book Price");
		int price = sc.nextInt();
		
		System.out.println("Enter Book authors:");
		Set authors = new HashSet<>();
		int c;
		 while (true) {
	    	  
	            String aName = sc.next();
	            authors.add(aName);
	            
	            System.out.println("\nEnter More skills (y/n):");
	            c =sc.next().charAt(0);
	            if (c == 'n' || c == 'N')
	            {
	            	break;
	            }
	       }
		 Book b = new Book(id,name,price,authors);
		 blist.add(b);
		return b;
		
	}
	
	public ArrayList<Book> getRecords() {
		
		return blist;
	}
	
	public void getNoOfRecords() {
		
		System.out.println("Number of Books Are : " + blist.size() );
		
	}

}
