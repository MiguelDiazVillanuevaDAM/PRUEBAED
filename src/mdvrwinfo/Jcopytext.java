package mdvrwinfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Jcopytext {

	public static void main(String[] args) {
		try {
			String fichero;
			String copiafichero;
			BufferedWriter copia;
			if (args.length == 0) {
				System.out.println("No hay argumentos");
				throw new IllegalArgumentException("ERROR");
			}
			else {
					fichero=args[0];
					copiafichero=fichero+"_copy";
					copia=new BufferedWriter(new FileWriter(copiafichero));
			}
			
				
		BufferedReader original=new BufferedReader(new FileReader(fichero));
		
		String linea=original.readLine();
		
		while (linea != null) {
			copia.write(linea);
			copia.write(13);
			linea=original.readLine();
		}
		copia.write("//Hecho por Miguel Díaz Villanueva");
		
		copia.close();
		original.close();
		
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}

	}

}
