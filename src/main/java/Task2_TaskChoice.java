import java.util.Scanner;

/**
 * Программа должна выполнять одно из заданий на выбор.
 * - Если в консоли ввести 1 - запуститься выполнение калькулятора
 * - Если в консоли ввести 2 - поиск максимального слова в массиве
 *
 * Пример как это может выглядеть в консоли:
 * Enter number of task: (1 - calculator, 2 - string array)
 */

public class Task2_TaskChoice {
    public static void main(String[] args) {
        System.out.println("Введите номер задачи (1 - калькулятор; 2 - Максимальный элемент в массиве)");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 :
                Task1_Calculator.main(null);        //Запуск калькулятора
                break;
            case 2 :
                Task2_MaxInArray.main(null);        //Запуск поиска максимального элемента
                break;
            default:
                System.out.println("Введите 1 или 2");
        }
        scanner.close();
    }
}
