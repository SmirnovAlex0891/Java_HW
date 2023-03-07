package hw_10_02_2023;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Firm firm = new Firm("Roga I Kopyta");
        Department dep1 = new Department("It", 3, firm);
        Department dep2 = new Department("Sales", 5, firm);
        Department dep3 = new Department("Accounting", 2, firm);

        Faker faker = new Faker();
        Employee employee1 = new Employee(faker.name().fullName(), faker.job().title(), 2000, dep1);
        Employee employee2 = new Employee(faker.name().fullName(), 1500, dep1);

        Employee employee3 = new Employee(faker.name().fullName(), faker.job().title(), 2500, dep2);
        Employee employee4 = new Employee(faker.name().fullName(), 2200, dep2);

        Employee employee5 = new Employee(faker.name().fullName(), faker.job().title(), 2300, dep3);
        Employee employee6 = new Employee(faker.name().fullName(), 2100, dep3);
        System.out.println("----------Firm--------------" + "\n");
        System.out.println("Firm: " + firm.getNameFirm() + "\n");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
    }
}
