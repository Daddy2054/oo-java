package advanced.StringRepresentation;

//add class definitions below this line

class Animal {
    private int age;
    
    public Animal(int a) {
      age = a;
    }
    public String toString() {
        return getClass().getName() + "[age=" + age + "]";
      }
  }
  class Dog extends Animal {
    private String name;
    private String breed;
    
    public Dog(String n, String b, int a) {
      super(a);
      name = n;
      breed = b;
    }
    public String toString() {
        return super.toString() + "[name= " + name + ", breed=" + breed + "]";
      }
    
  }
  //add class definitions above this line

public class StringRepresentation {  
    public static void main(String[] args) {
      
  //add code below this line

  Animal a = new Animal(3);
  System.out.println(a);

  Dog d = new Dog("Rocky", "Pomeranian", 3);
  System.out.println(d);

  //add code above this line
      
    }
  }