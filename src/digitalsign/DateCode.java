package digitalsign;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class DateCode {
   public static void main(String[] args) throws Exception {
      // displaying current date and time
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat simpleformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
      System.out.println("Today's date and time = "+simpleformat.format(cal.getTime()));
      
      
      Date today = new Date();
      //formatting date in Java using SimpleDateFormat
      SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
      String date = DATE_FORMAT.format(today);
      System.out.println("Today in dd-MM-yyyy format : " + date);
        }
}