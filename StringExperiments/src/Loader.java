import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.lang.model.type.NullType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
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
        //Задание 3 - Ввод ФИО в консоль и вывод ФИО по строкам. Дополнительно - сделать программу устойчивой к сбоям.
        System.out.println("Введите фамилию имя и отчество:");
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        int firstIndex = fio.indexOf(' ');
        int lastIndex = fio.lastIndexOf(' ');
        if (firstIndex == lastIndex){//сначала идет это условие т.к. при одном пробеле сразу выдается ошибка и перед присваиванием строк по индексам лучше сразу провести проверку
            System.out.println("ФИО введенно неверно");
            System.exit(0);//позволяет корректно завершать работу без ошибки
        }
        String lastName = fio.substring(0, firstIndex);
        String firstName = fio.substring(firstIndex + 1, lastIndex);
        String middleName = fio.substring(lastIndex + 1);
        int errorIndex1 = firstName.indexOf(' ');//лишние пробелы в случае неправильного ввода будут находится в районе имени - там и ищем
       if (errorIndex1 > 0) {
            System.out.println("ФИО введенно неверно");
        } else {
            System.out.println("Фамилия: " + lastName);
            System.out.println("Имя: " + firstName);
            System.out.println("Отчество: " + middleName);
        }
        //Домашняя работа 4.6
        //задание 1 - Написать программу, которая будет распечатывать Ваш возраст и соответствующий ему день рождения и день недели до текущего момента времени
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy EEEE", new Locale("ru"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(1994, Calendar.MAY, 02);
        Date date = new Date();
        Date birthday = calendar.getTime();
        int i = 0;
        while (date.compareTo(birthday) > 0)
        {
            System.out.println(i + " - " + dateFormat.format(birthday));
            calendar.add(Calendar.YEAR, 1);
            birthday = calendar.getTime();
            i++;

        }
    }
}