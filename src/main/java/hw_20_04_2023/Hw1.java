package hw_20_04_2023;

import java.util.*;

/**
 * 8) Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
 * Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.
 */
public class Hw1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Bob", 25, "M", 1300),
                new Person("Pol", 35, "M", 1500),
                new Person("Nik", 24, "M", 1200),
                new Person("Adam", 28, "M", 1800),
                new Person("Jack", 31, "M", 1100),
                new Person("Fil", 42, "M", 1900)
        ));

        OptionalDouble res = people.stream()
                .filter(e -> e.getAge() > 24 && e.getAge() < 41 && e.getSex().equals("M"))
                .map(Person::getSalary)
                .mapToDouble(Double::doubleValue)
                .average();
        if (res.isPresent()) System.out.println(res.getAsDouble());
    }
}
class Person {
    private String name;
    private int age;
    private String sex;
    private double salary;

    public Person(String name, int age, String sex, double salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    public String getSex() {
        return sex;
    }
}