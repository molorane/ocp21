package com.blessing.enthware.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book1 {
    private String title;
    private String genre;

    public Book1(String title, String genre) {
        this.title = title;
        this.genre = genre;
    } // accessors not shown

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
}

public class Demo5 {

    static List<Book1> books = Arrays.asList(new Book1("Gone with the wind", "Fiction"),
            new Book1("Bourne Ultimatum", "Thriller"), new Book1("The Client", "Thriller"));

    public static void main(String[] args) {
        List<String> genreList = new ArrayList<>();


        books.stream().map(Book1::getGenre).forEach(s -> genreList.add(s));
        //genreList = books.stream().map(Book1::getGenre).collect(Collectors.toList());

        books.stream().map(Book1::getGenre).forEach(genreList::add);
        books.stream().map(b -> b.getGenre()).forEach(genreList::add);

    }

}
