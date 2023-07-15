import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class _05_find_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int st = 0;
        int ed = n-1;
        int mid = 0;
        while(st < ed){
            mid = st+(ed-st)/2;

            if(arr[st] == arr[ed]){
                break;
            }
            else if(mid != arr[mid]){
                ed = mid;
            }
            else{
                st = mid;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(mid);
    }
}
