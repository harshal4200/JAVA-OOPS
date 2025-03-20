package Encapsulation.LibraryBookManagement;

public class Book {

  private String title;
  private String author;
  private String ISBN;
  private int availableCopies;

  Book(String title, String author, String ISBN, int availableCopies){
    this.title=title;
    this.ISBN=ISBN;
    this.author=author;
    this.availableCopies=availableCopies;
  }

  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public String getIsbn(){
    return ISBN;
  }
  public int getAvailableCopies(){
    return availableCopies;
  }

  public void borrowBook(){
    if(availableCopies > 0){
      availableCopies --;
      System.out.println("Book borrow successfully");
    }else{
      System.out.println("No copies are available to borrow");
    }
  }
  public void returnBook(){
    
      availableCopies++;
      System.out.println("Book recieve Successfully");
    
  }
  public void displayBookInfo() {
    System.out.println("\nBook Details:");
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + ISBN);
    System.out.println("Available Copies: " + availableCopies);
}
}
  

class Test{
  public static void main(String[] args) {
    Book book = new Book("Java Programming","Jonathan","24455755-775",3);

    book.displayBookInfo();

    // Borrow a book
    book.borrowBook();
    book.displayBookInfo();

    // Borrow two more books
    book.borrowBook();
    book.borrowBook();
    book.displayBookInfo();

    // Trying to borrow when no copies are available
    book.borrowBook();

    // Returning a book
    book.returnBook();
    book.displayBookInfo();
    
  }
}