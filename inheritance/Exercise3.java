package inheritance;

class Parent1 {
  public String identify() {
    return "This method is called from Parent1";
  }
}

class Parent2 extends Parent1 {
  public String identify() {
    return "This method is called from Parent2";
  }
  public String parentIdentify() {
    return super.identify();
  }
}

// add class definitions below this line

// Child is a subclass of Parent1 and Parent2
class Child extends Parent2 {
  // Override identify so that it returns “This method is called from Child”
  public String identify() {
    return "This method is called from Child";
  }

  // method identify2 that invokes the identify method from Parent2.
  public String identify2() {
    return super.identify();
  }

  // method identify3 that invokes the identify method from Parent1.
  public String identify3() {
    return super.parentIdentify();
  }

}

// add class definitions above this line
public class Exercise3 {
  public static void main(String[] args) {

    // add code below this line
    Child childObject = new Child();

    System.out.println(childObject.identify()); // This method is called from Child
    System.out.println(childObject.identify2()); // This method is called from Parent2
    System.out.println(childObject.identify3());// This method is called from Parent1
    // add code above this line
  }
}