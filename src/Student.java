class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sneha", 20);

        s1.display();
        s2.display();
    }
}
