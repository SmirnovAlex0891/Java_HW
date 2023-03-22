package hw_16_02_2023.hw_16_03_2023.Hw6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw6 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            people.add(new Person(faker.name().fullName(), faker.number().numberBetween(18, 50)));
        }
        Collections.sort(people);
        for (Person p : people) {
            System.out.println(p);
        }

    }
}
