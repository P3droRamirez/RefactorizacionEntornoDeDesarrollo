package proyectopruebaentorno;

public class Coche {

    public static void main(String[] args) {
    }

    private String m;
    private String mod;
    private int a;
    private double v;
    private double d;

    public Coche() {
    }

    public Coche(String m, String mod, int a, double v, double d) {
        this.m = m;
        this.mod = mod;
        this.a = a;
        this.v = v;
        this.d = d;
    }

    public Coche(String m, String mod) {
        this(m, mod, 2022, 1.0, 1.0);
    }

    public Coche(String m, int a) {
        this.m = m;
        this.a = a;
    }

    public String gM() {
        return m;
    }

    public String gMod() {
        return mod;
    }

    public int gA() {
        return a;
    }

    public double gV() {
        return v;
    }

    public double gD() {
        return d;
    }

    @Override
    public String toString() {
        return " Soy un Coche de " + "m=" + m + ", mod=" + mod + ", a=" + a + ", v=" + v + ", d=" + d + '}';
    }

    public void arr() {
        if (d > 0) {
            System.out.println("EL coche " + m + " " + mod + " del año " + a + " ha arrancado");
        } else {
            System.out.println("El coche no puede arrancar porque no tiene el deposito lleno");
        }
    }

    public double rep(double l) {
        return d += l;
    }

    public double ac(double acel) {
        return v += acel;
    }

    public double viajar(double k) {
        double lNec = k * 0.07;

        if (d >= lNec) {
            d -= lNec;
            double t = k / v;
            System.out.println("Viaje completado. Tiempo de viaje: " + t + " segundos.");
            return t;
        } else {
            System.out.println("Necesitas repostar para realizar el viaje.");
            return 0;
        }
    }

}
