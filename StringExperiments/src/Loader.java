import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Loader {
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
        int sum = 0;
        String[] sumZP = text.split("\\,");
        for (int i = 0; i < sumZP.length; i++) {
            String splitText = sumZP[i].replaceAll("[^0-9]", "");
            sum = sum + Integer.parseInt(splitText);
        }
            //Задание 3 - Ввод ФИО в консоль и вывод ФИО по строкам. Дополнительно - сделать программу устойчивой к сбоям.
            System.out.println("Введите фамилию имя и отчество:");
            Scanner scanner = new Scanner(System.in);
            String fio = scanner.nextLine();
            String[] splitFio = fio.split(" ");
            for(int f = 0; f < splitFio.length; f++) {
                if(!splitFio[f].substring(0, 1).equals(splitFio[f].substring(0, 1).toUpperCase())){
                    System.out.println("ФИО введенно неверно, введите всё с заглавной буквы");
                    System.exit(0);
                }
                if(!splitFio[f].equals(splitFio[f].replaceAll("[.,/?!@#$%^&*()_=+|]", ""))){
                    System.out.println("ФИО введенно неверно, введите без специальных знаков");
                    System.exit(0);
                }
                if(splitFio[f].contains("-")){
                    int dash = splitFio[f].indexOf('-');
                    String fioAfterDash = splitFio[f].substring(dash + 1);
                    if(!fioAfterDash.substring(0, 1).equals(fioAfterDash.substring(0, 1).toUpperCase())){
                        System.out.println("ФИО введенно неверно, введите ВСЁ с заглавной буквы");
                        System.exit(0);
                    }
                }
            }
            if (splitFio.length !=3 && splitFio.length != 4) {
                System.out.println("ФИО введенно неверно");
                System.exit(0);//позволяет корректно завершать работу без ошибки
            }
            System.out.println("Фамилия: " + splitFio[0]);
            System.out.println("Имя: " + splitFio[1]);
            if(splitFio.length == 4){
            System.out.println("Отчество: " + splitFio[2] + " " + splitFio[3]);
            } else {
            System.out.println("Отчество: " + splitFio[2]);
            }
            //Домашняя работа 4.6
            //задание 1 - Написать программу, которая будет распечатывать Ваш возраст и соответствующий ему день рождения и день недели до текущего момента времени
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy EEEE", new Locale("ru"));
            Calendar calendar = Calendar.getInstance();
            calendar.set(1994, Calendar.MAY, 02);
            Date date = new Date();
            Date birthday = calendar.getTime();
            int b = 0;
            while (date.compareTo(birthday) > 0) {
                System.out.println(b + " - " + dateFormat.format(birthday));
                calendar.add(Calendar.YEAR, 1);
                birthday = calendar.getTime();
                b++;
                }
        }
    }
