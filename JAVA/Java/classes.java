class A{
    public void display(){
        System.out.println("this is class A");
    }
}


class B extends A{
    public void display(){
        System.out.println("this is class B");
    }
}

public class classes {
    public static void main(String[] args){

        int x = 1;
        int y=2;
        int z =5;
        System.out.println(++y+z-z+x+y++);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
