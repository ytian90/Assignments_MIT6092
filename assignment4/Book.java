package assignment4;

/**
 * MIT6_092 Assignment 4
 * @author yutian
 * @since Jul 8, 2015
 */
public class Book {

    String title;
    boolean status;

    // Creates a new Book
    public Book(String bookTitle) {

    	title = bookTitle;
    	status = false;
    }
   
    // Marks the book as rented
    public void borrowed() 
    {
    	status = true;
    }
   
    // Marks the book as not rented
    public void returned() 
    {
    	status = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() 
    {
        return status;
    }
   
    // Returns the title of the book
    public String getTitle() 
    {
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 