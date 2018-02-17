package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfposts;

    public ForumUser(int userId, String name, char sex, LocalDate dateOfBirth, int numberOfposts) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfposts = numberOfposts;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfposts() {
        return numberOfposts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfposts=" + numberOfposts +
                '}';
    }
}
