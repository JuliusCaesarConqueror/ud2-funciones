import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejer6 {
    public static void longitud(double radio){
        double longitud=radio*2;
        System.out.println("La longitud es: "+longitud);
    }
    public static void area (double radio){
        double area=(radio*radio)*3.1416;
        System.out.println("El área es: "+area);
    }
    public static void volumen (double radio){
        double volumen=((radio*radio*radio)*4)/3;
        System.out.println("El volumen es: "+volumen);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion;
        System.out.println("Introduce el valor del radio ");
        double radio=Double.parseDouble(br.readLine());
        do{
        System.out.println("=== Calculadora ===\n" +
                "a) Longitud de la circunferencia\n" +
                "b) Área del círculo\n" +
                "c) Volumen de la esfera\n" +
                "d) Salir\n" +
                "Opción:");
        opcion=br.readLine();
        if(!opcion.equals("D")){
            switch(opcion.toUpperCase()){
                case "A":
                    longitud(radio);break;
                case "B":
                    area(radio);break;
                case "C":
                    volumen(radio);break;
                default:
                    System.out.println("No existe tal opción.");break;
            }
            }
        }while(!opcion.equals("D"));
        System.out.println("Elegiste salir.");
    }
}
