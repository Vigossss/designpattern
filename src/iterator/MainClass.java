package iterator;

import java.util.Iterator;

/**
 * 迭代模式
 * 行为模式
 * 对容器中的内部对象的访问委托给外部类，
 * 按顺序遍历访问的设计模式
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * Iterator 迭代器接口
	 * ConcreteIterator 迭代器接口实现
	 * Aggregate 容器接口
	 * ConcreteAggregate 容器接口实现
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BookList books = new BookList();
		
		Book book1 = new Book("010203", "java编程思想", 100F);
		Book book2 = new Book("010204", "010204", 50F);
		
		books.add(book1);
		books.add(book2);
		
		Iterator it = books.iterator();
		Book book = null;
		while(it.hasNext()){
			book = (Book)it.next();
			book.display();
		}
	}
}
