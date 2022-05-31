import Task4_CalculatorOperations.OperationAddition;

import java.util.Scanner;

/**
 * @author MorozovAA
 * - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * - Использовать комментарии и JavaDoc при описании метода.
 * - Использовать форматирование при выводе результата в консоль.
 * - Полученный результат округлять до 4-х знаков после запятой.
 * * Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */

public class Task1_Calculator {
    private static double left;
    private static double right;
    private static String operation;

    public static void main(String[] args) {
        parseInput();
        switch (operation) {                                  //Определение вида операции и вывод результата
            case "+":
                new OperationAddition().calculate(left, right);
                double result = left + right;
                System.out.printf("%.4f", result);
                break;

            case "-":
                result = left - right;
                System.out.printf("%.4f", result);
                break;
            case "*":
                result = left * right;
                System.out.printf("%.4f", result);
                break;
            case "/":
                result = left / right;
                System.out.printf("%.4f", result);
                break;
            default:                                         // Проверка оператора
                System.out.println("Не верный оператор. Выбеирите один из + - * /");
                break;
        }
    }

    public static void parseInput() {
        System.out.println("Введите пример (в формате a + b). Можно использовать сложение, вычетание, умножение, деление, а так же дробные числа (использовать разделительную точку)");
        Scanner scanner = new Scanner(System.in);

        String example = scanner.nextLine();
        String[] arrayUnit = example.split(" ");
        if (arrayUnit.length != 3) {
            System.out.println("Неверный формат строки");
            System.exit(1);
        }

        try {
            left = Double.parseDouble(arrayUnit[0]);
        } catch (NumberFormatException e) {
            System.out.println("Слева не корректное число");
            System.exit(1);
        }

        try {
            right = Double.parseDouble(arrayUnit[2]);
        } catch (NumberFormatException e) {
            System.out.println("Справа не корректное число");
            System.exit(1);
        }

        operation = arrayUnit[1];
        if (operation.equals("/") && right == 0) {
            System.out.println("Попытка деления на ноль");
            System.exit(1);
        }
        scanner.close();
    }
}