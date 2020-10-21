package com.thegyrfalcon.gryffindor.functional.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Create a list of Books ( Title, Price, Rating )
 * Sort by Desc (by name)
 * Filter books by Rating.
 */
public class Library {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("The Fellowship of the Ring", 250, 4),
                new Book("The Two Towers", 75, 3),
                new Book("The Return of the King", 250, 4.5)
        );

        Collections.sort(books, (b1, b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("[Displaying books Sorted by descending]");
        printBooks(books, book -> true);

        System.out.println("[Book Price > 100]");
        printBooks(books, book -> book.getPrice() > 100 );

        System.out.println("[Book Rating > 4]");
        printBooks(books, book -> book.getRating() > 4 );



    }

    private static void printBooks(List<Book> books, DisplayCondition condition) {
        for (Book book : books) {
            if (condition.test(book)) {
                System.out.println(book);
            }
        }
    }

}

class Book {

    String title;
    double price;
    double rating;

    public Book(String title, double price, double rating) {
        super();
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

interface DisplayCondition {
    boolean test(Book book);
}
