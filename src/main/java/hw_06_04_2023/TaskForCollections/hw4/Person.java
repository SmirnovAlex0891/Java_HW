package hw_06_04_2023.TaskForCollections.hw4;

class Person implements Comparable<Person>{
    private String name;
    private int priority;

    public Person(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.getPriority() - o.getPriority();
    }
}
