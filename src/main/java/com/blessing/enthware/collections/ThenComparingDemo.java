package com.blessing.enthware.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return genre + ":" + title;
    }


}

public class ThenComparingDemo {

    public static void main(String[] args) {
        var books = new ArrayList<Book>(List.of(new Book("The Outsider", "fiction"),
                new Book("Becoming", "non-fiction"), new Book("Uri", "non-fiction")));
        books.sort(Comparator.comparing(Book::getGenre).thenComparing(Book::getTitle).reversed());
        System.out.println(books);
    }

}
