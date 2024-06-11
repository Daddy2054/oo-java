package coding;

//add class definitions below this line

class Watch {
    private String manufacturer;
    private String model;
    private int diameter;
    private int waterResistance;
    private String material;

    public Watch(String manufacturer, String model, int diameter, int waterResistance, String material) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.diameter = diameter;
        this.waterResistance = waterResistance;
        this.material = material;
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    //possible solution
    // private String capitalize(String s) {
    //     String capitalizedString = "";
    //     capitalizedString += s.substring(0, 1).toUpperCase();
    //     capitalizedString += s.substring(1);
    //     return capitalizedString;
    //   }

    public String summary() {
        return "Manufacturer: " + capitalizeFirstLetter(manufacturer) +
                "\nModel: " + capitalizeFirstLetter(model) +
                "\nDiameter: " + diameter +
                " mm\nWater Resistance: " + waterResistance +
                " m\nMaterial: " + capitalizeFirstLetter(material);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWaterResistance() {
        return waterResistance;
    }

    public String getMaterial() {
        return material;
    }

    public void setManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setDiameter(int newDiameter) {
        diameter = newDiameter;
    }

    public void setWaterResistance(int newWaterResistance) {
        waterResistance = newWaterResistance;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }
}

// add class definitions above this line

public class CodingExercise2 {
    public static void main(String[] args) {

        // add code below this line

        Watch myWatch = new Watch("omega", "speedmaster", 42, 50, "steel");
        System.out.println(myWatch.summary());

        // add code above this line
    }
}