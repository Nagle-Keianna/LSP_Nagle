package org.howard.edu.lsp.assignment2;

public class Library { 
	// Add the missing implementation (methods and data definitions) to this class 
	
	String address;
	Book[] bookLibrary;
	int numOfBooks;

	// Constructor – look it up
	public Library(String title) {
		address = title;
		bookLibrary = new Book[10];
		numOfBooks = 0;
		
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
	firstLibrary.printOpeningHours();
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
	
	//Copying code output to exact match from assigned word doc
	System.out.println("Books available in the first library:");
	firstLibrary.printAvailableBooks();

	   	 }

	private void returnBook(String string) {
		// TODO Auto-generated method stub
		for(int i=0; i<numOfBooks; i++)
			if(bookLibrary[i].getTitle().equals(string))
				if(bookLibrary[i].isBorrowed()) {
					System.out.println("You have successfully returned " + string);
					bookLibrary[i].returned();
					return;
				}
				else {
					System.out.println("This book has not been borrowed.");
					return;
				}
	}

	private void printAvailableBooks() {
		// TODO Auto-generated method stub
		if(numOfBooks == 0)
			System.out.println("No book in catalogue");
		for(int i=0; i<numOfBooks;i++)
			if(!bookLibrary[i].isBorrowed())
				System.out.println(bookLibrary[i].getTitle());
		
	}

	private void borrowBook(String string) {
		// TODO Auto-generated method stub
		for(int i=0; i<numOfBooks; i++)
			if(bookLibrary[i].getTitle().equals(string))
				if(bookLibrary[i].isBorrowed()) {
					System.out.println("Sorry, this book is currently being borrowed.");
					return;
				}
				else {
					System.out.println("You have successfully borrowed " + string);
					bookLibrary[i].borrowed();
					bookLibrary[i].borrowed = true;
					return;
				}
		System.out.println("Sorry, this book is not in our catalog.");
		
	}

	private void printAddress() {
		// TODO Auto-generated method stub
		System.out.println(address);
		
	}

	private void printOpeningHours() {
		// TODO Auto-generated method stub
		System.out.println("Libraries are open daily from 9am to 5pm.");
		
	}

	private void addBook(Book book) {
		// TODO Auto-generated method stub
		bookLibrary[numOfBooks] = book;
		numOfBooks++;
		
	} 
	}

