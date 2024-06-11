package coding;

//add class definitions below this line

class Atm {
    private double money;

    public Atm(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("You cannot deposit a negative amount of money");
            return;
        }
        money += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("You cannot withdraw a negative amount of money.");
            return;
        }
        if (amount >= money) {
            System.out.println("You do not have enough funds to withdraw that amount.");
            return;
        }
        money -= amount;
    }

    //possible solution
    // public void withdraw(double amount) {
    //     if (haveEnoughMoney(amount)) {
    //       if (positiveMoney(amount)) {
    //          money -= amount;
    //       } else {
    //         System.out.println("You cannot withdraw a negative amount of money.");
    //       }
    //     } else {
    //       System.out.println("You do not have enough funds to withdraw that amount.");
    //     }
    //   }
      
    //   public void deposit(double amount) {
    //     if (positiveMoney(amount)) {
    //       money += amount;
    //     } else {
    //       System.out.println("You cannot deposit a negative amount of money.");
    //     }
    //   }
      
    //   private boolean haveEnoughMoney(double amount) {
    //     return money > amount;
    //   }
      
    //   private boolean positiveMoney(double amount) {
    //     return amount >= 0;
    //   }
}

// add class definitions above this line

public class CodingExercise4 {
    public static void main(String[] args) {
        // add code below this line

        Atm myAtm = new Atm(1000);
        // myAtm.deposit(50);
        // System.out.println(myAtm.getMoney());
        // myAtm.withdraw(925);
        // System.out.println(myAtm.getMoney());
        // myAtm.deposit(-50);
        // System.out.println(myAtm.getMoney());
        // myAtm.withdraw(5000);
        myAtm.withdraw(1000);
        System.out.println(myAtm.getMoney());
        // add code above this line
    }
}