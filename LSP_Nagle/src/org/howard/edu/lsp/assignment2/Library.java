package org.howard.edu.lsp.assignment2;

public class Library { 
	// Add the missing implementation (methods and data definitions) to this class 

	// Constructor – look it up
	public Library(String title) {
		// Implement the constructor
	}

	public static void main(String[] args) { 
	// Create two libraries 
	Library firstLibrary = new Library("10 Main St."); 
	Library secondLibrary = new Library("228 Liberty St."); 

	// Add four books to the first library 
	firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
	firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 

	// Print opening hours and the addresses 
	System.out.println("Library hours:");
	firstLibrary.printOpeningHours(); 
	System.out.println();
	System.out.println("Library addresses:"); 
	firstLibrary.printAddress(); 
	System.out.println("Library hours:");
	secondLibrary.printOpeningHours(); 
	System.out.println(); 
	System.out.println("Library addresses:"); 
	secondLibrary.printAddress(); 

	// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
	firstLibrary.borrowBook("The Lord of the Rings"); secondLibrary.borrowBook("The Lord of the Rings"); 
	System.out.println(); 

	// Print the titles of all available books from both libraries System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
	System.out.println(); 
	System.out.println("Books available in the second library:"); secondLibrary.printAvailableBooks(); 
	System.out.println(); 

	// Return The Lords of the Rings to the first library 
	System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); 
	System.out.println(); 
	   	 }

	private void returnBook(String string) {
		// TODO Auto-generated method stub
		
	}

	private void printAvailableBooks() {
		// TODO Auto-generated method stub
		
	}

	private void borrowBook(String string) {
		// TODO Auto-generated method stub
		
	}

	private void printAddress() {
		// TODO Auto-generated method stub
		
	}

	private void printOpeningHours() {
		// TODO Auto-generated method stub
		
	}

	private void addBook(Book book) {
		// TODO Auto-generated method stub
		
	} 
	}

