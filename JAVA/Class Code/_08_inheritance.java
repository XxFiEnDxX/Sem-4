class Indians{
    String name;
    String religion;
    Indians(){
        System.out.println("HI! its a Indian!");
    }
}

class Students extends Indians{
    int age;
    int roll;
    String college;
}

class Home extends Students{
    String state;
    String city;
}

public class _08_inheritance{
    public static void main(String[] args) {
        Home st = new Home();
        
        st.name = "Sarvesh";
        st.religion = "hindu";
        
        st.age = 19;
        st.roll = 2110991286;
        st.college = "Chitkara University";

        st.state = "punjab";
        st.city = "mansa";

        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.religion);
        System.out.println(st.state);
        System.out.println(st.city);
        System.out.println(st.college);
        System.out.println(st.roll);
    }
}