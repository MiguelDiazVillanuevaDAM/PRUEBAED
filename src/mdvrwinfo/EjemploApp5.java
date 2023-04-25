package mdvrwinfo;

public class EjemploApp5 {
	public static void main(String[] args) {
		int valor=360;
		int lista[]= {5,100,0,-1,0};
		int divisor=0;
		
		try {
			int res=valor/divisor;
			System.out.println(res);
			int elem=lista[5];
			System.out.println(elem);

		}
		catch(ArithmeticException a) {
			divisor++;
			int res=valor/divisor;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("ERROR");
			System.out.println("INFO "+ e);
		}
		System.out.println("hola");
	}
}
