class Book {
	String author, title, publisher;
	public Book(String a, String t, String p) {
		author = a;
		title = t;
		publisher = p;
	}
	public void show()	{
		System.out.println("\nAuthor    : " + author);
		System.out.println("Title    : " + title);
		System.out.println("Publisher: " + publisher);
	}
}
class BookInfo extends Book {
	float price; 
	int stock;
	public BookInfo(String a, String t, String p, float pr, int st) {
		super(a, t, p);
		price = pr;
		stock = st;
	}
	public void show() {
		super.show();
		System.out.println("Price: " + price);
		System.out.println("Stock: " + stock);
	}
}
public class MyBookInfo {
	public static void main(String[] args) {
		BookInfo b1 = new BookInfo("Galvin", "OS Concepts", "Unknown", 450, 57);
		b1.show();
	}
}