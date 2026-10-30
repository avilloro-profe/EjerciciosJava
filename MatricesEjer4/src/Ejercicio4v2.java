/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos
(llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá
las notas por teclado y luego el programa mostrará la nota mínima, máxima y
media de cada alumno.
 */
public class Ejercicio4v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_ALUMNOS=4, NUM_NOTAS=5;
		double mayor,menor,suma,media;
		double[] alumno; 
		
		double[][] notas = new double[NUM_ALUMNOS][NUM_NOTAS];
		
		for (int i = 0; i < notas.length; i++) {
			alumno = notas[i];
			// El elemento notas[i] es el vector que representa al alumno i+1
			mayor = alumno[0];
			menor = alumno[0];
			suma = 0;
			for (int j = 1; j < alumno.length; j++) {
				// El valor i representa al alumno i+1
				// El valor j representa la nota (j+1)º del alumno
				if(alumno[j] > mayor) {
					mayor = alumno[j];
				}
				if(alumno[j] < menor) {
					menor = alumno[j];
				} 
				suma += alumno[j];
			} 
			
			// ya he procesado notas[i], que es el alumno i+1
			media = suma / notas[i].length;
			System.out.println("Máximo alumno " + (i+1) + ": " + mayor);
			System.out.println("Mínimo alumno " + (i+1) + ": " + menor);
			System.out.println("Media alumno " + (i+1) + ": " + media);
		}
	}

}
