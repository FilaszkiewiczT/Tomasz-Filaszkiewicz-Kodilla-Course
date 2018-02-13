package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfComments;
    private int numberOfPosts;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfComments = statistics.commentsCount();
        this.numberOfPosts = statistics.postsCount();
        if (numberOfUsers > 0) {
            this.avgPostPerUser = (double)numberOfPosts / (double)numberOfUsers;
        }
        if (numberOfUsers > 0) {
            this.avgCommentPerUser = (double)numberOfComments / (double)numberOfUsers;
        }
        if (numberOfPosts > 0) {
            this.avgCommentPerPost = (double)numberOfComments / (double)numberOfPosts;
        }

    }

    public void ShowStatistics() {
        System.out.println("Forum User Statistics:\n" + "1. Number of Users: " + numberOfUsers + "\n2. Number of comments: "
                + numberOfComments + "\n3. Number of posts: " + numberOfPosts + "\n4. Avg number of posts per User: "
                + avgPostPerUser + "\n5. Avg number of comments per User: " + avgCommentPerUser +
                "\n6. Avg number of comments per Post: " + avgCommentPerPost);

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}
