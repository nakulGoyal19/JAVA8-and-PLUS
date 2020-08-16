package streams.flatmap;

import java.util.ArrayList;
import java.util.List;

import predicates.user.User;

/**
 * @author nakulgoyal
 *         16/08/20
 **/
public class Course {
    
    private String name;
    private List<User> users;
    
    public Course(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
}


