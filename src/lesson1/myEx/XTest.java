package lesson1.myEx;

import java.util.*;

class X {
    int a;
    int b;

    X (int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        X x = (X) o;
        return a == x.a &&
                b == x.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

public class XTest{
    public static void main(String[] args) {
//        X obj1 = new X(3, 4);
//        X obj2 = new X(3, 4);
//
//        System.out.println(obj1 == obj2);
//        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1 == obj1);

        // не имплиметнил Comparable из за этого ClassCastException
        //SortedSet<User> set = new TreeSet<>();


        SortedSet<ComparableUser> set = new TreeSet<>();
        set.add(new ComparableUser("A", 3));
        set.add(new ComparableUser("B", 1));
        set.add(new ComparableUser("C", 2));
        System.out.println(set);

    }

}

class User {
    private int age;
    private String name;

    public User(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "User[age=" + age + ", name=" + name + "]";
    }
}


class ComparableUser implements Comparable<ComparableUser> {
    private int age;
    private String name;

    public ComparableUser(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "User[age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(ComparableUser that) {
//        return this.age - that.age; // сортирует age как ASK
//        return -(this.age - that.age); // сортирует age как DESC (альтернатива  return that.age - this.age)

        return this.name.compareTo(that.name); // сортирует name как ASK
//        return -(this.name.compareTo(that.name)); // сортирует name как DESC
    }
}
