package mdvrwinfo;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;

public class EjemploApp4 {

	public static void main(String[] args) {
		
		try {
		// Leer el primer caracter
		//1. Crear objeto abrir
			FileReader consola =  new FileReader("fichero.txt");
		int car=consola.read();
		car=consola.read();
		car=consola.read();
		System.out.println((char)car);
		consola.close();
		
		consola =  new FileReader("fichero.txt");
		while (car != -1) {
			car=consola.read();
			System.out.print((char)car);
		}
		//3. Cierro
		consola.close();
	
		}
		catch(IOException ioe){
			System.out.println("Error");
		}

	}

}