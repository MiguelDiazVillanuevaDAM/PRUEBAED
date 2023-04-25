package mdvrwinfo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EjemploApp3 {

	public static void main(String[] args) {
		
		try {
		//1. Crear objeto abrir
			FileWriter consola=new FileWriter("fichero.txt");
		//2. Escribo un caracter
			
			consola.write('H');
			consola.write('-');
			consola.write('I');
			consola.write('-');
			consola.write('J');
			consola.write('-');
			consola.write('K');
			consola.write('-');
			consola.write(13);   //salto de linea	
			
			consola.write("Frase escrita de golpe \n");
			consola.write('\r'); //salto de linea
			consola.write("Otra frase \n");

		
		//3. Cierro
		consola.close();
		
		}
		catch(IOException ioe){
			System.out.println("Error");
		}

	}

}