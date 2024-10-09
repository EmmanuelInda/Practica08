public class Smartphone extends Computadora {
	private Sensor sensorDeHuella;	// Inmutable
	private Pantalla pantalla;		// Inmutable

	public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Microprocesador cpu, long ramMB, Sensor sensorDeHuella, Pantalla pantalla) {
		super(fabricante, numeroSerie, marca, nombre, costo, encendido, cpu, ramMB);
		this.sensorDeHuella = sensorDeHuella;
		this.pantalla = pantalla;
	}

	public Sensor getSensorDeHuella() {
		return sensorDeHuella;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	@Override
	public String toString() {
		return "Smartphone{" +
				"sensorDeHuella=" + sensorDeHuella +
				", pantalla=" + pantalla +
				", " + super.toString() +
				'}';
	}
}