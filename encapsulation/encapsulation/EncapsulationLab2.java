package encapsulation;

import java.io.*;
import com.opencsv.*;
// import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
// import java.util.Scanner;

//add class definitions below this line
    
class CoffeeJournal {
    private String file;
    private String roaster;
    private String country;
    private String region;
    private String stars;
    @SuppressWarnings("unused")
    private ArrayList<String[]> coffee;
    
    public CoffeeJournal(String f) {
      file = f;
      roaster = "";
      country = "";
      region = "";
      stars = "";
      coffee = loadCoffee();
    }

    private ArrayList<String[]> loadCoffee() {
        ArrayList<String[]> savedCoffee = new ArrayList<String[]>();
        try {
          CSVReader reader = new CSVReader(new FileReader(file));
          for (String[] row : reader) {
            savedCoffee.add(row);
          }
          reader.close();
        } catch (Exception e) {
          System.out.println(e);
        }
        return savedCoffee;
      }

      public String getRoaster() {
        return roaster;
      }
    
      public void setRoaster(String newRoaster) {
        roaster = newRoaster;
      }
    
      public String getCountry() {
        return country;
      }
      
      public void setCountry(String newCountry) {
        country = newCountry;
      }
    
      public String getRegion() {
        return region;
      }
      
      public void setRegion(String newRegion) {
        region = newRegion;
      }
    
      public String getStars() {
        return stars;
      }
      
      public void setStars(String newStars) {
        stars = newStars;
      }
  }
    
  //add class definitions above this line

public class EncapsulationLab2 {
  public static void main(String[] args) {

    //add code below this line
    
    // String file = "testJournal1.csv";
    // CoffeeJournal journal = new CoffeeJournal(file);
    // System.out.println(journal);
    //add code below this line
    
    String file = "testJournal2.csv";
    CoffeeJournal journal = new CoffeeJournal(file);
    journal.setRoaster("Peace River");
    journal.setCountry("Rawanda");
    journal.setRegion("Remera");
    journal.setStars("***");

    System.out.println(journal.getRoaster());
    System.out.println(journal.getCountry());
    System.out.println(journal.getRegion());
    System.out.println(journal.getStars());

    //add code above this line
    //add code above this line
  }

  //add method definitions below this line
  


  //add method definitions above this line
}