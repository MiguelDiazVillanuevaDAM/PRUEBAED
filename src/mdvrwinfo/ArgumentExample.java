package mdvrwinfo;

public class ArgumentExample {

	public static void main(String[] args) {
			System.out.printf("%n > Ejecutando %n");
			//Esta aplicacion acepta argumentos en la lista de ordenes
			
			if (args.length == 0) {
				System.out.println("No has tecleado ningun parametro");
			}
			else {
				String param1=args[0];
					if (param1.equals("--help")) {
						System.out.println("La ayuda esta en camino");
					}
					else {
						System.out.println("No lo entiendo");
					}
			}
	}
}
