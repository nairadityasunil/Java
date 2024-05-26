import java.time.LocalDate;
import java.util.*;
public class P1{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(((Object)date).getClass().getSimpleName());
        String d1 = date.toString();
        System.out.println(((Object)d1).getClass().getSimpleName());
        System.out.println(d1);
    }
}