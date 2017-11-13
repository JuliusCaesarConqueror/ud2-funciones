import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer4 {
    public static void convertirTemperatura(double valor){
        double f=((valor*9)/5)+32;
        System.out.println("El valor en Cº: "+valor+" es: "+f+" ºF.");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el valor de la temperatura en Cº. ");
        double valor=Double.parseDouble(br.readLine());
        convertirTemperatura(valor);

    }
}
