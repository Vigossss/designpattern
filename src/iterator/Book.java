package iterator;

public class Book {
	private String ISBN;
	private String name;
	private Float price;
	
	public Book(String iSBN, String name, Float price) {
		ISBN = iSBN;
		this.name = name;
		this.price = price;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Book [ISBN=" + ISBN + ", name=" + name + ", price=" + price
				+ "]");
	}
	
}
