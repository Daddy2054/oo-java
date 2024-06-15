package polymorphism;

class Chef {
    private String name;
    private String cuisine;
    private int michelinStars;

    // add constructors below this line
    public Chef(String name, String cuisine, int michelinStars) {
        this.name = name;
        this.cuisine = cuisine;
        this.michelinStars = michelinStars;
    }

    public Chef(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
        this.michelinStars = 0;
    }

    public Chef(String name) {
        this.name = name;
        this.cuisine = null;
        this.michelinStars = 0;
    }

    // add constructors above this line
//possible solution

// class Chef {
//     private String name;
//     private String cuisine;
//     private int michelinStars;
    
//     //add constructors below this line
  
//     public Chef(String n) {
//       name = n;
//     }
    
//     public Chef(String n, String c) {
//       name = n;
//       cuisine = c;
//     }
    
//     public Chef(String n, String c, int s) {
//       name = n;
//       cuisine = c;
//       michelinStars = s;
//     }
  
//     //add constructors above this line
    
//     public String display() {
//       String msg = String.format("%s is known for %s cuisine and has %d Michelin stars.", name, cuisine, michelinStars);
//       return msg;
//     }
//   }


    public String display() {
        String msg = String.format("%s is known for %s cuisine and has %d Michelin stars.", name, cuisine,
                michelinStars);
        return msg;
    }
}

public class LabChallenge {
    public static void main(String[] args) {

        // add code below this line

        Chef c1 = new Chef("Marco Pierre White");
        Chef c2 = new Chef("Rene Redzepi", "Nordic");
        Chef c3 = new Chef("Thomas Keller", "French", 3);

        System.out.println(c1.display()); // Marco Pierre White is known for null cuisine and has 0 Michelin stars.
        System.out.println(c2.display()); // Rene Redzepi is known for Nordic cuisine and has 0 Michelin stars.
        System.out.println(c3.display()); // Thomas Keller is known for French cuisine and has 3 Michelin stars.

        // add code above this line
    }
}