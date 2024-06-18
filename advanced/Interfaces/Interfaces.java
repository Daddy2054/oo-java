package advanced.Interfaces;

interface Dog {
    String bark();
  }
  
//add class definitions below this line

interface MovieStar {
    String movieDetails();
  }
class FamilyMember {
    private String name;
    private int age;
    
    public FamilyMember(String n, int a) {
      name = n;
      age = a;
    }
    
    public String info() {
      return String.format("%s is %d years old.", name, age);
    }
  }
  
  class Chihuahua extends FamilyMember implements Dog, MovieStar {
    private String film;
    private String revenue;
    
    public Chihuahua(String n, int a, String f, String r) {
      super(n, a);
      film = f;
      revenue = r;
    }
    
    public String bark() {
      return "woof woof";
    }
    public String movieDetails() {
        return String.format("The movie %s grossed %s worldwide.", film, revenue);
      }
  }
   
  //add class definitions above this line
  
  public class Interfaces {  
    public static void main(String[] args) {
      
    //add code below this line

    Chihuahua c = new Chihuahua("Henry", 5, "Beverly Hills Chihuahua", "$149,281,606");
    System.out.println(c.bark());
    System.out.println(c.info());
    System.out.println(c.movieDetails());

    //add code above this line
      
    }
  }