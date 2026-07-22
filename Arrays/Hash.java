import java.util.*;
public class Hash {
    public static void main(String[] args) {
       HashMap<String,Integer> info=new HashMap<>();
       info.put("india",120);
       info.put("us",30);
       info.put("rus",50);

       for(Map.Entry<String,Integer> e:info.entrySet())
       {
        System.out.println(e);
       }

    }
    
}
