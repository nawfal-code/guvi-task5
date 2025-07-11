package guvi.task5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        //given input
        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        
        //to check wheather the String in the class is empty or not
        Predicate<String> checkEmpty = s -> !s.isEmpty();
        
        //print the list having non empty string
        List<String> l=list.stream().filter(checkEmpty).collect(Collectors.toList());
        System.out.println("List that have non empty string: "+l);
    }
}
