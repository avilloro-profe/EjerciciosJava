import java.util.Iterator;

/**
 * Ejemplo interesante para tratar con la función split() de la clase String
 * con el tratamiento de un csv
 */

public class EjemploCSV {
	public static void main(String[] args) {
		String csvCompleto = "Nombre,Apellido,Correo,Edad\r\n"
				+ "Lucía,Gómez,lucia@ejemplo.com,28\r\n"
				+ "Carlos,Pérez,carlos@ejemplo.com,34\r\n"
				+ "Ana,Martínez,ana@ejemplo.com,22";
		
		String[] lineas = csvCompleto.split("\n");
		//Cabecera es lineas[0]
		System.out.println(lineas[0]);
		String[] elementosCabecera = lineas[0].split(",");
		
		for (int i = 1; i < lineas.length; i++) {
			System.out.println("linea " + i);
			for (int j = 0; j < elementosCabecera.length; j++) {
				String[] elementosLinea = lineas[i].split(",");
				System.out.println(elementosCabecera[j].replace("\n","").replace("\r", "")+ ": " + elementosLinea[j]);
			}
		}
		
		
		
		
		

		
	}

}
