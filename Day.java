import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Day{
public static void main(String Args[]){
int day=Integer.parseInt(Args[0]);
int month= Integer.parseInt(Args[1]);
int year=Integer.parseInt(Args[2]);

LocalDate date= LocalDate.of(year,month,day);
String dayOfWeek=date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH);

System.out.println(dayOfWeek);
}
}