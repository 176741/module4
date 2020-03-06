import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Loader
{
    public static void main(String[] args) {
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