package polymorphism;

//add class definitions below this line

class Alpha {
    public void show() {
      System.out.println("I am from class Alpha");
    }
    public void hello() {
      System.out.println("Hello from Alpha");
    }
  }
  
  class Bravo extends Alpha {
    public void show() {
      System.out.println("I am from class Bravo");
    }
    public void hello() {
      System.out.println("Hello from Bravo");
    }
  }
 
//add class definitions above this line

public class MethodOverriding {  
    public static void main(String[] args) {
      
    //add code below this line

    // int a = 5;
    // int b = 10;
    // System.out.println(a + b);   //operator overloading
    
    // String c = "5";
    // String d = "10";
    // System.out.println(c + d);  //operator overloading
    
        //add code below this line

        int a = 5;
        boolean b = true;
        // System.out.println(a + b); //error
            //add code below this line

    Alpha testObject = new Alpha();
    // Bravo testObject = new Bravo();
    testObject.show(); //method overriding
    testObject.hello(); //method overriding
    
    //add code above this line
        //add code above this line
    //add code above this line
    }
  }