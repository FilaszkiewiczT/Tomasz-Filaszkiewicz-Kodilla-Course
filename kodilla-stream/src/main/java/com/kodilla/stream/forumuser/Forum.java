package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1980, 1, 1), 10));
        forumUserList.add(new ForumUser(2, "Marcin", 'M', LocalDate.of(1990, 2, 1), 200));
        forumUserList.add(new ForumUser(3, "Tomek", 'M', LocalDate.of(2000, 3, 1), 0));
        forumUserList.add(new ForumUser(4, "Wojtek", 'M', LocalDate.of(2005, 4, 1), 3));
        forumUserList.add(new ForumUser(5, "Anna", 'M', LocalDate.of(2003, 6, 1), 100));
        forumUserList.add(new ForumUser(6, "Dominika", 'F', LocalDate.of(1990, 6, 1), 5));
        forumUserList.add(new ForumUser(7, "Sylwia", 'F', LocalDate.of(2000, 7, 1), 4));
        forumUserList.add(new ForumUser(8, "Monika", 'F', LocalDate.of(2005, 8, 1), 0));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);
    }

}
