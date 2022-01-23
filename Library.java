package uk.ac.gre.comp1549.examples;

import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class
	    String address;   //library adress start
	    private ArrayList<Book> bookList; // array with books list

	    public Library(String address)
	    {
	        this.address = address;
	        bookList = new ArrayList<>();
	    }

	    public static void printOpeningHours()
	    {
	        System.out.println("Libraries are open from 9am to 5pm");
	    }

	    public void printAddress()
	    {
	        System.out.println(this.address);
	    }

	    public void printAvailableBooks()
	    {
	        for (Book b : bookList)
	        {
	            System.out.println(b.getTitle());
	        }
	    }

	    public void addBook(Book book)
	    {
	        bookList.add(book);
	    }

	    public void borrowBook(String title) {
	    	for(Book b:bookList){
				if(title.equals(b.getTitle())){
					if(b.isBorrowed()){
					System.out.println("Sorry, this book is already borrowed");
					return;
				}else{
					b.borrowed();
					System.out.println("You succesfully borrowed"+" " + b.getTitle());
					return;
					}
	    }
	    	}
	    }
	
	    public void returnBook(String title) {
	    	for(Book b:bookList){
				if(title.equals(b.getTitle())){
					b.returned();
					System.out.println("You successfully returned"+ " "+b.getTitle());
				}
	    	}
	    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("Avery Campus");
        Library secondLibrary = new Library("Greenwich Campus");

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