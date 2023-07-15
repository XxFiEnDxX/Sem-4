import java.util.*;
public class _14_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            LinkedList ll = new LinkedList();
            
            for(int i = 0; i < n; i++){
                ll.add(sc.nextInt());
            }
            
            for(int i = n-1; i >= 0; i--){
                System.out.println(ll.get(i));
            }
            t--;
        }
    }
}
