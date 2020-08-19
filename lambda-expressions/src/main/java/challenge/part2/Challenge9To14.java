package challenge.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author nakulgoyal
 *         19/08/20
 **/
public class Challenge9To14 {
    public static void main(String[] args) {
        List<String> topNames = Arrays.asList("Nakul", "Amelia", "Olivia", "emily",
                                              "Isla", "Ava", "Oliver", "jack", "charlie");
        
//        List<String> result = new ArrayList<>();
//        topNames.forEach(name -> result.add(name.substring(0, 1).toUpperCase().concat(name.substring(1))));
//        result.sort(String::compareTo);
//        result.forEach(System.out::println);
        
        topNames.stream()
                .map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1)))
                .sorted()
                .forEach(System.out::println);
    
        System.out.println(topNames.stream()
                                   .filter(s -> s.startsWith("A") || s.startsWith("a"))
                                   .count());
    
        topNames.stream()
                .map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1)))
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());
    }
}


