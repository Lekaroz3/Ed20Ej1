

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}
	

	public int vocales(String cadena) {
		char letra;
		int ct = 0;
		for(int i = 0; i<cadena.length();i++) {
			letra = cadena.charAt(i);
			if (Character.isLowerCase(letra)) {
				if ((letra=='a') || (letra=='e') || (letra=='i') || (letra=='o') || (letra=='u')){ 
				    ct++;
				  }

			}
		}
		
		return ct;
	}
	
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		
		for (int i = cadena.length()-1; i >=0;i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i) ;
		}
		
		return cadenaInvertida;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int ct = 0;
		
		for (int i = 0; i < cadena.length();i++) {
			if (cadena.charAt(i) == caracter) {
				ct++;
			}
		}
		
		return ct;
	}
	
}
