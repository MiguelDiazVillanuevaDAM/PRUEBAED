package mdvrwinfo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Jtype {
	public static void main(String[] args) {
		
		try {
			//Scanner teclado=new Scanner(System.in);
			if (args.length == 0) {
				System.out.println("No has escrito el fichero");
			}
			else{
				
			
				String fichero=args[0];
				//teclado.close();
			
				BufferedReader lectura=new BufferedReader(new FileReader(fichero));
				int car=0;
			
				//String linea=lectura.readLine();
			
				while (car != -1) {
					car=lectura.read();
					System.out.print((char)car);
				}
			
			//while (linea != null) {
			//	System.out.println(linea);
			//	linea=lectura.readLine();
			//}
				lectura.close();
			}
		}
		catch(FileNotFoundException fichero) {
			System.out.println("No existe");
		}
		catch(IOException ieo) {
			System.out.println(ieo);
		}
	}
}
