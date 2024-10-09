public class Sensor extends ComponenteElectronico {
	private String tipo;			// Inmutable
	private String unidadDeMedida;	// Inmutable
	private int valor;				// Inmutable

	public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, String tipo, String unidadDeMedida, int valor) {
		super(fabricante, numeroSerie, marca, nombre, costo);
		this.tipo = tipo;
		this.unidadDeMedida = unidadDeMedida;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return super.toString().replace("}", "") +
				", tipo='" + tipo + '\'' +
				", unidadDeMedida='" + unidadDeMedida + '\'' +
				", valor=" + valor +
				'}';
	}
}