package lesson1.ex2;

import java.util.Iterator;

public class Company implements Iterable<Employee>{
    private Employee [] employees = new Employee[0];

    public void setEmployees (Employee [] employees){
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator(){
        return new ArrayIterator (employees);
    }
}
