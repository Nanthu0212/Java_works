class Person {
    void show() {
        System.out.println("Person Details");
    }
}

class Teacher extends Person {
    void work() {
        System.out.println("Teaching");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Studying");
    }
}

class Staff extends Person {
    void duty() {
        System.out.println("Office Work");
    }
}

public class Super_Ex10 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        Student s = new Student();
        Staff st = new Staff();

        t.show();
        t.work();

        s.show();
        s.study();

        st.show();
        st.duty();
    }
}