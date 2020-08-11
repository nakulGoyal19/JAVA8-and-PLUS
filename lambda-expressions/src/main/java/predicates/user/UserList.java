package predicates.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author nakulgoyal
 *         09/08/20
 **/
public class UserList {
    public static void main(String[] args) {
        
        User user1 = new User("Nakul", 21);
        User user2 = new User("Ninja", 24);
        User user3 = new User("Ace", 32);
        User user4 = new User("kong", 18);
        
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        Predicate<User> greaterThan30Age = user -> user.getAge() > 30;
        printByAgeCondition(userList, "Users over 30", greaterThan30Age);
        printByAgeCondition(userList, "Users  b/w 20-30", user -> user.getAge() < 30 && user.getAge() > 20);
    
    
    }
    
    public static void printByAgeCondition(List<User> userList, String conditionMessage, Predicate<User> condition) {
        System.out.println(conditionMessage);
        for(User user : userList) {
            if(condition.test(user)) {
                System.out.println(user.toString());
            }
        }
    }
}

