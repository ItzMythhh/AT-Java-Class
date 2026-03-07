import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        
        System.out.println("Today's date is " + today);
        System.out.println("The time is " + time);
    }
}
