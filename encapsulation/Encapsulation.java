
//add class definitions below this line
    
class ExampleClass {
    private int num1;
    private int num2;
  
    public ExampleClass(int n1, int n2) {
      num1 = n1;
      num2 = n2;
    }
  
    public String describe() {
      return ("My numbers are: " + num1 + " and " + num2);
    }
  
    public int sum() {
      return num1 + num2;
    }
    public void printNum1() {
      System.out.println(num1);
    }
    public void printNum2() {
      System.out.println(num2);
    }
  }
    
  //add class definitions above this line
public class Encapsulation {
    public static void main(String[] args) {
            //add code below this line

    ExampleClass myExample = new ExampleClass(5, 7);
    System.out.println(myExample.describe());
    System.out.println(myExample.sum());
    myExample.printNum1();
    myExample.printNum2();

    //add code above this line
    }
}
