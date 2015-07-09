package assignment4;
import java.util.ArrayList;

/**
 * MIT6_092 Assignment 4
 * @author yutian
 * @since Jul 8, 2015
 */
public class Library {
    // Add the missing implementation to this class
	
	private String address;
	ArrayList<Book> booklist;
	
	public Library(String a)
	{
		address = a;
		booklist = new ArrayList<>();
	}
	
	public void addBook(Book book)
	{
		booklist.add(book);
	}
	
	public static void printOpeningHours()
	{
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	public void printAddress()
	{
		System.out.println(address.toString());
	}
	
	public void borrowBook(String title)
	{
		boolean find = false;
		
		for (Book b : booklist)
		{
			if (b.getTitle().equals(title))
			{
				if (!b.isBorrowed())
				{
					b.borrowed();
					System.out.println("You successfully borrowed " + title.toString());
					find = true;
				}
				else
					System.out.println("Sorry, this book is already borrowed.");
			}		
		}
		
		if (!find)
			System.out.println("Sorry, this book is not in our catalog.");
	}
	
	public void printAvailableBooks() {
		
		if (booklist.isEmpty())
			System.out.println("No book in catalog");
		else
		{
			for (Book b : booklist)
			{
				if (!b.isBorrowed())
					System.out.println(b.getTitle().toString());
			}
		}
	}
	
	
	private void returnBook(String title) {
		
		for (Book b : booklist)
		{
			if (b.getTitle().equals(title))
			{
				if (b.isBorrowed())
				{
					b.returned();
					System.out.println("You successfully returned " + title.toString());
				}
			}		
		}
	}
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
	
} 