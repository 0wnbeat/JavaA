import java.util.Scanner;

import Task4_CalculatorHelpers.*;

/**
 * @author MorozovAA
 * - Реализовать калькулятор в стиле ООП
 */

public class Task4_Calculator_OOP {
    private static double left;
    private static double right;
    private static String operation;

    public static void main(String[] args) {
        System.out.println("Введите пример (в формате a + b). Можно использовать сложение, вычетание, умножение, деление, а так же дробные числа (использовать разделительную точку)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            ParsedInput paredInput = InputParser.parse(input);
            left = paredInput.getLeft();
            right = paredInput.getRight();
            operation = paredInput.getOperation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

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
            default:
                break;
        }
    }
}
