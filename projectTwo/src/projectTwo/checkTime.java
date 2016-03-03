package projectTwo;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class checkTime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter number of seconds >> ");
		long seconds = Long.parseLong(scanner.nextLine());
		
		int day = (int)TimeUnit.SECONDS.toDays(seconds);
		long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
		long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)*60);
		long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds)*60);
		
		System.out.println("Days "+day+" Hours "+hours+" Minutes "+minute+" Seconds "+second);
	}

}
