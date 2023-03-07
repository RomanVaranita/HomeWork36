import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//    Напишите программу создания небольшого словаря сленговых программерских выражений,
//    чтобы она потом по запросу возвращала значения из этого словаря.
//    Формат входных данных
//    Файл dict.txt
//    В первой строке задано одно целое число n — количество слов в словаре.
//    следующих n строках записаны слова и их определения, разделенные двоеточием и символом пробела.
//    Ввод с клавиатуры
//    В первой строке записано целое число m — количество поисковых слов, чье определение нужно вывести.
//    В следующих m строках записаны сами слова, по одному на строке.

public class Homework36 {
  public static void main(String[] args) throws IOException {
    File dictFile = new File("src/dict.txt");
    System.out.println("Enter the number");


    Map<String, Integer> shorts = new HashMap<>();
    shorts.put("Гит", 1);
    shorts.put("Галера", 2);
    shorts.put("Драй", 3);
    shorts.put("Залить", 4);
    shorts.put("Колл", 5);
    shorts.put("Коммит", 6);
    shorts.put("Лист", 7);
    shorts.put("Ось", 8);
    shorts.put("Питон", 9);
    shorts.put("Пыха", 10);


  }

}