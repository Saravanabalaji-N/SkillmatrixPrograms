package skillmatrixpractice.testcode;


import java.time.Duration;
import java.time.LocalDateTime;

	public class JavaCodeSeven {

	    public static long weeksBetween(LocalDateTime startDate, LocalDateTime endDate) {
	        Duration duration = Duration.between(startDate, endDate);
	        long days = duration.toDays(); 
	        long weeks = days / 7;
	        return weeks;
	    }

	    public static void main(String[] args) {
	        LocalDateTime startDateTime = LocalDateTime.of(2024, 1, 1, 0, 0);
	        LocalDateTime endDateTime = LocalDateTime.of(2024, 2, 15, 0, 0);
	        long weeksBetweenDates = weeksBetween(startDateTime, endDateTime);
	        System.out.println("Weeks between dates: " + weeksBetweenDates);


	    }
	}


