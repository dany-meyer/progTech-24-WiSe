package hnu.progtech;

public class Kreis {
    public double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getUmfang() {
        double umfang = 2*3.14 * radius ;
        return umfang;
    }
    public static void main(String args[]) {
        Kreis k1 = new Kreis(1); // Objekte
        System.out.println("Umfang k1 = "+k1.getUmfang());
    }

}
