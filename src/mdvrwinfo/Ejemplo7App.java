package mdvrwinfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejemplo7App {
	public static String ComprobarPalabra(String palabra) {
		String devolver=palabra;
			if (devolver.equalsIgnoreCase("EjemploApp2")) {
				devolver="EjemploCopia";
			}
		return devolver;
	}
	public static void main(String[] args) {
		
		try {
			FileReader original=new FileReader("src/mdvrwinfo/EjemploApp2.java");
			BufferedReader filtroreader=new BufferedReader(original);
			FileWriter copia=new FileWriter("src/mdvrwinfo/EjemploCopia.java");
			BufferedWriter filtrowriter=new BufferedWriter(copia);
			
			String linea=filtroreader.readLine();;
			String array[];
			String palabra;
			while (linea != null) {
				array=linea.split(" ");
				
				for (int i=0;i<array.length;i++) {
					palabra=ComprobarPalabra(array[i]);
					filtrowriter.write(palabra+" ");
				}
				filtrowriter.write(13);
				linea=filtroreader.readLine();
			}
			Date date = new Date();
			DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String convertido = fechaHora.format(date);
			
			filtrowriter.write("//Hecho por Miguel "+convertido);
			
			filtrowriter.close();
			original.close();
			filtroreader.close();
			copia.close();
			
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
