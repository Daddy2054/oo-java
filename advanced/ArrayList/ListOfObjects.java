package advanced.ArrayList;

// List of objects

import java.io.*;
import com.opencsv.*;
import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;

public class ListOfObjects {  
  public static void main(String[] args) {
    
    //add code below this line
    
    ArrayList<App> apps = new ArrayList<App>();
    String path = "app.csv";
    
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      reader.skip(1);
      for (String[] row : reader) {
        apps.add(new App(row[0], row[1], row[2]));
      }
      reader.close();
      System.out.println(apps);
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    for (App app : apps) {
        app.display();
      }
    //add code above this line
  }
}