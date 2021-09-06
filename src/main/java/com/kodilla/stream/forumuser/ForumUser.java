package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(int userId, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsCount) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int calculatePeriod() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        return period.getYears();
    }

    @Override
    public String toString() {
        return " UserId: " + userId + " {Username: " + username + ", M/F: " + sex + ", birthdate: " + birthDate + ". Post count: " + postsCount + ".}";
    }
}
