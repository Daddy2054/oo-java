package advanced.Composition;

//add class definitions below this line

class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine;

    public Car(String ma, String mo, int y, Engine e) {
        make = ma;
        model = mo;
        year = y;
        engine = e;
    }

    public void describe() {
        System.out.println(String.format("%s %s %s", make, model, year));
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        engine.ignite();
    }
}

class Engine {
    private String configuration;
    private double displacement;
    private int horsepower;
    private int torque;

    public Engine(String c, double d, int h, int t) {
        configuration = c;
        displacement = d;
        horsepower = h;
        torque = t;
    }

    public void ignite() {
        System.out.println("Vroom vroom!");
    }
    
}

// add class definitions above this line

public class Composition {
    public static void main(String[] args) {

        // add code below this line

        Engine engine = new Engine("V8", 5.8, 326, 344);
        Car car = new Car("De Tomaso", "Pantera", 1979, engine);
        // car.getEngine().ignite();
        car.start();
        car.describe();


        // add code above this line

    }
}