package inheritance;

//add class definitions below this line

class ClassA {
    public void greeting() {
        System.out.println("Hello from Class A");
    }
}

class ClassB extends ClassA {
    public void greeting() {
        System.out.println("Hello from Class B");
    }
}

class ClassC extends ClassB {
    public void greeting() {
        System.out.println("Hello from Class C");
    }
}

// add class definitions above this line
public class Substitution {
    public static void main(String[] args) {

        // add code below this line

        ClassB b = new ClassB();
        substitution(b);
        ClassC c = new ClassC();
        ClassA a = new ClassA();
        substitution(c);

        // ClassA a = new ClassA();
        // substitution(a);
        // add code above this line
    }

    // add method definitions below this line

    public static void substitution(ClassB b) {
        b.greeting();
    }

    // add method definitions above this line
}