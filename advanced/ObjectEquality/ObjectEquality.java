package advanced.ObjectEquality;

//add class definitions below this line

class ExampleClass {
    private int attribute1;
    private String attribute2;
    
    public ExampleClass(int a1, String a2) {
      attribute1 = a1;
      attribute2 = a2;
    }
    public boolean equals(ExampleClass other) {
        return attribute1 == other.attribute1 && attribute2.equals(other.attribute2);
      }
  }
   
  //add class definitions above this line

public class ObjectEquality {  
    public static void main(String[] args) {
      
    //add code below this line

    ExampleClass example1 = new ExampleClass(7, "hello");
    ExampleClass example2 = example1;
    System.out.println(example1 == example2);

    ExampleClass example10 = new ExampleClass(7, "hello");
    ExampleClass example20 = new ExampleClass(7, "hello");
    System.out.println(example10 == example20);
    System.out.println(example10.equals(example20));

    //add code above this line
      
    }
  }