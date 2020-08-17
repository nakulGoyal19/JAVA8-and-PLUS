package challenge.part1;

/**
 * @author nakulgoyal
 *         17/08/20
 **/
public class Challenge1 {
    public static void main (String[] args) {
        Runnable runnable = () -> {
            String myString = "Let's split up this into an array";
            String[] parts = myString.split(" ");
            for(String s : parts) {
                System.out.println(s);
            }
        };
        runnable.run();
    }
}


