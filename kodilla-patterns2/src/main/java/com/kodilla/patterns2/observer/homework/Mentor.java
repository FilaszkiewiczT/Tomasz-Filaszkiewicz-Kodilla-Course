package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskList taskList) {
        System.out.println(mentorName + ": New tasks to check from " + taskList.getName() + "\n" +
                " total: " + taskList.getTasks().size() + " tasks");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
