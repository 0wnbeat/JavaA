package Task4_CalculatorHelpers;

import java.util.Arrays;

public class InputParser {

    public static ParsedInput parse(String input) throws Exception {
        String[] arrayUnit = input.split(" ");
        if (arrayUnit.length != 3) {                        //Проверка формата введенной строки
            throw new Exception("Неверный формат строки");
        }

        double left;
        try {                                               //Проверка что слева корректное число
            left = Double.parseDouble(arrayUnit[0]);
        } catch (NumberFormatException e) {
            throw new Exception("Слева не корректное число");
        }

        double right;
        try {                                               //Проверка что справа корректное число
            right = Double.parseDouble(arrayUnit[2]);
        } catch (NumberFormatException e) {
            throw new Exception("Справа не корректное число");
        }

        String operation = arrayUnit[1];                           //Проверка деления на 0
        if (operation.equals("/") && right == 0) {
            throw new Exception("Попытка деления на ноль");
        }

        if (!(operation.equals("*") || operation.equals("+") || operation.equals("/") || operation.equals("-"))) {
            throw new Exception("Не верный оператор. Выбеирите один из + - * /");
        }

        ParsedInput result = new ParsedInput();
        result.left = left;
        result.right = right;
        result.operation = operation;

        return result;
    }
}
