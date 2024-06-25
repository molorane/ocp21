package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;

class Book implements Comparable<Book> {

    String isbn;
    String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return 0;
    }
}

public class SortIncomparableObj {

    static List<Book> movies = Arrays.asList(new Book("Titanic", "DRAMA"),
            new Book("Psycho", "THRILLER"), new Book("Oldboy", "THRILLER"),
            new Book("Shining", "HORROR"));

    public static void main(String[] args) {
        List<Book> books = movies;
        books.stream()
                .sorted()
                .forEach(b -> System.out.println(b.getIsbn()));
    }

}
