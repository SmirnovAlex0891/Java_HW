package hw_25_04_2023;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Hw1 {
    public static void main(String[] args) {
        //readFromFile();

//        String pathIn = "D:\\TelRan\\Java\\NewHomeWork\\src\\main\\java\\hw_25_04_2023\\Text.txt";
//        String pathOut = "D:\\TelRan\\Java\\NewHomeWork\\src\\main\\java\\hw_25_04_2023\\TextCopy.txt";
//        copyFromFileToFile(pathIn, pathOut);

        readFromCSV();
    }

    /**
     * 1) Чтение данных из текстового файла и вывод на экран
     * Описание: Написать программу на Java, которая будет читать данные из текстового файла,
     * используя классы FileReader и BufferedReader, и выводить их на экран.
     */
    static void readFromFile() {
        String path = "D:\\TelRan\\Java\\NewHomeWork\\src\\main\\java\\hw_25_04_2023\\Text.txt";
        String tmp;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2) Копирование содержимого одного файла в другой
     * Описание: Написать программу на Java, которая будет копировать содержимое одного
     * текстового файла в другой, используя классы FileReader, FileWriter и BufferedReader.
     * Пользователь должен иметь возможность указать исходный и целевой файлы в качестве аргументов.
     */
    static void copyFromFileToFile(String pathIn, String pathOut) {
        String tmp;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathIn)); BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut))) {
            while ((tmp = reader.readLine()) != null) {
                writer.write(tmp + "\n");
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 3) Чтение данных из CSV файла и обработка их
     * Описание: Написать программу на Java, которая будет читать данные из CSV (Comma-Separated Values)
     * файла, используя классы FileReader и BufferedReader, и обрабатывать их.
     * Программа должна способна разбирать строки из файла на поля, разделенные запятыми,
     * и выполнять определенные операции на данных, такие как суммирование, поиск определенных значений и т.д.
     */
    static void readFromCSV() {
        String path = "D:\\TelRan\\Java\\NewHomeWork\\src\\main\\java\\hw_25_04_2023\\access-code-password-recovery-code.csv";
        String tmp;
        Pattern pattern = Pattern.compile("(\\d*)?,(\\w*)?,(\\w*)?,([a-zA-Z]*)?,([a-zA-Z]*)?,(\\D*)?,([a-zA-Z]*)?");
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((tmp = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(tmp);
                while (matcher.find()) {
                    employees.add(new Employee(Integer.parseInt(matcher.group(1)),
                            matcher.group(2),
                            matcher.group(3),
                            matcher.group(4),
                            matcher.group(5),
                            matcher.group(6),
                            matcher.group(7)));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getLocation));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    static class Employee {
        private int identifier;
        private String accessCode;
        private String recoveryCode;
        private String firstName;
        private String lastName;
        private String department;
        private String location;

        public Employee(int identifier, String accessCode, String recoveryCode, String firstName, String lastName, String department, String location) {
            this.identifier = identifier;
            this.accessCode = accessCode;
            this.recoveryCode = recoveryCode;
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.location = location;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "identifier=" + identifier +
                    ", accessCode='" + accessCode + '\'' +
                    ", recoveryCode='" + recoveryCode + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", department='" + department + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }
}
