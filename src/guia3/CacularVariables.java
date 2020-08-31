package guia3;

import static guia3.Guia3.Guia3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CacularVariables {
    public void ProgramaAscensor() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int RunAscensor = 1;
        System.out.println("Ingrese numero de pisos del Edificio: ");
        int numeroPisos = Integer.parseInt(reader.readLine());
        System.out.println("Ingrese numero de sotanos del Edificio: ");
        int numeroSotanos = Integer.parseInt(reader.readLine());
        Ascensor contextAsc = new Ascensor(numeroPisos, numeroSotanos);
        
        while (RunAscensor == 1) {            
            System.out.println("Seleccione una opción \n 1: Subir Piso. \n 2: Bajar Piso. \n 3: Toal Pisos. \n 4: Piso Actual.");
            String opcion = reader.readLine();
            
                switch (opcion) {
		case "1":
                    if (contextAsc.SubirPiso() == 0) {
                        System.out.println("No es posible subir mas pisos \n");
                    }
                    else
                    {
                        System.out.println("Se subio un piso \n");
                    }
                    
                    System.out.println("Estamos en el piso " + contextAsc.getPisoActual() + " \n");
                    break;
                case "2":
                    if (contextAsc.BajarPiso() == 0) {
                        System.out.println("No es posible bajar mas pisos \n");
                    }
                    else
                    {
                        System.out.println("Se bajo un piso \n");
                    }
                    
                    System.out.println("Estamos en el piso " + contextAsc.getPisoActual() + " \n");
                    break;
                case "3":
                    System.out.println("El total de pisos del Edificio es: " + contextAsc.TotalPisos() + " \n");
                    break;
                case "4":
                    System.out.println("Estamos en el piso " + contextAsc.getPisoActual() + " \n");
                    break;
                default:
		    break;
                    }
                
                System.out.println("Seleccione una opción \n 1: Continuar. \n 2: Salir.");
                RunAscensor = Integer.parseInt(reader.readLine());
                
        }
    }
}