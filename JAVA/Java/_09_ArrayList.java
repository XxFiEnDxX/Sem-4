import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class _09_ArrayList {
    public static void main(String[] args) {
        int n = 5;

        //declaring with size n.
        ArrayList<Integer> arr1 = new ArrayList<Integer>(4);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();


        arr1.add(4);
        arr1.add(2);
        arr1.add(5);
        arr1.add(3);
        arr1.add(1);

        arr2.add(9);
        arr2.add(7);
        arr2.add(8);
        arr2.add(6);
        arr2.add(5);
        arr2.add(0, 10);

        //ArrayList is a dynamic array and we do not have to specify 
        //the size while creating it, the size of the array automatically increases 
        //when we dynamically add and remove items.
        //increase size by 50% of current size.if no. of element increased;

        System.out.println("Arr1 -> "+arr1);
        System.out.println("Arr2 -> "+arr2);
        
        // merging two arrays;
        arr1.addAll(2, arr2);
        System.out.println("Merge -> "+arr1);
        
        // SORTING 
        Collections.sort(arr1);
        System.out.println("SORT -> "+arr1);

        // CONTAINS element or not
        System.out.println(arr1.contains(10));

        // INDEXOF return the index of the element.
        System.out.println(arr1.indexOf(5));
        
        // LASTINDEXOF return last occurrence of an element
        System.out.println(arr1.lastIndexOf(5));

        // REMOVE element of ith idx
        System.out.println(arr1.remove(3));
        
        // SET ith idx to val;
        arr1.set(3, 4);

        // CLEAR all elements
        // arr1.clear();

        // SIZE
        System.out.println(arr1.size());

        // SUBLIST return the sublist from given starting and ending idx
        System.out.println(arr1.subList(2, 5));

        // SIZE
        System.out.println(arr1.size());
        
        // TRIMTOSIZE
        arr1.trimToSize();

        // TOARRAY return array with all the elements
        // int new_arr[] = arr1.toArray(int[]);


        // ITERATOR
        ListIterator<Integer> it = arr1.listIterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        System.out.println();

        // PRINTING ARRAY
        for(int i = 0; i < arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }

        // for(int i:arr1){
        //     System.out.print(i+" ");
        // }

        // System.out.println(arr2);
    }
}
