package Seed.LibraryMain;
import java.util.*;

import Seed.library.Book;
import Seed.library.utility.*;

/*** Book Main Project ***/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		try {
			
			Book[] b1 = new Book[100];
			ArrayList<Book> book = new ArrayList<>();
			StoreUtil su1 = new StoreUtil();
			
		do {
			System.out.println("\n****ADD Book Detials**");
		System.out.println("\nBooks Library");
		System.out.println("1) Add books in storeutil \n"
				+ "2) Get no of books \n"
				+ "3) Print list of books \n"
				+ "4) Sort Book by name in asending order \n"
				+ "5) Sort Book by price in asendiing order \n"
				+ "0) Exit");
		
		System.out.println("Enter your choice : ");
		ch = sc.nextInt();
		
		switch(ch) {
		case 1 : 
			Book b2 = su1.addRecord();
			book.add(b2);
			System.out.println("Book added Succesfully");
			break;
			
		case 2:
			System.out.println("Get no of bookd");
			su1.getNoOfRecords();
			break;
			
		case 3:
			// print al book details from array list
			System.out.println("Print all Books Details ");
			printUtil.printRecords(book);
			break;
			
		case 4:
			//Sort by name in asending order
			Collections.sort(book, new CompareBooksByName());
			
			 System.out.println("Sorted Books by Name:");
			    for (Book b : book) {
			        System.out.println(b);  
			    }
			    
		case 5:
			//sort by price in asending order
			Collections.sort(book,new CompareBooksByPrice());
			
			System.out.println("Sorted Books by Price:");
			Iterator<Book> itr1 = book.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
		
		    default:
		    	System.out.println("Invalid Choice");
			
		}//end switch case
		
		}while(ch != 0);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			
		}
	}//end of main

}//end of class