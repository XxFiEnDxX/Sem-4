import java.security.DrbgParameters.Capability;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class _10_vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> v2 = new Vector<Integer>();

        v.add(2);
        v.add(4);
        v.add(3);
        v.add(5);
        v.add(0);
        v.add(6);
            System.out.println(v.size()+" ");
            System.out.println(v.capacity()+" ");
        v2.add(10);
        v2.add(6);
        v2.add(9);
        v2.add(7);
        v2.add(8);

        // Collections.sort(v);
        // v.sort();
        v.set(0,1);  //set elements of ith idx to given element;

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+" ");
        }


        // System.out.print(v);
    }
}
