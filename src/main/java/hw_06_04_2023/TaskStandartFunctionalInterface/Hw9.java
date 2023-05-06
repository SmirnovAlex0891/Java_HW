package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.function.Consumer;

/**
 * 9. Произвести операцию над всеми элементами списка строк, используя интерфейсы Consumer и Function:
 */
public class Hw9 {
    public static void main(String[] args) {
        Consumer<String> transfStr = str -> str.toUpperCase();

    }
}
