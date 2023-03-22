package hw_16_02_2023.hw_16_03_2023;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Создать карту HashMap, в которой хранятся номера телефонов и фамилии людей. По номеру телефона вывести фамилию:
 */
public class hw4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Faker faker = new Faker();

        for (int i = 1000000; i < 1000010; i++) {
            map.put(i, faker.name().fullName());
        }
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Phone number: " + e.getKey() + " name: " + e.getValue());
        }
        System.out.println(map.get(1000000));
    }
}
