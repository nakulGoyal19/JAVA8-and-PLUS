package streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author nakulgoyal
 *         13/08/20
 **/
public class StreamUse {
    public static void main(String[] args) {
        List<String> randomValuesList = Arrays.asList("N1", "n2", "N3", "n2", "N4", "n3",
                                                      "A1", "A2", "a6",
                                                      "K3", "K4",
                                                      "U1", "U3",
                                                      "L2");
        randomValuesList.stream()
                        .map(String::toUpperCase)
                        .filter(s -> s.startsWith("N"))
                        .sorted()
                        .distinct()
                        .forEach(System.out::println); // N1 N2 N3 N4
    
        List<String> startingWithN = randomValuesList.stream()
                                                     .map(String::toUpperCase)
                                                     .filter(s -> s.startsWith("N"))
                                                     .sorted()
                                                     .distinct()
                                                     .collect(Collectors.toList());

        System.out.println(startingWithN); // [N1, N2, N3, N4]

        Stream<String> randomStream = Stream.of(startingWithN.get(0), startingWithN.get(1));
        long count = randomStream.peek(System.out::println).skip(1).count(); // N1 N2
        System.out.println(count); // 1
    }
}


