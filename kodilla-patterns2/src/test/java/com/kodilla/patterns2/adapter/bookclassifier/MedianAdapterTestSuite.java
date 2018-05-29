package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 2001, "1");
        Book book2 = new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", 2002, "2");
        Book book3 = new Book("J.K. Rowling", "Harry Potter and the Prisoner of Azkaban", 2004, "3");
        Book book4 = new Book("J.K. Rowling", "Harry Potter and the Goblet of Fire", 2005, "4");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(publicationYearMedian, 2004, 0);
    }
}
