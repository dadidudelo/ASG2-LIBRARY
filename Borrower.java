import java.util.ArrayList;

public class Borrower {
    String name;
    ArrayList<Book> borrowedBooks;
    
    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void displayBorrowedBooks(){
        System.out.println(this.name + "'s Borrowed Books: ");
        for(Book i : borrowedBooks){
            System.out.println("Title: " + i.title);
            System.out.println("ISBN: " + i.isbn);
            System.out.println("Author: " + i.author.name);
            System.out.println("Biography: " + i.author.desc);
            System.out.println("------------------------");
        }
    }
}
