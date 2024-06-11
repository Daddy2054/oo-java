//add class definitions below this line

class Phone {
    private String model;
    private int storage;
    private int megapixels;

    public Phone(String mo, int s, int me) {
        model = mo;
        storage = s;
        megapixels = me;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setModel(String newModel) {
        model = newModel;
    }
}

// add class definitions above this line

public class Setters {
    public static void main(String[] args) {
        // add code below this line

        Phone myPhone = new Phone("iPhone", 256, 12);
        System.out.println(myPhone.getModel());
        myPhone.setModel("Pixel 5");
        System.out.println(myPhone.getModel());

        // add code above this line
    }
}
