package com.vogella.android.github.issuetracker;

public class Issue {
    public int id;
    public String title;
    public User user;

    @Override
    public String toString() {
        return id + " - " + title;
    }
}
