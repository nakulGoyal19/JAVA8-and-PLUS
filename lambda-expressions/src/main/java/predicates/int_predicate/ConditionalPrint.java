package predicates.int_predicate;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

/**
 * @author nakulgoyal
 *         09/08/20
 **/
public class ConditionalPrint {
    public static void main(String[] args) {
        IntPredicate greaterThan100 = (val) -> val > 100;
        IntPredicate lessThan200 = (val) -> val < 200;
        
        System.out.println(greaterThan100.test(40));  //false
        System.out.println(greaterThan100.test(140));  //true
        System.out.println(greaterThan100.and(lessThan200).test(140));  //true
        System.out.println(greaterThan100.or(lessThan200).test(300));  //true
        System.out.println(greaterThan100.negate().test(110));  //false
        
        //  Same for LongPredicate
        LongPredicate greaterThan100L = (val) -> val > 100L;
        System.out.println(greaterThan100L.test(200L));  //true
    
    }
}


