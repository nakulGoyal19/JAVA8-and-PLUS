package challenge.part1;

import java.util.function.Supplier;

/**
 * @author nakulgoyal
 *         17/08/20
 **/
public class Challenge6And7 {
    public static Supplier<String> iLoveJava = () -> "I Love Java";
    public static void main (String[] args) {
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }
}


