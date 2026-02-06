package com.collectors;
/*
5. Library Book Statistics
Given a list of books with their genres and number of pages, use
Collectors.summarizingInt()
to find total pages, average pages, and maximum pages per genre.
 */

import java.util.*;
import java.util.stream.Collectors;

public class BookStatistics {

    // Record
    record Book(String title, String genre, int pages) {
        public String getGenre() {
            return genre;
        }
        public int getPages() {
            return pages;
        }
    }

    public static void main(String[] args) {

        List<Book> books = List.of(
            new Book("Clean Code", "Programming", 464),
            new Book("Effective Java", "Programming", 416),
            new Book("The Hobbit", "Fantasy", 310),
            new Book("Harry Potter", "Fantasy", 450),
            new Book("Atomic Habits", "Self-Help", 320)
        );

        Map<String, IntSummaryStatistics> pageStatsByGenre =
            books.stream()
                 .collect(Collectors.groupingBy(
                     Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)
                 ));

        pageStatsByGenre.forEach((genre, stats) -> {
            System.out.println(genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
            System.out.println();
        });
    }
}
