package advanced.importing;

// This file is the class definition

class Employee {
    private String name;
    private String title;
    
    public Employee(String n, String t) {
      name = n;
      title = t;
    }
    
    public void display() {
      System.out.println("Employee: " + name);
      System.out.println("Title: " + title);
    }
  }
// public class ClassDefinition {

// }
