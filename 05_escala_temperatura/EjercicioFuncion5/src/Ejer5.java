import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer5 {
public static void convertirTemperatura(int opcion){

        System.out.println("=== Temperaturas ===\n"+
                "1. Convertir a Fahrenheit\n"+
                "2. Convertir a Kelvin\n"+
                "3. Salir\n"+
                "Opción:");

}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double temperatura;
        int opcion;
        System.out.println("Escribe la temperatura en Cº");
        double celsius=Double.parseDouble(br.readLine());
        System.out.println("=== Temperaturas ===\n"+
                "1. Convertir a Fahrenheit\n"+
                "2. Convertir a Kelvin\n"+
                "3. Salir\n"+
                "Opción:");

        do{
            opcion=Integer.parseInt(br.readLine());
            convertirTemperatura(opcion);
            if(opcion!=3){
                switch(opcion){
                    case 1:
                        temperatura=((celsius*9)/5)+32;
                        System.out.println(celsius+" Cº son: "+temperatura+" ºF. ");break;
                    case 2:
                        temperatura=celsius+273.15;
                        System.out.println(celsius+" Cº son: "+temperatura+" ºF. ");break;
                    default:
                        System.out.println("No existe tal opción. ");break;
                }
            }
        }while(opcion!=3);
        System.out.println("Elegiste salir. ");
    }
}
