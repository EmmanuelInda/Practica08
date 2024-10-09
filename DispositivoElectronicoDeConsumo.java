abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
	private boolean encendido;	// Mutable

	public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido) {
		super(fabricante, numeroSerie, marca, nombre, costo);
		this.encendido = encendido;
	}

	boolean isEncendido() {
		return encendido;
	}

	void encender() {
		encendido = true;
	}

	void apagar() {
		encendido = false;
	}

	@Override
	public String toString() {
		return "DispositivoElectronicoDeConsumo{" +
				"encendido=" + encendido +
				", " + super.toString().replace("DispositivoElectronico{", "") +
				'}';
	}
}
