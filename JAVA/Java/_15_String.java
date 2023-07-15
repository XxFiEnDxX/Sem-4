import java.util.*;
public class _15_String {
    public static void main(String[] args) {
        // Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.println(str);



        //CharAt() and length() =============>
        System.out.println("String length - "+str.length());
        System.out.print(str.charAt(0)+" ");
        System.out.print(str.charAt(5)+" ");
        System.out.println(str.charAt(11)+" ");
        System.out.println("");
        
        
        
        //indexOf() and compareTo()
        System.out.print(str.indexOf("A")+" ");
        System.out.print(str.indexOf("K")+" ");
        System.out.println(str.indexOf("S")+" ");
        System.out.println(str.compareTo("Amit Kumar Singh"));  //0-> equal, -1->smaller, 1->greater
        System.out.println("");
        
        
        
        //contains() and startsWith()
        
        
        
        
        //toLowerCase(), toupperCase(), and concat()
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(" fiend "));
        System.out.println("");
        
        
        
        
        //substring()
        System.out.println(str.substring(0, 5));
        System.out.println("");
    }
}
