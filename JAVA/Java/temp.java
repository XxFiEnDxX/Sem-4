import java.util.*;

class solution{
    public String reverseWords(String str){
        String[] arr = str.split("[ ]",0);
        StringBuilder ans = new StringBuilder("");

        for(int i = arr.length-1; i >= 0; i--){
            if(i == 0){
                ans.append(arr[i]);
            }
            else{
                ans.append(arr[i]+' ');
            }
        }
        return ans+"";
    }

    public String reverseString(String str){
        StringBuilder ans = new StringBuilder(str);
        ans.reverse();

        return ans+"";
    }

    public String toggleString(String str){
        StringBuilder ans = new StringBuilder(str);
        for(int i = 0; i < ans.length(); i++){
            char ch = ans.charAt(i);

            if(ch >= 65 && ch <= 90){
                int val = (int)ch;
                val += 32;
                char ele = (char)val;
                ans.setCharAt(i,ele);
            }
            else if(ch >= 90 && ch <= 122){
                int val = (int)ch;
                val -= 32;
                char ele = (char)val;
                ans.setCharAt(i,ele);
            }
        }
        return ans+"";
    }
}

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // String str = sc.nextLine();

        Double d = 22.0/7;

        System.out.printf("%.2f\n",d);
        // System.out.printf("%d",20);

        // solution obj = new solution();
        // System.out.println(obj.reverseWords(str));
        // System.out.println(obj.reverseString(str));
        // System.out.println(obj.toggleString(str));
    }
}
