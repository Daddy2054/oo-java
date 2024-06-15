package inheritance;

class CelestialBody {
    private double size;
    private double mass;
    private String composition;
    private String name;

    public CelestialBody(double s, double m, String c, String n) {
        size = s;
        mass = m;
        composition = c;
        name = n;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double newSize) {
        size = newSize;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double newMass) {
        mass = newMass;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String newComposition) {
        composition = newComposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

// add class definitions below this line
class Satellite extends CelestialBody {
    private String hostPlanet;

    public Satellite(double s, double m, String c, String n, String h) {
        super(s, m, c, n);
        hostPlanet = h;
    }

    public String getHostPlanet() {
        return hostPlanet;
    }
}

class Planet extends CelestialBody {
    private String hostStar;

    public Planet(double s, double m, String c, String n, String h) {
        super(s, m, c, n);
        hostStar = h;
    }

    public String getHostStar() {
        return hostStar;
    }
}

// add class definitions above this line

public class Exercise1 {
    public static void main(String[] args) {

        // add code below this line

        Satellite s = new Satellite(2651, 3716, "helium", "moon", "earth");
        Planet p = new Planet(5349, 8910, "nitrogen", "earth", "sun");

        System.out.println(s.getSize()); // 2651.0
        System.out.println(s.getMass()); // 3716.0
        System.out.println(s.getComposition()); // helium
        System.out.println(s.getName()); // moon
        System.out.println(s.getHostPlanet()); // earth
        System.out.println(p.getSize()); // 5349.0
        System.out.println(p.getMass()); // 8190.0
        System.out.println(p.getComposition()); // nitrogen
        System.out.println(p.getName()); // earth
        System.out.println(p.getHostStar()); // sun
        // add code above this line
    }
}