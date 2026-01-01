package com.objectmodelling.aggregationproblem;

public class AggregationDemo 
{
    public static void main(String[] args) 
    {

        // Creating Book objects (independent)
        Book book1 = new Book("Atomic Habits", "James Clear");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("The Alchemist", "Paulo Coelho");

        // Creating Library objects
        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        // Adding books to libraries
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        collegeLibrary.addBook(book2); // same book in another library
        collegeLibrary.addBook(book3);

        // Display books
        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
}
