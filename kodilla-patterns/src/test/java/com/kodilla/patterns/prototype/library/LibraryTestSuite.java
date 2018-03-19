package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");

        Book book1 = new Book("book 1", "author 1", LocalDate.of(2017, 1, 1));
        Book book2 = new Book("book 2", "author 2", LocalDate.of(2017, 1, 1));
        Book book3 = new Book("book 3", "author 3", LocalDate.of(2017, 1, 1));
        Book book4 = new Book("book 4", "author 4", LocalDate.of(2017, 1, 1));
        Book book5 = new Book("book 5", "author 5", LocalDate.of(2017, 1, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println(library.getName() + "- number of books: " + library.getBooks().size());
        System.out.println(clonedLibrary.getName() + "- number of books: " + clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getName() + "- number of books: " + deepClonedLibrary.getBooks().size());

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
