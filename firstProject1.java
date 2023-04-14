import java.text.SimpleDateFormat;
import java.util.*;
public class firstProject1 {
    public static void main(String[] args){
        
        // String[] ids=TimeZone.getAvailableIDs();
        // for(String id:ids){
        //     System.out.println(id);
        // }
        String format="dd-M-yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);        //Time format

        Date dt=new Date();
        String defaultTZ=TimeZone.getDefault().getID();
        System.out.println(defaultTZ);

        Calendar cal=new GregorianCalendar();         //calender      
        cal.setTime(dt);
        System.out.println("Date: "+dateFormat.format(cal.getTime()));   
        System.out.println("TimeZone: "+cal.getTimeZone().getID());
        System.out.println("TimeZone name: "+cal.getTimeZone().getDisplayName());         //  Asia Time Zone
            System.out.println();
            System.out.println();

        TimeZone ameTZone=TimeZone.getTimeZone("America/Mexico_City");         //American Time Zone
        SimpleDateFormat ameFormat=new SimpleDateFormat(format);
        ameFormat.setTimeZone(ameTZone);
            System.out.println("After Conversion TimeZone is :");              
        cal.setTimeZone(ameTZone);
        System.out.println("Date: "+ameFormat.format(cal.getTime()));
        System.out.println("TimeZone: "+cal.getTimeZone().getID());
        System.out.println("TimeZone name: "+cal.getTimeZone().getDisplayName());

        }
}
