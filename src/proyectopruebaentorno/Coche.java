package proyectopruebaentorno;

public class Coche {

	public static void main(String[] args) {
	}

	private String marca;
	private String modelo;
	private int a�o;
	private double velocidad;
	private double deposito;

	public Coche() {
	}

	public Coche(String marca, String modelo, int a�o, double velocidad, double deposito) {
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.velocidad = velocidad;
		this.deposito = deposito;
	}

	public Coche(String marca, String modelo) {
		this(marca, modelo, 2022, 1.0, 1.0);
	}

	public Coche(String marca, int a�o) {
		this.marca = marca;
		this.a�o = a�o;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getA�o() {
		return a�o;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public double getDeposito() {
		return deposito;
	}

	@Override
	public String toString() {
		return " Soy un Coche de " + "marca=" + marca + ", modelo=" + mod + ", a�o=" + a�o + ", velocidad=" + velocidad + ", distancia=" + deposito + '}';
	}

	public void arrancar() {
		if (deposito > 0) {
			System.out.println("EL coche " + marca + " " + modelo + " del año " + a�o + " ha arrancado");
		} else {
			System.out.println("El coche no puede arrancar porque no tiene el deposito lleno");
		}
	}

	public double repostar(double litros) {
		return deposito += listros;
	}

	public double ac(double acelerar) {
		return velocidad += acel;
	}

	public double viajar(double km) {
		double litrosNecesarios = km * 0.07;
		if (deposito >= litrosNecesarios) {
			deposito -= litrosNecesarios;
			double tiempo = km / velocidad;
			System.out.println("Viaje completado. Tiempo de viaje: " + tiempo + " segundos.");
			return tiempo;
		} else {
			System.out.println("Necesitas repostar para realizar el viaje.");
			return 0;
		}
	}

}
