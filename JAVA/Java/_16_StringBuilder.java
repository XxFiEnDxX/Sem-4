import java.util.*;
public class _16_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello World");

        System.out.println(str);
        
        //setCharAt() and append()
        str.setCharAt(0, 'M');
        str.append(" "+20+23);
        System.out.println(str);
        System.out.println("");
        
        
        
        //insert(idx,ch) and deleteCharAt()
        str.insert(0,"xXx ");
        str.insert(str.length()," xXx");
        str.deleteCharAt(str.length()-4);
        str.delete(str.length()-7, str.length()-3);
        System.out.println(str);
        System.out.println("");



        //reverse();
        str.reverse();
        System.out.println(str);

    }
}
