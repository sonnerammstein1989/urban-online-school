import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    static final String input = new String(
            "Привет, Александр, с праздником, с Новым Годом");

    public static void main(String[] args){

        List<String> tmp = Stream.of(String.valueOf(" "+input).split(" ")
        ).map(String::toUpperCase).collect(Collectors.toList());

        String res = tmp.stream().reduce(
        (out, x)->{
            if(x.startsWith("С"))   return out.concat(" "+x);
            if(x.startsWith("ПРА")) return out.concat(" "+x);
                String start = String.valueOf(x.charAt(0)).toLowerCase();
                String end = String.copyValueOf(x.toCharArray(), 1, x.length() - 1);
                return out.concat(" " + start + end);
        }).get();

        System.out.println(res);
    }
}
