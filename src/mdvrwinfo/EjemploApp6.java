package mdvrwinfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class EjemploApp6 {
	public static void main(String[] args) {
		try {
		FileReader fuente=new FileReader("src/mdvrwinfo/EjemploApp2.java");
		int primerCaracter=0;
		char may=0;
		while (primerCaracter != -1) {
			primerCaracter=fuente.read();
			may=(char)primerCaracter;
			System.out.print(Character.toUpperCase(may));
		}
		//MOSTRAR EN MAYUSCULA EL FICHERO FUENTE COMPLETO
		fuente.close();
		}
		catch (FileNotFoundException file) {
			System.out.println("No esta el fichero");
			System.out.println(file);
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		
	}
		
}

