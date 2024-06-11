package coding;

//add class definitions below this line
class SodaMachine {
    private String[] sodas = { "coke", "pepsi", "sprite", "dr. pepper" };
    private int cokeInventory;
    private int pepsiInventory;
    private int spriteInventory;
    private int drPepperInventory;
    private int money;

    public SodaMachine() {
        this.cokeInventory = 20;
        this.pepsiInventory = 20;
        this.spriteInventory = 20;
        this.drPepperInventory = 20;
        this.money = 10;
    }

    public String[] getSodas() {
        return sodas;
    }
    public void setSodas(int index, String soda){
        sodas[index] = soda;
    }

    public int getCokeInventory() {
        return cokeInventory;
    }

    public int getPepsiInventory() {
        return pepsiInventory;
    }

    public int getSpriteInventory() {
        return spriteInventory;
    }

    public int getDrPepperInventory() {
        return drPepperInventory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCokeInventory(int cokeInventory) {
        this.cokeInventory = cokeInventory;
    }

    public void setPepsiInventory(int pepsiInventory) {
        this.pepsiInventory = pepsiInventory;
    }

    public void setSpriteInventory(int spriteInventory) {
        this.spriteInventory = spriteInventory;
    }

    public void setDrPepperInventory(int drPepperInventory) {
        this.drPepperInventory = drPepperInventory;
    }

    public void buySoda(String soda, int money) {
        if (money < 2) {
            System.out.println("You did not insert enough money.");
            return;
        } else {
            if (soda.equals("coke")) {
                if (cokeInventory > 0) {
                    cokeInventory--;
                    this.money += 2;
                } else {
                    System.out.println("There are no cans of Coke.");
                    return;
                }
            } else if (soda.equals("pepsi")) {
                if (pepsiInventory > 0) {
                    pepsiInventory--;
                    this.money += 2;
                } else {
                    System.out.println("There are no cans of Pepsi.");
                    return;
                }
            } else if (soda.equals("sprite")) {
                if (spriteInventory > 0) {
                    spriteInventory--;
                    this.money += 2;
                } else {
                    System.out.println("There are no cans of Sprite.");
                    return;
                }
            } else if (soda.equals("dr. pepper")) {
                if (drPepperInventory > 0) {
                    drPepperInventory--;
                    this.money += 2;
                } else {
                    System.out.println("There are no cans of Dr. Pepper.");
                    return;
                }
            } else {
                System.out.println("That soda is not sold in this machine.");
                return;
            }

        }
    }

    //possible solution
    // public void buySoda(String soda, int amount) {
    //     if (validSoda(soda) && enoughSoda(soda) && enoughMoney(amount)) {
    //       updateInventory(soda);
    //       updateMoney();
    //     }
    //   }
      
    //   private boolean validSoda(String soda) {
    //     boolean correctSoda = false;
        
    //     for (String s : sodas) {
    //       if (soda.equals(s)) {
    //         correctSoda = true;
    //       }
    //     }
        
    //     if (correctSoda == false) {
    //       System.out.println("That soda is not sold in this machine.");
    //     }
    //     return correctSoda;
    //   }
      
    //   private boolean enoughMoney(int amount) {
    //     if (amount >= 2) {
    //       return true;
    //     } else {
    //       System.out.println("You did not insert enough money.");
    //       return false;
    //     }
    //   }
      
    //   private boolean enoughSoda(String soda) {
    //     if (soda.equals("coke")) {
    //       if (cokeInventory > 0) {
    //         return true;
    //       } else {
    //         System.out.println("There are no cans of Coke.");
    //         return false;
    //       }
    //     } else if (soda.equals("sprite")) {
    //       if (spriteInventory > 0) {
    //         return true;
    //       } else {
    //         System.out.println("There are no cans of Sprite.");
    //         return false;
    //       }
    //     } else if (soda.equals("pepsi")) {
    //       if (pepsiInventory > 0) {
    //         return true;
    //       } else {
    //         System.out.println("There are no cans of Pepsi.");
    //         return false;
    //       }
    //     } else if (soda.equals("dr. pepper")) {
    //       if (drPepperInventory > 0) {
    //         return true;
    //       } else {
    //         System.out.println("There are no cans of Dr. Pepper.");
    //         return false;
    //       }
    //     }
    //     return false;
    //   }
      
    //   private void updateInventory(String soda) {
    //     if (soda.equals("coke")) {
    //       cokeInventory--;
    //     } else if (soda.equals("sprite")) {
    //       spriteInventory--;
    //     } else if (soda.equals("pepsi")) {
    //       pepsiInventory--;
    //     } else if (soda.equals("dr. pepper")) {
    //       drPepperInventory--;
    //     }
    //   }
      
    //   private void updateMoney() {
    //     money += 2;
    //   }
}
// add class definitions above this line

public class CodingExercise5 {
    public static void main(String[] args) {

        // add code below this line
        // Scenario 1 - Select a valid soda and a valid amount of money
        // SodaMachine myMachine = new SodaMachine();
        // myMachine.buySoda("coke", 4);
        // System.out.println(myMachine.getMoney());
        // System.out.println(myMachine.getCokeInventory());

        // Scenario 2 - Select an invalid soda and a valid amount of money
        // SodaMachine myMachine = new SodaMachine();
        // myMachine.buySoda("diet coke", 4);
        // System.out.println(myMachine.getMoney());
        // System.out.println(myMachine.getCokeInventory());
        // System.out.println(myMachine.getSpriteInventory());
        // System.out.println(myMachine.getPepsiInventory());
        // System.out.println(myMachine.getDrPepperInventory());

        // Scenario 3 - Select a valid soda and not enough money
        // SodaMachine myMachine = new SodaMachine();
        // myMachine.buySoda("sprite", 1);
        // System.out.println(myMachine.getMoney());
        // System.out.println(myMachine.getSpriteInventory());

        //Scenario 4 - The machine ran out of a particular soda
        SodaMachine myMachine = new SodaMachine();
        myMachine.setDrPepperInventory(0);
        myMachine.buySoda("dr. pepper", 2);
        System.out.println(myMachine.getMoney());
        System.out.println(myMachine.getDrPepperInventory());
        // add code above this line
    }
}