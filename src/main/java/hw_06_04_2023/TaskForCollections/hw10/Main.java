package hw_06_04_2023.TaskForCollections.hw10;

import java.util.*;

/**
 * 10 Создать класс Employee со свойствами name, department и salary, затем создать отображение TreeMap,
 *    где ключом является отдел, а значением - список сотрудников, работающих в этом отделе.
 *    Затем добавить несколько сотрудников в каждый отдел и вывести на консоль среднюю зарплату для каждого отдела.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, List<Employee>> map = new TreeMap<>();
        List<Employee> list1 = new ArrayList<>(Arrays.asList(new Employee("Bob", "IT", 2500),
                new Employee("Pol", "IT", 2100),
                new Employee("Helen", "IT", 2200)));
        List<Employee> list2 = new ArrayList<>(Arrays.asList(new Employee("Nik", "Managers", 1800),
                new Employee("Adam", "Managers", 1900),
                new Employee("Lisa", "Managers", 2100)));

        map.put("IT", list1);
        map.put("Managers", list2);

        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            double tmp = 0;
            List<Employee> employeeList = entry.getValue();
            for (Employee e : employeeList) {
                tmp += e.getSalary();
            }
            tmp /= employeeList.size();
            System.out.println(entry.getKey() + " : " + tmp);
        }
    }
}
