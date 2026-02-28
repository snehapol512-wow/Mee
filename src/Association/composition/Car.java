package Association.composition;

class Engine {
    void start(){
        System.out.println("Engine starts!");

    }
}
public class Car {
    private Engine engine;
    Car(){
        engine = new Engine();
    }

    void drive() {
        engine.start();
        engine.start();
        System.out.println("Car is moving!");
    }

    }
