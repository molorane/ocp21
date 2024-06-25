package com.blessing.lambdafunctions;

import java.util.function.Consumer;

class Book {
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

public class BookDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Consumer<Book> c = new Consumer<Book>() {

            @Override
            public void accept(Book t) {
                // TODO Auto-generated method stub
                t.getTitle().charAt(t.getId());
            }
        };

        Consumer<Book> c1 = new Consumer<Book>() {

            @Override
            public void accept(Book t) {
                // TODO Auto-generated method stub
                t.getTitle();
            }
        };
    }

}
