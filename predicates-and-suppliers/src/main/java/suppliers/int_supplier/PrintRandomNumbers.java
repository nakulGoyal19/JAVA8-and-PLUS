package main.java.suppliers.int_supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @author nakulgoyal
 *         09/08/20
 **/
public class PrintRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        
        //        for(int i=0; i < 10; i++) {
        //            System.out.println(random.nextInt(100));
        //        }
        
        Supplier<Integer> randomSupplier = () -> random.nextInt(100);
        for(int i=0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}


