package fxn;

import java.util.function.BiFunction;
import java.util.function.Function;

import predicates.user.User;

/**
 * @author nakulgoyal
 *         11/08/20
 **/
public class UserListFxns {
    
    public static final String TOKEN = "*&^&*";
    static Function<User, String> upperCase = user -> user.getName().toUpperCase();
    static Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
    static Function<User, String> userLastName = user -> user.getName().substring(user.getName().indexOf(' ') + 1);
    static Function<String, String> appendToken = name -> name.concat(TOKEN);
    static BiFunction<String, User, String> appendLastName = (var, user) -> var.concat(userLastName.apply(user));
    
    public static void main(String[] args) {
        
        User user = new User("Nakul Goyal", 21);
    
        //chaining fxns.
        String firstNameWithToken = upperCase.andThen(firstName).andThen(appendToken).apply(user);
        String completeNameWithToken = appendLastName.andThen(appendToken).apply(firstNameWithToken, user);
    
        System.out.println("Output :" + completeNameWithToken);  // NAKUL*&^&*Goyal*&^&*
        
    
    }
}



