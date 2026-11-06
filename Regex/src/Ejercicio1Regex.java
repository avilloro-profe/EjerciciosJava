/**
1)  Validar un número entero
2) Validar un número entero positivo
3) Validar un número entero negativo
4) Validar DNI, 8 números y una letra al final
5) Validar una IP
6) Validar una matrícula de un coche con formato 0000XXX
7) Validar un número binario
8) Validar un número octal
9) Validar un número hexadecimal
10) Validar número real
11) Validar número real positivo
12) Validar número real negativo
13) Validar número real con x decimales
14) Validar número real positivo con x decimales.
15) Validar número real negativo con x decimales.
16) Validar una fecha con formato dd/mm/aaaa
17) Validar un nombre, incluyendo nombres compuestos.
18) Validar un email.
19) Valida un nombre de usuario en twitter, empieza por @ y puede contener letras
mayúsculas y minúsculas, números, guiones y guiones bajos.
20) Validar ISBN de 13 dígitos, siempre empieza en 978 o 979
 */
public class Ejercicio1Regex {
	public static void main(String[] args) {
		
		String numeroEntero = "-1234";
		//consideramos positivo o negativo
		System.out.println(numeroEntero.matches("-{0,1}[0-9]+"));
		
		String dni = "12345678-z".toLowerCase();
		System.out.println(dni.matches("[0-9]{8}\\-{0,1}[a-z]"));
		
		String octal = "2757134";
		System.out.println(octal.matches("-{0,1}[0-7]+"));
		
		String hex = "a0e22ff";
		System.out.println(hex.matches("-{0,1}[0-9a-f]+"));
		
		String fecha = "01/01/1999";
		System.out.println(fecha.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
		
		String email = "avilloro@cpifpbajoaragon.es";
		System.out.println(email.matches(".+@.+\\..+"));
		
		String isbn = "9780123456789";
		System.out.println(isbn.matches("(978|979)[0-9]{10}"));
		
		String ip = "192.168.1.12";
		System.out.println(ip.matches("([0-9]{1,3}\\.){3}[0-9]{1,3}"));
		
		String matricula = "1234ABC".toLowerCase();
		System.out.println(isbn.matches("[0-9]{4}[a-z]{3}"));
		
		String real = "-1234.465";
		System.out.println(real.matches("-{0,1}[0-9]+\\.{0,1}[0-9]*"));
				
		
		}

}
