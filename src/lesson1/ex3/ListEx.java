package lesson1.ex3;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ListEx {
    public static void main(String[] args) {

        forOverIterator();
    }

    public static void whileAndIterator(){
        List<String> list = asList("A", "B", "C");

        // Iterator and while
        Iterator<String> item = list.iterator();
        while (item.hasNext()){
            System.out.println(item.next());
        }
    }

    public static void forOverIterator(){
        List<String> list = asList("A", "B", "C");

        // for over iterator
        for(Iterator<String> iter = list.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
    }

    public static void foreachEx(){
        List<String> list = asList("A", "B", "C");

        // for over iterator
        for(String elem : list){
            System.out.println(elem);
        }
    }

}
