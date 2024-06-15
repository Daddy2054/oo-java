package inheritance;

class Person {
    private String name;
    private String address;

    public Person(String n, String a) {
        name = n;
        address = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String info() {
        return name + " lives at " + address + ".";
    }
}

// add class definitions below this line
class CardHolder extends Person {
    private int accountNumber;
    private double balance;
    private int creditLimit;

    public CardHolder(String n, String a, int an) {
        super(n, a);
        accountNumber = an;
        balance = 0.0;
        creditLimit = 5000;
    }

    public void processSale(double sale) {
        balance += sale;
    }

    public void makePayment(double payment) {
        balance -= payment;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

}

class PlatinumClient extends CardHolder {
    private double rewards;
    private double cashBack;

    public PlatinumClient(String n, String a, int an) {
        super(n, a, an);
        rewards = 0.0;
        cashBack = 0.02;
    }

    public void processSale(double sale) {
        super.processSale(sale);
        rewards += sale * cashBack;
    }
    //possible solution
    // public void processSale(double price) {
    //     rewards += cashBack * price;
    //     setBalance(getBalance() + price);
    //   }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(int newPoints) {
        rewards = newPoints;
    }

    public String info() {
        return getName() + " lives at " + getAddress() + ".";
    }
}

// add class definitions above this line

public class Exercise5 {
    public static void main(String[] args) {

        // add code below this line

        PlatinumClient p = new PlatinumClient("Sarah", "101 Main Street", 123364);

        p.processSale(100);
        System.out.println(p.getRewards());
        System.out.println(p.getBalance());
        p.makePayment(50);
        System.out.println(p.getBalance());
        System.out.println(p.info());
        // add code above this line
    }
}