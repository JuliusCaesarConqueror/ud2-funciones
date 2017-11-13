import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer3 {
    public static int esPar(int valor){
        if(valor%2==0){
            System.out.println("El valor es PAR");
        }else {
            System.out.println("El valor es IMPAR");
        }
        return valor;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un valor");
        int valor=Integer.parseInt(br.readLine());
        esPar(valor);

    }
}
