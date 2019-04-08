package stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateGet {

    public String[] getdate()
    {
      String str[]=new  String[2];

    // Get calendar set to current date and time
    Calendar c = Calendar.getInstance();

    // Set the calendar to monday of the current week
     c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

        System.out.println();
    // Print dates of the current week starting on Monday
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
       str[0]=df.format(c.getTime());
        for(int i = 0; i<6;i++)

    {
        c.add(Calendar.DATE, 1);
    }
        str[1]=df.format(c.getTime());
        return str;
}
}
