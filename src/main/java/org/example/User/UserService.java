package org.example.User;

import jdk.jshell.spi.ExecutionControl;

import java.util.Collection;

public class UserService {

    public void addUser (User user) {};

    public Collection<User> geUsers () {
        return null;
    };
    public User getUser (String id) {
        return null;
    };

    public User editUser (User user)
        throws ExecutionControl.UserException {
        return user;
    };

    public void deleteUSer (String id) {};

    public boolean userExist (String id) {
        return false;
    };
}
