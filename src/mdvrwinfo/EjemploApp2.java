package mdvrwinfo;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EjemploApp2 {

	public static void main(String[] args) {
		
		try {
		//1. Crear objeto abrir
			OutputStreamWriter consola=new OutputStreamWriter(System.out);
		//2. Escribo un caracter
			
		consola.write('H');
		consola.write('M');

		
		//3. Cierro
		consola.close();
		
		}
		catch(IOException ioe){
			System.out.println("Error");
		}

	}

}
