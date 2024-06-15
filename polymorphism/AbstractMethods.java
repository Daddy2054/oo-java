package polymorphism;

abstract class Person {
    private String name;
    
    public String getName() {
      return name;
    }
    
    public void setName(String newName) {
      name = newName;
    }
  }
  
//add class definitions below this line

//add class definitions below this line

class Engineer extends Person {
    private String specialty;
    
    public Engineer(String n, String s) {
      setName(n);
      specialty = s;
    }
    
    public String greeting() {
      return "Hello, my name is " + getName() + " and I am a(n) " + specialty + ".";
    }
  }
  
  class Artist extends Person {
    private String specialty;
    
    public Artist(String n, String s) {
      setName(n);
      specialty = s;
    }
    
    public String greeting() {
      return "My name is " + getName() + " and I work with " + specialty + ".";
    }
  }
  
  //add class definitions above this line
  
  //add class definitions above this line
  
  public class AbstractMethods {  
    public static void main(String[] args) {
      
    //add code below this line

    Person p = new Engineer("Calvin", "civil engineer");
    Person a = new Artist("Maria", "water colors");
    
    System.out.println(((Engineer) p).greeting());
    System.out.println(((Artist) a).greeting());
    
    //add code above this line
    }
  }