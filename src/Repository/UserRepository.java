package Repository;

import models.User;

import java.util.ArrayList;
import java.util.Arrays;

public class UserRepository {

    private final int ARRAYLENGTH = 1000;
    User[] users = new User[ARRAYLENGTH];

    public User[] createRandomArray(){
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
        }
        return users;
    }


    public void print(User[] users){
        int i = 1;
        for (User user: users
        ) {
            System.out.println(i + "-" + user);
            i++;

        }
    }
}
