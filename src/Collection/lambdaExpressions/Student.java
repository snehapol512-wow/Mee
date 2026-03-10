package Collection.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(106, "Mr.Bean"));
        list.add(new Student(10, "Badri"));
        list.add(new Student(125, "Budhdev"));
        for(Student s : list){
            System.out.println(s.id + " , " + s.name);
        }
        Collections.sort(list, (s1, s2) -> s2.id - s1.id);
        for(Student s : list){
            System.out.println(s.id + " , " + s.name);
        }

    }
}
