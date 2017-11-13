import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer1 {
    public static double perimetroRectangulo(double base, double altura){
        double perimetro=(base*2)+(altura*2);
        return perimetro;

    }

   public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el valor de la base");
        double base=Double.parseDouble(br.readLine());
        System.out.println("Introduzca el valor de la altura");
        double altura=Double.parseDouble(br.readLine());
        double per=perimetroRectangulo(base,altura);
        System.out.println("El perimetro es: "+per+" u.");
    }
}
