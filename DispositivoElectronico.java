import java.util.ArrayList;

abstract class DispositivoElectronico {
	private String fabricante;	// Inmutable
	private String numeroSerie;	// Inmutable
	private String marca;		// Inmutable
	private String nombre;		// Inmutable
	private float costo;		// Mutable
	private ArrayList<ComponenteElectronico> componentes;	// Mutable

	public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
		this.fabricante = fabricante;
		this.numeroSerie = numeroSerie;
		this.marca = marca;
		this.nombre = nombre;
		this.costo = costo;
		this.componentes = new ArrayList<>();
	}

	boolean agregarComponente() {
		return true;
	}

	boolean quitarCompente() {
		return true;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public String getNombre() {
		return nombre;
	}

	public float getCosto() {
		return costo;
	}

	public ArrayList<ComponenteElectronico> getComponentes() {
		return componentes;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		StringBuilder componentes = new StringBuilder();

		for (ComponenteElectronico componente : this.componentes)
			componentes.append(componente.toString()).append(", ");

		if (componentes.length() > 0)
			componentes.setLength(componentes.length() - 2);

		return "DispositivoElectronico{" +
				"fabricante='" + fabricante + '\'' +
				", numeroSerie='" + numeroSerie + '\'' +
				", marca='" + marca + '\'' +
				", nombre='" + nombre + '\'' +
				", costo=" + costo +
				", componentes=[" + componentes + "]" +
				'}';
	}
}