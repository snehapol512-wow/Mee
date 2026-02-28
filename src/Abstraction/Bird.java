abstract class Bird {
    abstract void eat();
    abstract void run();
}

class Cat extends Bird {

    void eat() {
        System.out.println("Cat eats food");
    }

    void run() {
        System.out.println("Cat runs fast");
    }
}

class Cheetah extends Bird {

    void eat() {
        System.out.println("Cheetah eats meat");
    }

    void run() {
        System.out.println("Cheetah runs very fast");
    }
}

class Demo {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cheetah cheetah = new Cheetah();

        cat.eat();
        cat.run();

        cheetah.eat();
        cheetah.run();
    }
}