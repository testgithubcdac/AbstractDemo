import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate ld=LocalDate.now();
LocalDate ld1=LocalDate.of(2000, 8, 7);
System.out.println(ld);
System.out.println(ld.getDayOfMonth());
System.out.println(ld.getYear());
System.out.println(ld.getMonth());
System.out.println(ld1);
System.out.println(ld1.compareTo(ld));
System.out.println(ld1.MAX);

LocalDateTime ldt=LocalDateTime.now();
System.out.println(ldt);
System.out.println(ldt.getHour());
System.out.println(ldt.getMinute());
System.out.println(ldt.toString());
Date date=new Date();
System.out.println(date);
System.out.println(date.getTime());
	}

}
