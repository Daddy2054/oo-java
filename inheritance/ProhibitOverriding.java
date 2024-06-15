package inheritance;

//add class definitions below this line

class ClassA {
    public final void greeting() {
      System.out.println("Hello from Class A");
    }
  }
  
  class ClassB extends ClassA {
    public void greeting2() {
      System.out.println("Hello from Class B");
    }
  }
  
  //add class definitions above this line

public class ProhibitOverriding {
    public static void main(String[] args) {
      
    //add code below this line
  
    ClassB b = new ClassB();
    b.greeting();
    b.greeting2();
  
    //add code above this line  
    }
  }