import java.util.*;

public class _23_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("B");
        ll.add("C");
        ll.addFirst("A");
        ll.addLast("D");

        ListIterator<String> it = ll.listIterator(0);
        // while()
        System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        System.out.println(it.previous());
        System.out.println(ll);

        StringBuffer[] stringBuffers = new StringBuffer[10];
        for (int i = 0; i < stringBuffers.length; i++)
            stringBuffers[i].append("hello");
        System.out.println(stringBuffers[0]);

    }
}
