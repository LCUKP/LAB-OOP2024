/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    
    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
            default:
                break;
        }
    }
    public void removeBook(int slot) {
        switch (slot) {
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
            default:
                break;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println();
        if (book1 != null) {
            book1.printDetails();
            System.out.println("");
        } else {
            System.out.println("No book in this slot.\n");
        }
        if (book2 != null) {
            book2.printDetails();
            System.out.println("");
        } else {
            System.out.println("No book in this slot.\n");
        }
        if (book3 != null) {
            book3.printDetails();
            System.out.println("");
        } else {
            System.out.println("No book in this slot.\n");
        }
    }
    public void checkBookAvailability(int slot) {
        switch (slot) {
            case 1 : 
                System.out.println(book1.isAvailable ? book1.title + " is available." : "Book in slot " + slot + "is not available.");
                break;
            case 2 : 
                System.out.println(book2.isAvailable ? book2.title + " is available." : "Book in slot " + slot + "is not available.");
                break;
            case 3 : 
                System.out.println(book3.isAvailable ? book3.title + " is available." : "Book in slot " + slot + "is not available.");
                break;
            default:
                break;
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        if ((slot == 1) & (book1 != null)) {
            book1.price = newPrice;
            System.out.println("Updated price of " + book1.title + " to $" + book1.price + ".");
        } else if ((slot == 2) & (book2 != null)) {
            book2.price = newPrice;
            System.out.println("Updated price of " + book2.title + " to $" + book2.price + ".");
        } else if ((slot == 3) & (book3 != null)) {
            book3.price = newPrice;
            System.out.println("Updated price of " + book3.title + " to $" + book3.price + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book){
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
    }
}
