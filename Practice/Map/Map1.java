import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> m =  new HashMap<Integer,String>();
        m.put(1,"Aditya");
        m.put(2,"Ananth");
        m.put(3,"Vatsal");
        for (Map.Entry e : m.entrySet())
        {
            System.out.println(e.getKey()+":"+ e.getValue());
        }
    }
}
