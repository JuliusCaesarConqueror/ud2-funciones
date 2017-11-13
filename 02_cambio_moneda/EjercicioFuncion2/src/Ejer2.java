import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer2 {
    public static void calcularCambio(String moneda , double valor){
        double cambio=0;
             switch (moneda){
                 case "USD":
                     cambio=valor*1.16635;
                 System.out.println(valor+" euros son: "+cambio+" USD.");break;
                 case "GBP":
                     cambio=valor* 0.889523;
                     System.out.println(valor+" euros son: "+cambio+" GBP.");break;
                 case "CNY":
                     cambio=valor*7.74560;
                     System.out.println(valor+" euros son: "+cambio+" CNY.");break;
                 case "JPY":
                     cambio=valor*132.508;
                     System.out.println(valor+" euros son: "+cambio+" JPY.");break;
                 default:
                     System.out.println("La moneda no está en la base de datos."); break;
            }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe una cantidad en euros ");
        double valor=Double.parseDouble(br.readLine());
        System.out.println("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        String moneda=br.readLine();
        calcularCambio(moneda,valor);
    }
}
