package polymorphism;
abstract class ParentClass {
    public abstract void sayHello();
  }
  class ChildClass extends ParentClass {
    public void sayHello() {
      System.out.println("Hello");
    }
  }
