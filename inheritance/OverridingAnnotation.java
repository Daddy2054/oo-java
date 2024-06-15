package inheritance;

class ClassA {
    public void greeting() {
      System.out.println("Hello from Class A");
    }
  }
  
//add class definitions below this line

class ClassB extends ClassA {
    @Override
    public void greeting() {
      System.out.println("Hello from Class B");
    }
  }
  
  //add class definitions above this line
  
  public class OverridingAnnotation {
    public static void main(String[] args) {
      
    //add code below this line
  
    ClassA a = new ClassA();
    ClassB b = new ClassB();
    
    a.greeting();
    b.greeting();
  
    //add code above this line  
    }
  }