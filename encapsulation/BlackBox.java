import java.io.*;

//add class definitions below this line
    
class Numbers {
    private String file;
    private int[] data;
    
    public Numbers(String f) {
      file = f;
      data = getData();
    }

    @SuppressWarnings("finally")
    private int[] getData() {
        int[] intTokens = new int[0];
        try {
          BufferedReader reader = new BufferedReader(new FileReader(file));
          String line = reader.readLine();
          String[] stringTokens = line.split("\t");
          intTokens = convertToInts(stringTokens);
          reader.close();
        } catch (IOException e) {
          System.out.println(e);
        } finally {
          System.out.println("Finished reading a file.");
          return intTokens;
        }
      }

      private int[] convertToInts(String[] strings) {
        int size = strings.length;
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
          ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
      }

      public void summary() {
        printCount();
        printNumbers();
        printSmallest();
        printLargest();
      }
    
      private void printLargest() {
        int largest = 1;
        for (int num : data) {
          if (num > largest) {
            largest = num;
          }
        }
        System.out.println("The largest number is " + largest + ".");
      }
    
      private void printSmallest() {
        int smallest = 100;
        for (int num : data) {
          if (num < smallest) {
            smallest = num;
          }
        }
        System.out.println("The smallest number is " + smallest + ".");
      }
    
      private void printNumbers() {
        System.out.print("The numbers are: ");
        for (int num : data) {
          System.out.print(num + " ");
        }
        System.out.println();
      }
    
      private void printCount() {
        System.out.println("There are " + data.length + " numbers.");
      }
  }
    
  //add class definitions above this line

public class BlackBox {
    public static void main(String[] args) {
    //add code below this line

    String path = "numbers.csv";
    Numbers myNumbers = new Numbers(path);
    myNumbers.summary();

    //add code above this line
    }

}
