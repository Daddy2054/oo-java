package inheritance;

public class Ass1 {

}

class Car {
    private String make;
    private String model;
    private String color;

    public Car(String ma, String mo, String c) {
        make = ma;
        model = mo;
        color = c;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

class Sedan extends Car {
    public Sedan(String ma, String mo, String c) {
        super(ma, mo, c);
    }

    public void describe() {
        System.out.print("I am a " + getColor() + " ");
        System.out.println(getMake() + " " + getModel() + ".");
    }
}