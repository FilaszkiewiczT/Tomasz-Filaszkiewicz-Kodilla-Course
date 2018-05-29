package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static final String ERR_ZEROLETERS_STRING = "String used to search should have at least one letter";

    public SearchException(String message) {
        super(message);
    }
}