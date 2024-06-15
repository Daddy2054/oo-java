package inheritance;

class Person {
    private String name;
    private int age;
    private String occupation;
    
    public Person() {
        name = "Rodrigo";
        age = 19;
        occupation = "student";
      }
          // public Person() {
    //     name = "Sarah";
    //     age = 37;
    //     occupation = "VP Sales";
    //   }
    public String getName() {
      return name;
    }
    
    public void setName(String newName) {
      name = newName;
    }
    
    public int getAge() {
      return age;
    }
    
    public void setAge(int newAge) {
      age = newAge;
    }
    
    public String getOccupation() {
      return occupation;
    }
    
    public void setOccupation(String newOccupation) {
      occupation = newOccupation;
    }
    
    public void sayHello() {
      System.out.println("Hello, my name is " + name + ".");
    }
    
    public void sayAge() {
      System.out.println("I am " + age + " years old.");
    }
  }
  
//add class definitions below this line

class Superhero extends Person {
  
}
  
//add class definitions above this line
  
  public class WhatIsInheritance {
    public static void main(String[] args) {
      
    //add code below this line

    Superhero s = new Superhero();
    System.out.println(s.getName());
    System.out.println(s.getAge());
    System.out.println(s.getOccupation());
    s.sayHello();
    s.sayAge();
    //add code above this line
    }
  }