public class _02_Student {
    //data members
    int roll  = 111; //default value
    String name;
    String departmenet;
    private int marks;

    //methods
    _02_Student(){
        this.roll = 000;
        this.name = "Unknow";
        departmenet = "CSE";
    }
    public static void main(String[] args){

        //create object
        _02_Student s1 = new _02_Student();
        s1.roll = 163;
        s1.name = "Amit Kumar";
        s1.departmenet = "CSE";

        _02_Student s2 = new _02_Student();
        s2.roll = 200;
        s2.name = "kiwaki";
        s2.departmenet = "CSE";

        //print
        System.out.print("Roll No: "+new _02_Student().roll+"\n\n");

        System.out.print("Name: "+s1.name+"\n");
        System.out.print("Roll No: "+s1.roll+"\n");
        System.out.print("Department: "+s1.departmenet+"\n\n");

        System.out.print("Name: "+s2.name+"\n");
        System.out.print("Roll No: "+s2.roll+"\n");
        System.out.print("Department: "+s2.departmenet+"\n");
    }
}
