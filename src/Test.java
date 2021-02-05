import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args){
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        Date today = new GregorianCalendar().getTime();
        String date = formatter.format(today);
    }
}
