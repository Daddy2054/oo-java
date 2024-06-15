package inheritance;

public class Ass2 {

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
    public void acceleration() {
        System.out.println("0 to 60 in " + acceleration + " seconds!");
      }
}

class SportsCar extends Car{
    private double acceleration;
  
    public SportsCar(String self, String ma, String mo, String c, double a) {
      super(ma, mo, c);
      acceleration = a;
    }
  
    public void acceleration() {
        System.out.println("0 to 60 in " + acceleration + " seconds!");
      }
  }