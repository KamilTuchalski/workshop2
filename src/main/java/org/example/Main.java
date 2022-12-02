package org.example;

import org.example.User.User;
import org.example.User.UserDao;
import org.mindrot.jbcrypt.BCrypt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Kamil", "kamil@kamil.com", "kmail");
        User user2 = new User("Dorota", "dorota@gmail.com", "dorota");
        User userEdit = new User(7, "Kamil", "Kamil", "kamil");

        UserDao userDao = new UserDao();

        // userDao.create(user2);
        // System.out.println(userDao.read(5));
        // userDao.update(userEdit);
        // userDao.delete(8);
        System.out.println(Arrays.toString(userDao.findAll()));
    }
}