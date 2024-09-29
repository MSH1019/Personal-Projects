package PersonalTrainingProjects;

import java.util.ArrayList;

public class Book {


    String title;
    String author;
    int year;

    public Book (String title, String author, int year) {

        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void disBook (Book book) {
        System.out.println("the book's title: " + title + " / author's: " + author + " / year: " + year);
    }


    public static void main (String[] args) {
        ArrayList <Book> bookList = new ArrayList<>();

    bookList.add(new Book("The Alchemist", "Paulo Coelho", 1988));
    bookList.add(new Book("1984", "George Orwell", 1949));
    bookList.add(new Book("Clean Code", "Robert C. Martin", 2008));

    for (Book book : bookList) {
        book.disBook(book);
    }

    }
}