public class Computadora extends DispositivoElectronicoDeConsumo {
	public Microprocesador cpu;	// Mutable
	public long ramMB;			// Mutable

	public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Microprocesador cpu, long ramMB) {
		super(fabricante, numeroSerie, marca, nombre, costo, encendido);
		this.cpu = cpu;
		this.ramMB = ramMB;
	}

	public Microprocesador getCpu() {
		return cpu;
	}

	public long getRamMB() {
		return ramMB;
	}

	public void setCpu(Microprocesador cpu) {
		this.cpu = cpu;
	}

	public void setRamMB(long ramMB) {
		this.ramMB = ramMB;
	}

	@Override
	public String toString() {
		return "Computadora{" +
				"cpu=" + cpu +
				", ramMB=" + ramMB +
				", " + super.toString().replace("DispositivoElectronicoDeConsumo{", "") +
				'}';
	}
}