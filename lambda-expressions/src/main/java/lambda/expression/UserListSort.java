package lambda.expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author nakulgoyal
 *         08/08/20
 **/
public class UserListSort {
    public static void main(String[] args) {
    
        User user1 = new User("Nakul", 21);
        User user2 = new User("Ninja", 24);
        User user3 = new User("Ace", 22);
        User user4 = new User("kong", 18);
    
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
    
        /** Mehtod : 1 */
//        Collections.sort(userList, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//        });
        
        /** Method : 2 lambda-expression */
        Collections.sort(userList, (u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()));
        
//        for(User user : userList) {
//            System.out.println(user.toString());
//        }
        /** for-each loop */
        userList.forEach(user -> System.out.println(user.toString()));
    
    }
}

class User {
    private String name;
    private Integer age;
    
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Name : " + this.getName() + ", Age : " + this.getAge();
    }
}


