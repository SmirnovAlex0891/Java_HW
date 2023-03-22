package hw_16_03_2023.Hw6;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
