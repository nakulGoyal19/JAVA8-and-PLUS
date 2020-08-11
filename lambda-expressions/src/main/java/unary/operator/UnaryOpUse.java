package unary.operator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

import predicates.user.User;

/**
 * @author nakulgoyal
 *         11/08/20
 **/
public class UnaryOpUse {
    public static void main(String[] args) {
        
        User u = new User("Nakul Goyal", 20);
        UnaryOperator<User> incrementAgeBy1 = user -> {
            user.setAge(user.getAge() + 1);
            return user;
        };
        System.out.println(incrementAgeBy1.apply(u)); // Name : Nakul Goyal, Age : 21
        
        IntUnaryOperator incrementValueBy1 = i -> i + 1;
        System.out.println(incrementValueBy1.applyAsInt(10)); // 11
    }
}


