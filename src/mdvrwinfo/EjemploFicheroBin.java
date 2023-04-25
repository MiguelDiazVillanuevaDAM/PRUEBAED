package mdvrwinfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class EjemploFicheroBin {

	public static void main(String[] args) {
		String nombres[]= {"Miguel","Lucas","Alberto"};
		double numeros[]=new double[3];
		
			for (int i=0; i<numeros.length;i++) {
					numeros[i]=Math.random();
			}
			
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("alumnos.dam"))){
			dos.writeUTF(nombres[0]);
			dos.writeDouble(numeros[0]);
			dos.writeUTF(nombres[1]);
			dos.writeDouble(numeros[1]);
			dos.writeUTF(nombres[2]);
			dos.writeDouble(numeros[2]);
			
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		try(DataInputStream tres=new DataInputStream(new FileInputStream("alumnos.dam"))){
			String nombre;
			double num;
			
			for (int i=0;i<10;i++) {
				nombre=tres.readUTF();
				num=tres.readDouble();
				System.out.println("Escribio en fichero:");
				System.out.println(nombre+" "+num);
			}
			
		}
		catch(EOFException e){
			 System.out.printf("Final de Fichero %n");
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
	}
}
