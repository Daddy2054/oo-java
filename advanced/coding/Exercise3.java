package advanced.coding;

import java.lang.reflect.Array;
import java.util.*;

//add class definitions below this line
class Dog {
    private String name;    
    private String breed;
    public Dog(String n, String b) {
        name = n;
        breed = b;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String toString() {
        return getClass().getName() + "[name=" + name + ", breed="  + breed+"]";
    }
}

 
//add class definitions above this line

public class Exercise3 {  
  public static void main(String[] args) {
    
    //add code below this line

        //add code below this line

        ArrayList<Dog> dogs = makeDogs();
        System.out.println(dogs);
    
        //add code above this line

    //add code above this line
    
  }
  
  //add method definition below this line

  
 public static ArrayList<Dog> makeDogs() {
     Dog dog1 = new Dog("Marceline","German Shepherd");
     Dog dog2 = new Dog("Cajun","Belgian Malinois");
     Dog dog3 = new Dog("Daisy","Border Collie");
     Dog dog4 = new Dog("Rocky","Golden Retriever");
     Dog dog5 = new Dog("Bella","Irish Setter");

     ArrayList<Dog> dogs = new ArrayList<Dog>();
     dogs.add(dog1);
     dogs.add(dog2);
     dogs.add(dog3);
     dogs.add(dog4);
     dogs.add(dog5);

     return dogs;
 }
  //add method definition above this line
}