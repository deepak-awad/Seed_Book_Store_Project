package Seed.library.utility;
import java.util.Comparator;

import Seed.library.Book;

public class CompareBooksByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int p1 = o1.getPrice();
		int p2 = o2.getPrice();
		if(p1>p2)
			return 1;
		else if(p1< p2)
			return -1;
		return 0;
	}

}
