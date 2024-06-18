package advanced.coding;

interface Vehicle {
    String travel();
  }
  
  //add class definitions below this line
  
  class Car implements Vehicle {
    private double miles;
    public Car(double miles) {
      this.miles = miles;
    }
    public String travel() {
      return String.format("There is no extra fee to travel %.2f miles.", miles);
    }
  }

  class RideShare implements Vehicle {
    private double miles;
    private double fee;
    public RideShare(double miles, double fee) {
        this.miles = miles;
        this.fee = fee;
    }
    public String travel() {
        double money = miles * fee;
// String myString = String.format("I have $%.2f in my wallet.", money);
      return String.format("It costs $%.2f to travel %.2f miles.", money, miles);
    }
  }

  class Subway implements Vehicle {
    private double fares;
    public Subway(double fares) {
      this.fares = fares;
    }
    public String travel() {
        return String.format("$%.2f will get you unlimited use for one day.", fares);
      }
  }
   
  //add class definitions above this line
  
  public class Exercise1 {  
    public static void main(String[] args) {
      
    //add code below this line

    Car c = new Car(10);
    RideShare rs = new RideShare(20, 0.5);
    Subway s = new Subway(7.25);
    
    System.out.println(c.travel());
    System.out.println(rs.travel());
    System.out.println(s.travel());

    //add code above this line
      
    }
  }