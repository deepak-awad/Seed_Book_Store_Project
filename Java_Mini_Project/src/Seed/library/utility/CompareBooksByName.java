package Seed.library.utility;
import java.util.Comparator;

import Seed.library.Book;

public class CompareBooksByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		String n1 = o1.getName();
		String n2 = o2.getName();
		return n1.compareTo(n2);
	}

}
