package hnu.progtech;

public class Rechteck {
    private double a,b;


    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getUmfang() {
        double umfang = 2*(a+b);
        return umfang;
    }

    public static void main(String args[]) {
        Rechteck r1 = new Rechteck(5.0,4.0); // Objekte
        Rechteck r2 = new Rechteck(3.0,2.0);
        System.out.println("Umfang r1 = "+r1.getUmfang());
    }

}
