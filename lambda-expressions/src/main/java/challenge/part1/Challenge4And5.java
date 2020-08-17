package challenge.part1;

import java.util.function.Function;

/**
 * @author nakulgoyal
 *         17/08/20
 **/
public class Challenge4And5 {
    
    public static String everySecondCharacter(Function<String, String> fxn, String s) {
        return fxn.apply(s);
    }
    public static void main (String[] args) {
        System.out.println(everySecondCharacter(Challenge2And3.everySecondChar, "123456789"));
    }
}


