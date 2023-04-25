package mdvrwinfo;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploApp {

	public static void main(String[] args) {
		
		try {
		// Lectura de  un caracter por teclado
		//1. Crear objeto abrir
			InputStreamReader teclado=new InputStreamReader(System.in);
		//2. Leo un caracter
			
		int car=teclado.read();
		
		//3. Cierro
		teclado.close();
		
		System.out.println("Has tecleado " + car);
		}
		catch(IOException ioe){
			System.out.println("Error");
		}

	}

}
