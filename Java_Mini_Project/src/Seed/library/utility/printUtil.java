package Seed.library.utility;
import Seed.library.*;
import java.util.ArrayList;

public class printUtil {
	
	public static void printRecords(ArrayList<Book> book) {
		
		for(Book b : book) {
			System.out.println(b);
		}
		
	}

}
