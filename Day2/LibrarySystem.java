//Create a program to manage a library system using OOP concepts, including classes for Book, Member, and Librarian.

package Day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Book {

    String title;
    String author;
    String isbn;
    int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public void borrowBook() {
        if (copies > 0) {
            copies--;
        } else {
            System.out.println("Sorry, '" + title + "' is not available.");
        }
    }

    public void returnBook() {
        copies++;
    }

    public void printBookDetails() {
        System.out.println(title + " by " + author + " (ISBN: " + isbn + ") - Copies available: " + copies);
    }
}

class Member {
    String name;
    String memberId;
    List<Book> borrowedBooks;
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.copies > 0) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed '" + book.title + "'.");
        } else {
            System.out.println("Sorry, '" + book.title + "' is currently unavailable.");
        }
    }
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned '" + book.title + "'.");
        } else {
            System.out.println(name + " has not borrowed '" + book.title + "'.");
        }
    }
    public void printMemberDetails() {
        System.out.print("Member: " + name + " (ID: " + memberId + ") - Borrowed books: ");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.print(book.title + ", ");
            }
            System.out.println();
        }
    }
}
class Librarian {
    String name;
    List<Book> catalog;

    public Librarian(String name) {
        this.name = name;
        this.catalog = new ArrayList<>();
    }
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Added '" + book.title + "' to the catalog.");
    }
    public void removeBook(Book book) {
        if (catalog.contains(book)) {
            catalog.remove(book);
            System.out.println("Removed '" + book.title + "' from the catalog.");
        } else {
            System.out.println("'" + book.title + "' is not in the catalog.");
        }
    }
    public void viewCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (Book book : catalog) {
            book.printBookDetails();
        }
    }
    public void printLibrarianDetails() {
        System.out.println("Librarian: " + name);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Librarian librarian = new Librarian("Alice");
        Book book1 = new Book(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        Book book2 = new Book(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        Book book3 = new Book(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);
        librarian.viewCatalog();
        Member member = new Member(sc.nextLine(), sc.nextLine());
        member.borrowBook(book1);
        member.borrowBook(book2);
        member.printMemberDetails();
        member.returnBook(book1);
        member.printMemberDetails();
        librarian.viewCatalog();
    }
}

