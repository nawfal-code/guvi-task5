package guvi.task5;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maptask1 {
    public static void main(String[] args) {
        //given input
        Stream names= Stream.of("aBc","d","ef");
        //convert String to uppercase
        Function<String,String> upCase=i->i.toUpperCase();
        //use map method
        System.out.println( names.map(upCase).collect(Collectors.toList()));
    }
}
