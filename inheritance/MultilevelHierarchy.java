package inheritance;

//add class definitions below this line

class Grandparent {
    public void hello() {
      System.out.println("Hello from the Grandparent class");
    }
  }
  
  class Parent extends Grandparent {
    public void hello() {
      System.out.println("Hello from the Parent class");
    }
    
    public void parentHello() {
      super.hello();
    }
  }
  
  class Child extends Parent {
    public void hello() {
      System.out.println("Hello from the Child class");
    }
    
    public void parentHello() {
      super.hello();
    }
    
    public void grandparentHello() {
      super.parentHello();
    }
  }
  
  //add class definitions above this line

public class MultilevelHierarchy {
    public static void main(String[] args) {
      
    //add code below this line
  
    Child c = new Child();
    c.hello();
    c.parentHello();
    c.grandparentHello();
  
    //add code above this line 
    }
  }