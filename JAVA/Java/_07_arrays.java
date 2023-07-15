import java.util.*;

public class _07_arrays {
    public static void main(String[] args) {
        Integer arr[] = {5,2,3,1,4};

        // Collections.sort(arr);  // not working

        Arrays.sort(arr); //Ascending order
        
        Integer arr2[] = Arrays.copyOf(arr, 10);
        arr2[5] = 10;
        arr2[6] = 7;
        arr2[7] = 6;
        arr2[8] = 8;
        arr2[9] = 9;
        
        Arrays.sort(arr2); //Ascending order
        // Arrays.sort(arr2,Collections.reverseOrder()); //Descending order

        // System.out.println(Arrays.toString(arr2));
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        // String[] word = new String[3];

        // word[0] = "hello";
        // word[1] = "world";
        // word[2] = "son";

        // for(String s:word){
        //     System.out.print(s+" ");
        // }
        
        // String[] text = new String[3];
        // for(String s:text){
        //     System.out.print(s+" ");
        // }

    }
}
