import java.util.*;
public class _25_String_Tokenizer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.nextLine());
        StringBuffer ans = new StringBuffer("");

        str.insert(0, "Fiend ");
        System.out.println(str);

        StringTokenizer s = new StringTokenizer(str+"");

        while (s.hasMoreTokens()) {
            ans.insert(0, s.nextToken()+" ");
    }
    System.out.println(ans);
}
}
