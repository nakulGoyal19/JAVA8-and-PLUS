package streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import predicates.user.User;

/**
 * @author nakulgoyal
 *         16/08/20
 **/
public class FlatMapUse {
    public static void main(String[] args) {
        User user1 = new User("Nakul", 21);
        User user2 = new User("Ninja", 24);
        User user3 = new User("Ace", 32);
        User user4 = new User("kong", 19);
    
        Course java = new Course("JAVA");
        Course cpp = new Course("CPP");
        Course cn = new Course("CN");
    
        java.addUser(user1);
        java.addUser(user2);
        cpp.addUser(user1);
        cpp.addUser(user3);
        cn.addUser(user1);
        cn.addUser(user2);
        cn.addUser(user4);
    
        List<Course> courses = Arrays.asList(java, cpp, cn);
        long countOfUsers = courses.stream()
               .flatMap(course -> course.getUsers().stream())
               .distinct()
               .count();
        System.out.println("Total Users : " + countOfUsers);  // 4
    
        List<User> finalUserList = courses
                .stream()
                .flatMap(course -> course.getUsers().stream())
                .distinct()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    
        System.out.println(finalUserList.get(0)); // Name : Nakul, Age : 21
    
        Map<Integer, List<User>> userMap = courses
                .stream()
                .flatMap(course -> course.getUsers().stream())
                .distinct()
                .collect(Collectors.groupingBy(User::getAge));
        
        System.out.println(userMap.get(24)); // [Name : Ninja, Age : 24]
    
        courses.stream()
               .flatMap(course -> course.getUsers().stream())
               .reduce(((u1, u2) -> u1.getAge() < u2.getAge() ? u1 : u2))
               .ifPresent(System.out::println);  // Name : kong, Age : 19
    }
}


