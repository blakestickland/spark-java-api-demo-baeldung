package org.example.User;

import jdk.jshell.spi.ExecutionControl;

import java.util.Collection;

public class UserService {

    public void addUser (User user);

    public Collection<User> geUsers ();
    public User getUser (String id);

    public User editUser (User user)
        throws ExecutionControl.UserException;

    public void deleteUSer (String id);

    public boolean userExist (String id);
}
