package guvi.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SpecialStudent {
    public static void main(String[] args) {
        //Create list and add 10 student names
        List<String> studNames=new ArrayList<>(10);
        studNames.add("Jane");
        studNames.add("Julie");
        studNames.add("Edward");
        studNames.add("Johnson");
        studNames.add("Johny");
        studNames.add("Smith");
        studNames.add("Alan");
        studNames.add("Hopper");
        studNames.add("Jaden");
        studNames.add("Alexender");
        
       //lambda expression and stream api (filter)
        Predicate<String> SpecStu=i->i.toLowerCase().startsWith("a");
        List<String> selStud=studNames.stream().filter(SpecStu).collect(Collectors.toList());
        
        //Print the names starts with 'A'        
        System.out.println(selStud);


    }
}
