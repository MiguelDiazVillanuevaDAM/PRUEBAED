package mdvrwinfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FichBin {
	final static String path="src/mdvrwinfo/";
	public static boolean exists(String fichero) {
		boolean existe=false;
			File archivo=new File(path+fichero);
			
			if (archivo.exists()) {
				existe=true;
			}
		
		return existe;
	}
	public static boolean isGif89 (String fichImage) {
		boolean es=false;
		StringBuffer cabecera=new StringBuffer();
		try (FileInputStream fichero=new FileInputStream(path+fichImage)){
			for (int i=0; i<5;i++) {
				cabecera.append((char)fichero.read());
			}
			if (cabecera.toString().equals("GIF89")){
				System.out.println("Es GIF89");
				es=true;
			}
			
			return es;
		}
		catch(IOException ioe){
			return false;
		}
	}
	public static boolean isGif87 (String fichImage) {
		boolean es=false;
		StringBuffer cabecera=new StringBuffer();
		try (FileInputStream fichero=new FileInputStream(path+fichImage)){
			
			char unByte;
			for (int i=0; i<5;i++) {
				unByte=(char)fichero.read();
				cabecera.append(unByte);
			}
			
			if (cabecera.toString().equals("GIF87")){
				System.out.println("Es GIF87");
				es=true;
			}
			
			return es;
		}
		catch(IOException ioe){
			return false;
		}
	}
	public static boolean isPNG (String fichImage) {
		boolean es=false;
		StringBuffer cabecera=new StringBuffer();
		try (FileInputStream fichero=new FileInputStream(path+fichImage)){
			
			fichero.skip(1);
			char unByte;
			for (int i=0; i<3;i++) {
				unByte=(char)fichero.read();
				cabecera.append(unByte);
			}
			if ((cabecera.charAt(0) == 'P') && (cabecera.charAt(1) == 'N') && (cabecera.charAt(2) == 'G')){
				System.out.println("Es PNG");
				es=true;
			}
			
			return es;
		}
		catch(IOException ioe){
			return false;
		}
	}
	
	public static void main (String[] args) {
		System.out.println(FichBin.exists("novalido.gif"));
		System.out.println(FichBin.isGif89("planeta_animado.gif"));
		System.out.println(FichBin.isGif87("planeta_animado.gif"));
		System.out.println(FichBin.isPNG("redhat.png"));
	}
}
