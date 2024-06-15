package polymorphism;

//add class definitions below this line

class TestClass {
    public int sum(int n1, int n2, int n3) {
      return n1 + n2 + n3;
    }
    
    public int sum(int n1, int n2) {
      return n1 + n2;
    }
    public int sum(int n1, int n2,int n3,int n4) {
        return n1 + n2+n3+n4;
      }
      public int sum(int n1, int n2,int n3,int n4,int n5) {
        return n1 + n2+n3+n4+n5;
      }
      
  }
  //add class definitions below this line

class Person {
    private String name;
    private int number;
    private String street;
    
    public Person() {}
    
    public Person(String na, int nu, String s) {
      name = na;
      number = nu;
      street = s;
    }
    
    public String info() {
      return name + " lives at " + number + " " + street + ".";
    }
  }
  
  //add class definitions above this line
  //add class definitions above this line

public class MethodOverloading {  
    public static void main(String[] args) {
      
    //add code below this line

    TestClass tc = new TestClass();
    System.out.println(tc.sum(1, 2, 3));
    System.out.println(tc.sum(1, 2, 3,4));
    System.out.println(tc.sum(1, 2, 3,4,5));
    System.out.println(tc.sum(1, 2));
    
        //add code below this line

        Person p1 = new Person();
        Person p2 = new Person("Calvin", 37, "Main Street");
        System.out.println(p1.info());
        System.out.println(p2.info());
        
        //add code above this line
        
    //add code above this line
    }
  }