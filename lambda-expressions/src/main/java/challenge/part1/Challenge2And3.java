package challenge.part1;

import java.util.function.Function;

/**
 * @author nakulgoyal
 *         17/08/20
 **/
public class Challenge2And3 {
    public static Function<String, String> everySecondChar = (s) -> {
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i< s.length(); i++) {
            if(i%2 == 1)
                returnVal.append(s.charAt(i));
        }
        return returnVal.toString();
    };
    public static void main (String[] args) {
        System.out.println(everySecondChar.apply("1234567890"));
    }
}


