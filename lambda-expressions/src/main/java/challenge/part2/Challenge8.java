package challenge.part2;

import java.util.concurrent.Callable;

/**
 * @author nakulgoyal
 *         17/08/20
 **/
public class Challenge8 {
    public static void main(String[] args) throws Exception {
        Callable<String> callable = () -> "Hello there";
        System.out.println(callable.call());
    }
}


