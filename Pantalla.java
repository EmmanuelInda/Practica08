public class Pantalla extends ComponenteElectronico {
	private int resolucionX;	// Inmutable
	private int resolucionY;	// Inmutable

	public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo, int resolucionX, int resolucionY) {
		super(fabricante, numeroSerie, marca, nombre, costo);
		this.resolucionX = resolucionX;
		this.resolucionY = resolucionY;
	}

	public int getResolucionX() {
		return resolucionX;
	}

	public int getResolucionY() {
		return resolucionY;
	}

	@Override
	public String toString() {
		return super.toString().replace("}", "") +
				", resolucionX=" + resolucionX +
				", resolucionY=" + resolucionY +
				'}';
	}
}