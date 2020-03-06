import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Loader
{
    public static void main(String[] args) {
        //Домашняя работа 4.5
        //задание 1 - посчитать зарплату Васи, Пети и Маши с помощью регулярных выражений
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        int sum = 0;
        String[] sumZP = text.split("\\,");
        for(int i = 0; i < sumZP.length; i++){
            String splitText = sumZP[i].replaceAll("[^0-9]","");
            sum = sum + Integer.parseInt(splitText);
        }
        System.out.println("Сумма заработка Васи и Маши равна: " + sum + " рублей");
        //Задание 2 - Распечатать англоязычный текст по словам в консоли
        String engText = "Of course there are people who love Java as a programming language. love the platform, love the community, but the language itself is in a very rough shape. I would prefer to start new projects in Kotlin instead of Java 100% of the time, and I am a strong advocate of Java 10 being the first Java to trade backward compatibility for a full scale overhaul of the language and especially its standard API. Yes, it is going to be just as rough or even rougher than the transition from Python 2 to Python 3, but it is long overdue.";
        String[] splitEngText = engText.split(" ");
        for(int i = 0; i < splitEngText.length; i++) {
            System.out.println(splitEngText[i]);
        }
        //Задание 3 - Ввод ФИО в консоль и вывод ФИО по строкам. Дополнительно - сделать программу устойчивой к сбоям.
        System.out.println("Введите фамилию имя и отчество:");
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        String[] splitFio = fio.split(" ");
        if (splitFio.length != 3) {
            System.out.println("ФИО введенно неверно");
            System.exit(0);//Для корректной работы программы
        }
            System.out.println("Фамилия: " + splitFio[0]);
            System.out.println("Имя: " + splitFio[1]);
            System.out.println("Отчество: " + splitFio[2]);
         //Задание 4 - Реализовать очистку номера телефона, вводимого из консоли, от лишних символов
            System.out.println("Введите номер телефона:");
            Scanner scannerTel = new Scanner(System.in);
            String telNumber = scannerTel.nextLine();
            System.out.println(telNumber.replaceAll("[^0-9]",""));
        }
}