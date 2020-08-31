package guia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guia3 {

	public static void main(String[] args) throws IOException {
            Guia3();
	}
	
	public static void Guia3() throws IOException {
        
        System.out.println("Seleccione una opción para iniciar\n 1: Péndulo. \n 2: Ascensor.");
        
        BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
        String opcion = reader.readLine();
        CacularVariables calCacularVariables = new CacularVariables();
        switch (opcion) {
		case "1":
			System.out.println("Ingrese la longitud ed la cuerda: ");
			double longitud = Double.parseDouble(reader.readLine());
                        System.out.println("Ingrese la aceleración del péndulo: ");
			double aceleracion = Double.parseDouble(reader.readLine());
                        Pendulo pendu = new Pendulo(longitud, aceleracion);
                        System.out.println("El periodo de oscilación del péndulo es: ");
                        System.out.println("\n");
                        System.out.println(pendu.PeriodoOsilacion());
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia3();
			break;
        
		case "2":
                        calCacularVariables.ProgramaAscensor();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia3();
			break;
			
		default:
			break;
		}
	}
}