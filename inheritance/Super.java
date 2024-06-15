package inheritance;

class Person {
    private String name;
    private int age;
    private String occupation;

    public Person() {
        name = "Sarah";
        age = 37;
        occupation = "VP Sales";
    }

    public Person(String n, int a, String o) {
        name = n;
        age = a;
        occupation = o;
    }

    public Person(String n) {
        name = n;
        age = 0;
        occupation = "";
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

// add class definitions below this line

class Superhero extends Person {
    public Superhero(String n, int a, String o) {
        super(n, a, o);
    }

    public Superhero(String n) {
        super(n);
    }
}

// add class definitions above this line

public class Super {
    public static void main(String[] args) {

        // add code below this line

        Superhero hero = new Superhero("Wonder Woman", 27, "intelligence officer");
        hero.sayHello();
        hero.sayAge();
        Superhero hero2 = new Superhero("Wonder Woman");
        hero2.sayHello();      
        //add code below this line

        Person p = new Person();
        Class c = p.getClass();
        Class sc = c.getSuperclass();
        System.out.println("Class: " + c);
        System.out.println("Superclass: " + sc);
    
        //add code above this line
        // add code above this line
    }
}