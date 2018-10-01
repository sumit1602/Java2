//import java.io.Serializable;
//
//class Book implements Serializable {
//    private int bookId;
//    private String isBookAvailable;
//    private String title,author;
//    private Double price;
//
//    public Book(int bookId, String title, String author, Double price) {
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", isBookAvailable='" + isBookAvailable + '\'' +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface issue{
    void issueBooks();
    void alreadyIssuedBooks();
}
interface return_book{
    void haveToReturn();
    void returend_Books();
    void total_Balance();
}
class Library implements issue,return_book{
    @Override
    public void issueBooks() {
        List<String> Books=new ArrayList<String>();
        Books.add("DBMS");
        Books.add("SQL");
        Books.add("JAVA");
        Books.add("DAA");
        Books.add("gradle");
        Books.add("linux");
       Scanner sc=new Scanner(System.in);
       String input1=sc.next();
       boolean ans = Books.contains(input1);
       if(ans){
            System.out.println("BOOK IS AVAILABLE YOU CAN ISSUE IT");
      }
       else{
          System.out.println("BOOK IS NOT AVAILABLE YOU CANNOT ISSUE IT");
       }
    }

    @Override
    public void alreadyIssuedBooks() {

    }

    @Override
    public void haveToReturn() {

    }

    @Override
    public void returend_Books() {

    }

    @Override
    public void total_Balance() {

    }
    void DisplayBooks(){
        List<String> Books=new ArrayList<String>();
        Books.add("DBMS");
        Books.add("SQL");
        Books.add("JAVA");
        Books.add("DAA");
        Books.add("gradle");
        Books.add("linux");
        System.out.println("Books available in library are :");
        for(String x: Books){
            System.out.println(x);
        }
    }
}
//class Login
//{
//    private int id;
//    private String password;
//    public Login(int id, String password) {
//        this.id = id;
//        this.password = password;
//    }
//    public int getId() {
//        return id;
//    }
//    public String getPassword() {
//        return password;
//    }
//}
class Q1LibraryManagementSystem extends Library{
    public static void main(String[] args) {
//        Login L=new Login(111,"****"){
//        };
        Library l = new Library();

        l.DisplayBooks();
        l.issueBooks();

    }
}
