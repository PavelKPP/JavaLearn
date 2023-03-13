package Task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {
      GregorianCalendar today = new GregorianCalendar();
      GregorianCalendar myB = new GregorianCalendar();
      myB.set(2003, 04, 04, 15, 30);

     int yearDif = today.get(Calendar.YEAR) - myB.get(Calendar.YEAR);
     int monthSum = today.get(Calendar.MONTH) - (myB.get(Calendar.MONTH));
        if(monthSum == -1)
            monthSum = 11;
        if(monthSum == 0)
            monthSum = 12;
        if(monthSum == -2)
            monthSum = 10;
        if(monthSum == -3)
            monthSum = 9;
        if(monthSum == -4)
            monthSum = 8;
        if(monthSum == -5)
            monthSum = 7;
        if(monthSum == -6)
            monthSum = 6;
        int dayDif = today.get(Calendar.DAY_OF_MONTH) - myB.get(Calendar.DAY_OF_MONTH);
        System.out.println(" Years: " + (yearDif - 1) + " Month :" + (monthSum + 1)  + " Day: " + dayDif);





    }
}
