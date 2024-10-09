import java.util.ArrayList;

public class AppDemoHerencia {
	public static void main(String[] args) {
		ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();

		Microprocesador cpu1 = new Microprocesador("Intel", "CPU12345", "Intel Core", "i7-9700K", 300.0f, 12, 3600000000L);
		Microprocesador cpu2 = new Microprocesador("AMD", "CPU54321", "AMD Ryzen", "Ryzen 9 3900X", 450.0f, 16, 3800000000L);

		Pantalla pantalla1 = new Pantalla("Samsung", "PN12345", "Samsung Display", "Galaxy S21 Screen", 150.0f, 1080, 2400);
		Pantalla pantalla2 = new Pantalla("Apple", "PN54321", "Apple Display", "iPhone 14 Screen", 200.0f, 1440, 3200);

		Sensor sensor1 = new Sensor("Samsung", "SN12345", "Samsung Sensor", "Huella Digital S21", 50.0f, "Huella", "N/A", 1);
		Sensor sensor2 = new Sensor("Apple", "SN54321", "Apple Sensor", "FaceID iPhone 14", 75.0f, "FaceID", "N/A", 2);

		Smartphone smartphone1 = new Smartphone("Samsung", "SM123456", "Galaxy", "Galaxy S21", 999.99f, false, cpu1, 8192, sensor1, pantalla1);
		Smartphone smartphone2 = new Smartphone("Apple", "SM654321", "iPhone", "iPhone 14", 1099.99f, false, cpu2, 16384, sensor2, pantalla2);

		listaDeSmartphones.add(smartphone1);
		listaDeSmartphones.add(smartphone2);

		ArrayList<Television> listaDeTVs = new ArrayList<>();

		Pantalla tvPantalla1 = new Pantalla("LG", "PNLG12345", "LG Display", "LG OLED Screen", 300.0f, 1920, 1080);
		Pantalla tvPantalla2 = new Pantalla("Sony", "PNSY54321", "Sony Display", "Sony 4K Screen", 350.0f, 3840, 2160);

		Television tv1 = new Television("LG", "TV123456", "LG Ultra", "LG OLED", 1499.99f, false, tvPantalla1);
		Television tv2 = new Television("Sony", "TV654321", "Sony Bravia", "Sony 4K", 1999.99f, false, tvPantalla2);

		listaDeTVs.add(tv1);
		listaDeTVs.add(tv2);

		System.out.println("Lista de Smartphones:");
		for (Smartphone sp : listaDeSmartphones)
			System.out.println(sp.toString());

		System.out.println("\nLista de Televisions:");

		for (Television tv : listaDeTVs)
			System.out.println(tv.toString());
	}
}
