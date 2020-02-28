import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Loader
{
    public static void main(String[] args) {
        //задание 1 - вывести алфавит и символы букв алфавита
        String alfabetEng = "abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ";
        String alfabetRus = "абвгдеёжзийклмнопрстуфхцшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦШЩЪЫЬЭЮЯ";
        // Вывод символов английского алфавита
        for (int i = alfabetEng.indexOf('a'); i <= alfabetEng.indexOf('Z'); i++) {
            char c = alfabetEng.charAt(i);
            int code = (int) c;
            System.out.printf(c + " = " + code + ", ");
        }
        // Вывод символов русского алфавита
        for (int i = alfabetRus.indexOf('а'); i <= alfabetRus.indexOf('Я'); i++) {
            char c = alfabetRus.charAt(i);
            int code = (int) c;
            System.out.printf(c + " = " + code + ", ");
        }
        System.out.println(); // пробел после первого задания
        //задание 2 - посчитать зарплату Васи и Маши
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        int v1 = text.indexOf("Вася заработал");
        int v2 = text.indexOf("руб");
        String str1 = text.substring(v1 + 14, v2).trim();

        int m1 = text.indexOf("Маша - ");
        int m2 = text.lastIndexOf("руб");
        String str2 = text.substring(m1 + 6, m2).trim();
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("Сумма заработка Васи и Маши равна: " + sum + " рублей");
        //Задание 3 - Ввод ФИО в консоль и вывод ФИО по строкам. Дополнительно - сделать программу устойчивой к сбоям (пока в процессе реализации.)
        System.out.println("Введите фамилию имя и отчество:");
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        int firstIndex = fio.indexOf(' ');
        int lastIndex = fio.lastIndexOf(' ');
        String firstName = fio.substring(0, firstIndex);
        String lastName = fio.substring(firstIndex + 1, lastIndex);
        String middleName = fio.substring(lastIndex + 1);
        System.out.println("Фамилия: " + firstName);
        System.out.println("Имя: " + lastName);
        System.out.println("Отчество: " + middleName);
    }
}