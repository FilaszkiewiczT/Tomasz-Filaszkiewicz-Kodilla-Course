package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        //Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("tekst nr 1", text -> "Tekst Nr 1"));
        System.out.println(poemBeautifier.beautify("X", text -> text.replace("X", "New text")));
        System.out.println(poemBeautifier.beautify("a,b,c,d,e", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("TOMEK", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("    Tekst     ", text -> text.trim()));
        System.out.println(poemBeautifier.beautify("123X ", (text) -> text.substring(0).replace("X", "456789")));
        //The end

        //Zadanie 7.3
        System.out.println("\nZadanie 7.3\n");
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isAfter(LocalDate.of(1998, 1, 1)))
                .filter(forumUser -> forumUser.getNumberOfposts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));
        forumUserMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .forEach(System.out::println);
        //The end


        //Mod: 7.3
/*
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
*/
 /*       BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
*/

    }
}