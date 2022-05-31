import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MorozovAA
 * Поиск максимального элемента в массиве
 * - задаем массив слов
 * - размерность массива произвольна, задается в консоли
 * - после чего в консоли вводятся слова в количестве равном заданной длине массива
 * - в полученном массиве необходимо найти самое длинное слово
 * - результат вывести на консоль
 */

public class Task2_MaxInArray {
    public static void main(String[] args) {
        System.out.println("Введите число слов в массиве:");
        Scanner scannerCount = new Scanner(System.in);
        int count = scannerCount.nextInt();
        String[] myArray = new String[count];                   //Создание массива с заданной размерностью
        int wordLength = 0;
        String longestWord = "";

        for (int i = 0; i < count; i++) {                       //Заполнение массима с консоли

            System.out.println("Введите " + (i + 1) + " слово в массиве:");
            Scanner scannerWords = new Scanner(System.in);
            String word = scannerWords.nextLine();
            myArray[i] = word;
            if (word.length() > wordLength) {
                wordLength = word.length();                     //Поиск самого длинного слова
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord + ". Его длинна = " + wordLength + ". Номер в массиве = " + Arrays.asList(myArray).indexOf(longestWord) + " при условии, что первый элемент имеет номер 0");
        scannerCount.close();
    }
}
