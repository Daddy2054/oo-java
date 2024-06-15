package inheritance;

class ClassA {
    public void hello() {
      System.out.println("Hello from Class A");
    }
  }
  
  class ClassB extends ClassA {
    public void hello() {
      System.out.println("Hello from Class B");
    }
  }
  
//add class definitions below this line

class ClassC extends ClassB {
    public void bonjour() {
      System.out.println("Bonjour");
    }  
    public void goodbye() {
        System.out.println("Goodbye");
      }  
      public void hello() {
        System.out.println("Hello from Class C");
      }  
  }
  
  //add class definitions above this line
  public class MultilevelExtendOverride {
    public static void main(String[] args) {
      
    //add code below this line
  
    ClassC c = new ClassC();
    c.bonjour();
    c.goodbye();
    c.hello();

    //add code above this line 
    }
  }