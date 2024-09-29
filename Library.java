package PersonalTrainingProjects;

import java.util.ArrayList;

public class Library {


String title;
    String author;
    int year;

    public Library (String title, String author, int year) {

        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void disBook (Library book) {
        System.out.println("the book's title: " + title + " / author's: " + author + " / year: " + year);
    }


    public static void main (String[] args) {
        ArrayList <Library> bookList = new ArrayList<>();

    bookList.add(new Library("The Alchemist", "Paulo Coelho", 1988));
    bookList.add(new Library("1984", "George Orwell", 1949));
    bookList.add(new Library("Clean Code", "Robert C. Martin", 2008));

    for (Library book : bookList) {
        book.disBook(book);
    }

    }
}