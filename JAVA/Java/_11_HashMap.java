import java.util.*;

public class _11_HashMap {
    public static void main(String[] args) {

        // Declaration
        HashMap<String,Integer> m = new HashMap<>();
        HashMap<Character,Integer> um = new HashMap<>();


        //Inserting
        m.put("india", 120);
        m.put("USA", 100);
        m.put("China", 200);
        m.put("Japan", 80);

        System.out.println(m);
        
        //search Key
        if (m.containsKey("China")) {
            System.out.println("China present!");
        }else{
            System.out.println("Not present!");
        }

        // get value
        System.out.println(m.get("india"));
        System.out.println(m.get("India"));

        // Printing
        for (Map.Entry<String , Integer> ele : m.entrySet()) {
            System.out.println(ele.getKey()+" "+ele.getValue());
        }
        
        
        // Remove
        m.remove("China");  
        
        Set<String> val = m.keySet();
        for(String str:val){
            System.out.println(str+" -> "+m.get(str));
        }

        System.out.println(val);

    }
}
