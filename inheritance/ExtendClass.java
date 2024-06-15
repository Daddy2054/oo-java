package inheritance;

class Person {
    private String name;
    private int age;
    private String occupation;
    
    public Person(String n, int a, String o) {
      name = n;
      age = a;
      occupation = o;
    }
    
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
    private String secretIdentity;
    private String nemesis;
    
    public Superhero(String na, int a, String o, String s, String ne) {
        super(na, a, o);
      secretIdentity = s;
      nemesis = ne;
    }
    public String getNemesis() {
      return nemesis;
    }
    
    public void setNemesis(String newNemesis) {
      nemesis = newNemesis;
    }
    
    public String getSecretIdentity() {
      return secretIdentity;
    }
    
    public void setSecretIdentity(String newIdentity) {
      secretIdentity = newIdentity;
    }
    public void revealSecretIdentity() {
        System.out.println("My real name is " + secretIdentity + ".");
      }
  }
    
  //add class definitions above this line
  
  public class ExtendClass {
    public static void main(String[] args) {
      
    //add code below this line

    Superhero hero = new Superhero("Spider-Man", 17, "student", "Peter Parker", "Doc Octopus");
    System.out.println(hero.getName());
    System.out.println(hero.getAge());
    System.out.println(hero.getOccupation());
    System.out.println(hero.getSecretIdentity());
    System.out.println(hero.getNemesis());

    //add code above this line
    }
  }