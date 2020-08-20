package lesson1.ex1;

import java.util.Arrays;

public class GenericHolderTest<T> {
    public static void main(String[] args) {

        //set String
        GenericHolder<String> strHolder = new GenericHolder<>();
        strHolder.setData("Hello");
        //get String
        String str = strHolder.getData();
        System.out.println(str);


        //set int[]
        GenericHolder<int[]> intArrayHolder = new GenericHolder<>();
        intArrayHolder.setData(new int[] {34, 324, 6});
        //get String
        int [] arr = intArrayHolder.getData();
        System.out.println(Arrays.toString(arr));

        String s = "1166628";
        Integer i = new Integer(s);
    }
}
