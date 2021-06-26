import java.text.SimpleDateFormat;
import java.util.Date ;
import java.util.*;

class DateExample{
  public static void main(String[] args){
    Date date = new Date();
    Atomic atomicInteger = new AtomicInteger() ;
    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
    String strDate= formatter.format(date);
   System.out.println(strDate+atomicInteger);
  }
}
