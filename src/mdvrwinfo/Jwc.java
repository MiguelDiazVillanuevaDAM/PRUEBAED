package mdvrwinfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Jwc {

	public static void main(String[] args) {
		try {
			Scanner teclado=new Scanner(System.in);
				String nombrefichero=teclado.next();
			teclado.close();
		BufferedReader fichero=new BufferedReader(new FileReader("src/mdvrwinfo/"+nombrefichero));
		int car=0;
		int contadorcar=0;
			while (car != -1) {
				car=fichero.read();
				contadorcar++;
			}
		System.out.println("Hay "+contadorcar+" caracteres");
		fichero.close();
		fichero=new BufferedReader(new FileReader("src/mdvrwinfo/"+nombrefichero));
		String linea="";
		int contadorlineas=0;
			while (linea != null) {
				linea=fichero.readLine();
				contadorlineas++;
			}
			System.out.println("Hay "+(contadorlineas-1)+" lineas");
		fichero.close();
		}
		catch(FileNotFoundException file) {
			System.out.println("No existe el fichero");
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
	}
}