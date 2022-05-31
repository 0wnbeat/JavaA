import Task3_DifferentSweets.DifferentSweets;
import Task3_DifferentSweets.Candy;
import Task3_DifferentSweets.Chocolate;
import Task3_DifferentSweets.Jellybean;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MorozovAA
 * Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 */

public class Task3_SweetGift {
    private static Candy candy1;
    private static Candy candy2;
    private static Chocolate chocolate1;
    private static Chocolate chocolate2;
    private static Jellybean jellybean1;
    private static Jellybean jellybean2;

    public static void main(String[] args) {
        candy1 = new Candy("Мишка косолапый", 0.550, 255.50, "Бумажная с фальгой");
        candy2 = new Candy("Ромашка", 0.300, 100.00, "Бумажная");
        chocolate1 = new Chocolate("Milka", 0.100, 60.00, "Молочный шоколад");
        chocolate2 = new Chocolate("Alpen Gold", 0.100, 70.00, "Темный шоколад");
        jellybean1 = new Jellybean("Mamba", 0.400, 140.00, "Фрукты");
        jellybean2 = new Jellybean("Бон Пари", 0.200, 80.10, "Фигурки");

        DifferentSweets[] gift = {candy1, candy2, chocolate1, chocolate2, jellybean1, jellybean2}; //Формирование подарка


        double giftWeight = 0;
        double giftCost = 0;

        for (int i = 0; i < gift.length; i++) {
            giftWeight += gift[i].getWeight();
            giftCost += gift[i].getPrice();
        }

        System.out.printf("Общий вес подарка = %.3f килограмм" + "\n", giftWeight);
        System.out.printf("Общая стоимость подарка = %.2f рублей" + "\n", giftCost);
        System.out.println("    Описание подарка:");
        for (int i = 0; i < gift.length; i++){
            System.out.println(gift[i]);
        }




        /* тут я пробовал формировать подарок через многоуровневый терминал, но не успел..
        String endGiftCollect = "0. Закончить сборку подарка";

        System.out.println("Выберите сладость:");
        System.out.println(endGiftCollect);

        for (int i = 0; i < gift.length; i++) {
            System.out.println(i + 1 + ". " + gift[i].getName());
        }

        Scanner scannerSweets = new Scanner(System.in);
        int choiceSweet = scannerSweets.nextInt();
        String addGift = "";
        int numberGift = 1;

        for (int i = 0; i < gift.length; i++) {
            int caseNumber = i + 1;
            if (caseNumber == choiceSweet) {
                addGift = gift[i].getName();
                numberGift = i;
                scannerSweets.close();
            } else if (choiceSweet == 0){
                System.out.println("Стоимость подарка = ");
                System.out.println("Вес подарка = ");
                break;
            }
        }
        System.out.println(addGift + " стоит " + gift[numberGift].getPrice() + " за 1 килограмм. Сколько вы желаете?");
*/
    }
}
