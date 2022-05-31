import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * - Прочитать слова из файла.
 * - Отсортировать в алфавитном порядке.
 * - Посчитать сколько раз каждое слово встречается в файле
 * - Вывести статистику на консоль
 * - Найти слово с максимальным количеством повторений
 * - Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class Task5_Collections {
    public static String readFile(String fileLocations) throws IOException {
        String textFromFile;
        textFromFile = new String(Files.readAllBytes(Paths.get(fileLocations)));
        return textFromFile;
    }

    public static void main(String[] args) throws Exception {
        String textFromFile = readFile("C:\\Users\\1\\Desktop\\text.txt");  //На рабочем столе необходимо создать текстовый файл и тут указать путь к нему
        System.out.println("    Слова из файла:");
        System.out.println(textFromFile);                           //чтение слов из файла

        ArrayList<String> arrayWords = new ArrayList<>(Arrays.asList(textFromFile.split(" "))); //создание массива слов
        Collections.sort(arrayWords);                               //сортировка в алфовитном порядке
        System.out.println("    Слова отсортированы в алфовитном порядке:");
        for (int i =0; i <arrayWords.size(); i++) {
            System.out.print(arrayWords.get(i) + " ");
        }
        System.out.println("");

        int count = 0;                                              //счетчик самого частого слова
        String thisWord = "";

        System.out.println("    Подсчёт сколько раз каждое слово встречается в файле:");
        Set<String> hashSet = new HashSet<>();                      //сет из уникальных слов
        hashSet.addAll(arrayWords);
        ArrayList<String> newArrayWords = new ArrayList<>(hashSet);
        for (int i = 0; i < newArrayWords.size(); i++) {
            int countThisWord = 0;
            for (int j = 0; j < arrayWords.size(); j++) {
                if (newArrayWords.get(i).equals(arrayWords.get(j))) {
                    countThisWord = countThisWord + 1;
                }
            }
            if (countThisWord > count) {
                count = countThisWord;                              //Поиск самого частого слова
                thisWord = newArrayWords.get(i);
            }

            System.out.println("Слово = " + "\"" + newArrayWords.get(i) + "\", встречается = " + countThisWord);
        }
        System.out.println("    Слово с максимальным количеством повторений:");
        System.out.println("    Слово \"" + thisWord + "\" встречалось " + count);
    }
}
