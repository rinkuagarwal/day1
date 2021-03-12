import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;


public class ListDemo {
	public static void main(String[] args) {
		//demo1();
		bookList();
		
		
		
	}
		private static void bookList() {
		List<Book> books=new ArrayList<Book>();
//trying for printing book price
		Book book1=new Book("learn java");
		book1.setPrice(100.0f);
		book1.setPublishYear(2020);
		books.add(book1);
		Book book2=new Book("tech java");
		book2.setPrice(10.0f);
		book2.setPublishYear(2021);
		books.add(book2);
		System.out.println(books);
//where adding book in a list
			//books.add(new Book("learn java"));
			//books.add(1);
			//books.add(new Book(" javaScript"));
			//books.remove(1);
//sorting
//sort the book in ascending order of price
//			books.sort(new Comparator<Book>() {
//
//				@Override
//				public int compare(Book book1, Book book2) {
//					return (int)(book1.getPrice()-book2.getPrice());//type casting done here
//				}
//				
//			});
//sort the book in ascending order of publisher year
			books.sort(new Comparator<Book>() {

				@Override
				public int compare(Book book1, Book book2) {
					return (int)(book1.getPublishYear()-book2.getPublishYear());//type casting done here
				}
				
			});
			System.out.println(books);
//printing the books that contain learn words			
		//iterator <Book> it=books.iterator();
			//while (it.hasNext()) {//iterating the books list
				//Book book =  it.next();
				//if(book.getTitle().contains("learn")) {//prints the words that have learn in it
					//System.out.println(book);
				//}
						//}
	}
		private static void demo1() {
		List<Integer> list=new ArrayList<Integer>();//to remove yellow lines we used generic method
		list.add(1);
		list.add(3);
		list.add(2, 5);
		//list.add("Ram");//this will not be added after specify the data type
		System.out.println("before"+list);
		//list.remove(2);
		
		System.out.println(list.contains(5));
		System.out.println("After"+list);
		//we have used for with iterate over collection here
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		
		}
		}

}
