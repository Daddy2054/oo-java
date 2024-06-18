package advanced;

class BankAccount {
    private double checking;
    private double savings;
    
    public BankAccount(double c, double s) {
      checking = c;
      savings = s;
    }
    
    //add toString definition below this line
    
    public String toString() {
        return getClass().getName() + "[checking=" + checking + ", savings=" + savings + "]";
      }
    
    //add toString definition above this line
    
  }
  
  public class LabChallenge {  
    public static void main(String[] args) {
      
    //add code below this line

    BankAccount account1 = new BankAccount(2432, 89.52);
    BankAccount account2 = new BankAccount(1998, 239.43);


    System.out.println(account1);	//BankAccount[checking=2432.0, savings=89.52]
System.out.println(account2);	//BankAccount[checking=1998.0, savings=239.43]
    //add code above this line
      
    }
  }