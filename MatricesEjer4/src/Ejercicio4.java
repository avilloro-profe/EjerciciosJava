/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos
(llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá
las notas por teclado y luego el programa mostrará la nota mínima, máxima y
media de cada alumno.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_ALUMNOS=4, NUM_NOTAS=5;
		double mayor,menor,suma,media;
		
		double[][] notas = new double[NUM_ALUMNOS][NUM_NOTAS];
		
		for (int i = 0; i < notas.length; i++) {
			// El elemento notas[i] es el vector que representa al alumno
			// i+1
			mayor = notas[i][0];
			menor = notas[i][0];
			suma = 0;
			for (int j = 1; j < notas[i].length; j++) {
				// El valor i representa al alumno i+1
				// El valor j representa la nota (j+1)º del alumno
				if(notas[i][j] > mayor) {
					mayor = notas[i][j];
				}
				if(notas[i][j] < menor) {
					menor = notas[i][j];
				} 
				suma += notas[i][j];
			} // ya he procesado notas[i], que es el alumno i+1
			media = suma / notas[i].length;
			System.out.println("Máximo alumno " + (i+1) + ": " + mayor);
			System.out.println("Mínimo alumno " + (i+1) + ": " + menor);
			System.out.println("Media alumno " + (i+1) + ": " + media);
		}
	}

}
