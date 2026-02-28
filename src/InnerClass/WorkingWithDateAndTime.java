package InnerClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("D, MM dd yyyy");
        String formattedDateDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date: " + formattedDateDateTime);



    }

}
/*
Display the day of the month
Display the day of the year
Display the week name, month number, month name
E - Name of the day : (MON - SUN)
D - Day of the year :(1 - 366) (Including Leap Year)
dd - Day of the month : (1-31)
M - Month Number : (1 -12)
MMM - Month name : (JAN - DEC)
 */