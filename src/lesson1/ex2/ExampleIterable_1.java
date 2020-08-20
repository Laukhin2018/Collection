package lesson1.ex2;

public class ExampleIterable_1 {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] emloyees = {new Employee("Mike"), new Employee("John"), new Employee("Mark")};
        company.setEmployees(emloyees);

        for(Employee emp: company){
            System.out.println(emp);
        }
    }
}
