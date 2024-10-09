public class Microprocesador extends ComponenteElectronico {
	private int cacheRAM;		// Inmutable
	private long velocidadHz;	// Inmutable

	public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo, int cacheRAM, long velocidadHz) {
		super(fabricante, numeroSerie, marca, nombre, costo);
		this.cacheRAM = cacheRAM;
		this.velocidadHz = velocidadHz;
	}

	public int getCacheRAM() {
		return cacheRAM;
	}

	public long getVelocidadHz() {
		return velocidadHz;
	}

	@Override
	public String toString() {
		return super.toString().replace("}", "") +
				", cacheRAM=" + cacheRAM +
				", velocidadHz=" + velocidadHz +
				'}';
	}
}