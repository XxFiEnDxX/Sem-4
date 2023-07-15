class node<T>{
    T data = null;
    node<T> next = null;
    node(T d){
        data = d;
    }
}

class LL<T>{
    node<T> head = null;

    void insert(T d){
        if(head == null){
            head = new node<>(d);
            return;
        }
        node<T> temp = new node<>(d);
        temp.next = head;
        head = temp;
        return ;
    }

    void display(){
        node<T> temp = head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }

}

public class _19_generics {
    public static void main(String[] args) {
        LL<String> l1 = new LL<>();

        l1.insert("num1");
        l1.insert("num2");
        l1.insert("num3");
        l1.insert("num4");
        l1.insert("num5");

        l1.display();
    }
}
