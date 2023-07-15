import java.util.*;
public class _06_Unique {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],0);
            }
        }

        // for (int i = 0; i < arr.length; i++) {
        //     if (map.get(arr[i]) == 0) {
        //         System.out.println(arr[i]);
        //     }
        // }

        Set<Integer> val = map.keySet();

        for(Integer i:val){
            if(map.get(i) == 0){
                System.out.println(i);
            }
        }
    }
}
