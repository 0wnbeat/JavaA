import java.util.Scanner;

import Task4_CalculatorOperations.OperationAddition;
import Task4_CalculatorOperations.OperationSubtraction;
import Task4_CalculatorOperations.OperationMultiplication;
import Task4_CalculatorOperations.OperationDivision;

/**
 * @author MorozovAA
 * - Реализовать калькулятор в стиле ООП
 */

public class Task4_Calculator_OOP {
    private static double left;
    private static double right;
    private static String operation;

    public static void main(String[] args) {
        parseInput();
        switch (operation) {                                  //Определение вида операции и вывод результата
            case "+":
                System.out.printf("%.4f", new OperationAddition().calculate(left, right));
                break;
            case "-":
                System.out.printf("%.4f", new OperationSubtraction().calculate(left, right));
                break;
            case "*":
                System.out.printf("%.4f", new OperationMultiplication().calculate(left, right));
                break;
            case "/":
                System.out.printf("%.4f", new OperationDivision().calculate(left, right));
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
        if (arrayUnit.length != 3) {                        //Проверка формата введенной строки
            System.out.println("Неверный формат строки");
            System.exit(1);
        }

        try {                                               //Проверка что слева корректное число
            left = Double.parseDouble(arrayUnit[0]);
        } catch (NumberFormatException e) {
            System.out.println("Слева не корректное число");
            System.exit(1);
        }

        try {                                               //Проверка что справа корректное число
            right = Double.parseDouble(arrayUnit[2]);
        } catch (NumberFormatException e) {
            System.out.println("Справа не корректное число");
            System.exit(1);
        }

        operation = arrayUnit[1];                           //Проверка деления на 0
        if (operation.equals("/") && right == 0) {
            System.out.println("Попытка деления на ноль");
            System.exit(1);
        }
        scanner.close();
    }
}
