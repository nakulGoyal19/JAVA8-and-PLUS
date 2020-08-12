package consumers;

import java.util.function.Consumer;

import predicates.user.User;

/**
 * @author nakulgoyal
 *         11/08/20
 **/
public class ConsumerUse {
    public static void main(String[] args) {
        Consumer<String> toUpperCase = String::toUpperCase;  // of no use (bcz Consumer doesn't return anything)
        Consumer<String> printName = System.out::println;
        
        User user = new User("Nakul Goyal", 21);
        toUpperCase.andThen(printName).accept(user.getName());  //Nakul Goyal
        
    }
}


