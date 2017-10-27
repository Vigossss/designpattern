package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList implements Iterable<Book>{
	private List<Book> books = new ArrayList<Book>();
	
	private int index = 0;
	
	public void add(Book book){
		books.add(book);
	}
	
	public void delete(Book book){
		int i = books.indexOf(book);
		books.remove(i);
	}
	
	@Override
	public Iterator iterator(){
		return new Itr();
	}
	
	private class Itr implements Iterator{

		@Override
		public boolean hasNext() {
			return books.size() > index;
		}

		@Override
		public Object next() {
			return books.get(index++);
		}

		@Override
		public void remove() {
			
		}
		
	}
}
