package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> list = new ArrayList<>();

    public Forum() {
        list.add(new ForumUser(1, "donner", 'M',
                2002,6,30, 111 ));
        list.add(new ForumUser(2, "pigeon", 'F',
                1991,02,15,39));
        list.add(new ForumUser(3, "markie", 'F',
                1974, 5,19, 25));
        list.add(new ForumUser(4, "donPerdido", 'M',
                1989,8,3, 19));
        list.add(new ForumUser(5, "flaskMan", 'M',
                1996,3,3, 105));

        }
        public List<ForumUser> getUserList() {
            return new ArrayList<>(list);
    }

}
