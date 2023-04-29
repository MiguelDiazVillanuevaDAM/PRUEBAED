package mdvrwinfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 
 * @author Miguel
 *
 */
public class FUtil {

	public static boolean existe(File archivo) {
		boolean existe=false;
			
			if (archivo.exists()) {
				existe=true;
			}
		return existe;
	}
	public static boolean a(String texto) {
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner teclado=new Scanner(System.in);
			String archivo=teclado.next();
		teclado.close();
		String path="src/mdvrwinfo/";
		
		File fichero=new File(path+archivo);
		System.out.println(FUtil.existe(fichero));
		
		System.out.println(FUtil.a("hola"));
	}
}