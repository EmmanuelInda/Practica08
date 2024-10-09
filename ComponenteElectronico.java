abstract class ComponenteElectronico extends DispositivoElectronico {
	private DispositivoElectronico esParteDe;

	public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
		super(fabricante, numeroSerie, marca, nombre, costo);
	}

	public DispositivoElectronico getEsParteDe() {
		return esParteDe;
	}

	public void setEsParteDe(DispositivoElectronico esParteDe) {
		this.esParteDe = esParteDe;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "{" +
				"fabricante='" + getFabricante() + '\'' +
				", numeroSerie='" + getNumeroSerie() + '\'' +
				", marca='" + getMarca() + '\'' +
				", nombre='" + getNombre() + '\'' +
				", costo=" + getCosto() +
				", esParteDe='" + (esParteDe != null ? esParteDe.getNombre() : "null") + '\'' +
				'}';
	}
}