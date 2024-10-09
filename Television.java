public class Television extends DispositivoElectronicoDeConsumo {
	private Pantalla pantalla;	// Inmutable

	public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Pantalla pantalla) {
		super(fabricante, numeroSerie, marca, nombre, costo, encendido);
		this.pantalla = pantalla;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	@Override
	public String toString() {
		return "Television{" +
				"pantalla=" + pantalla +
				", " + super.toString() +
				'}';
	}
}