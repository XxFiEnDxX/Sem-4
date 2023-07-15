import java.util.*;

class Student implements Comparable<Student>{
    Integer age = 0;
    String str = null;

    Student(Integer d, String str){
        age = d;
        this.str = str;
    }

    public String toString(){
        return "age = "+age+" name = "+str;
    }

    public int compareTo(Student that){
        if(this.str.compareTo(that.str) > 0){
            return 1;
        }
        else return -1;
    }
}

public class _20_comparator {
    public static void main(String[] args){

        // Comparator<Student> c = (a,b)-> a.age>b.age?1:-1;

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(31, "amit"));
        stud.add(new Student(24, "Sam"));
        stud.add(new Student(63, "Amit"));
        stud.add(new Student(46, "rohit"));
        stud.add(new Student(21, "rahul"));
        stud.add(new Student(19, "nanu"));
        stud.add(new Student(78, "kakkar"));

        Collections.sort(stud);

        for(Student s : stud){
            // System.out.println(s);
            System.out.println(s.age+" "+s.str);
        }
    }
}
