package advanced.ArrayList;

// Define the App class

class App {
    private String name;
    private String description;
    private String category;
    
    public App(String n, String d, String c) {
      name = n;
      description = d;
      category = c;
    }
    
    public void display() {
      System.out.println(String.format("%s is a(n) %s app that is %s.", name, category, description));
    }
  }