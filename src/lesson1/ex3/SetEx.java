package lesson1.ex3;

import java.util.Set;
import java.util.TreeSet;
import static java.util.Arrays.asList;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(asList("a", "b", "c"));

        for (String elem : set){
            System.out.println(elem);
        }
    }
}
