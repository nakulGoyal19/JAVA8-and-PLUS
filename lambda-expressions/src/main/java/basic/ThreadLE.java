package basic;

/**
 * @author nakulgoyal
 *         08/08/20
 **/
public class ThreadLE {
    public static void main(String[] args) {
        /** Method : 1 */
//        new Thread(new CodeToRun()).start();
    
        /** Method : 2 */
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable inner method.");
//            }
//        }).start();
    
        /** Method : 3 Using lambda-expression */
        new Thread(() -> System.out.println("Printing by using lambda exp.")).start();
    }
}

//class CodeToRun implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("Printing from the runnable class method.");
//    }
//}
