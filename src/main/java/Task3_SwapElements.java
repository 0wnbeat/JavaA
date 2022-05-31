import java.util.Arrays;

/**
 * @author MorozovAA
 * Смена мест максимального отрицательного и минимального положительного числа в массиве
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 */

public class Task3_SwapElements {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        int negativeMax = -11;
        int negativeMaxIndex = 0;
        int positiveMin = 11;
        int positiveMinIndex = 0;

        for (int i = 0; i < 20; i++) {                                  //генерируется массив из 20 чисел от -10 до 10
            intArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }

        for (int i = 0; i < 20; i++) {                                  //Нахождение максимального отрицательного числа
            if (intArray[i] < 0 && intArray[i] > negativeMax) {
                negativeMax = intArray[i];
                negativeMaxIndex = i;
            }
            if (intArray[i] > 0 && intArray[i] < positiveMin) {         //Нахождение минимального положительного числа
                positiveMin = intArray[i];
                positiveMinIndex = i;
            }
        }

        System.out.println("Созданный массив:\n" + Arrays.toString(intArray));                  //Вывод созданного массива
        System.out.println("Максимальное отрицательное число: " + negativeMax);                 //Вывод максимального отрицательного числа
        System.out.println("Индекс максимального отрицательного числа: " + negativeMaxIndex);   //Вывод индекса минимального положительного числа
        System.out.println("Минимальное положительное число число: " + positiveMin);            //Вывод минимального положительного числа
        System.out.println("Индекс минимального положительного числа: " + positiveMinIndex);    //Вывод индекса минимального положительного числа

        int swapElement = negativeMax;                                  //Перенос максимального отрицательного числа в буфер
        intArray[negativeMaxIndex] = positiveMin;                       //Смена мест максимального отрицательного и минимального положительного числа
        intArray[positiveMinIndex] = swapElement;
        System.out.println("Массив с заменёнными элементами:\n" + Arrays.toString(intArray));    //Вывод нового массива
    }
}