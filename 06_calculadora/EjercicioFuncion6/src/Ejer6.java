import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejer6 {
    public static void longitud(double radio) {
        double longitud = radio * 2;
        System.out.println("La longitud es: " + longitud);
    }
    public static void area(double radio) {
        double area = Math.pow(radio,2) *Math.PI;
        System.out.println("El área es: " + area);
    }
    public static void volumen(double radio) {
        double volumen = (Math.pow(radio,3)* 4) / 3;
        System.out.println("El volumen es: " + volumen);
    }
    //--------------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char opcion;
            do {
                System.out.println("=== Calculadora ===\n" +
                        "a) Longitud de la circunferencia\n" +
                        "b) Área del círculo\n" +
                        "c) Volumen de la esfera\n" +
                        "d) Salir\n" +
                        "Opción:");
                double radio=0;
                opcion = br.readLine().toLowerCase().charAt(0);
                if (opcion == 'a' || opcion == 'b' || opcion == 'c') {
                    System.out.println("Introduce el valor del radio ");
                     radio = Double.parseDouble(br.readLine());
                }
                // Antes el if englobaba al switch por lo tanto no se llegaba a leer "opcion", por lo tanto no te da el
                // mensaje de error cuando insertas en la entrada del teclado una letra erronea
                    switch (opcion) {
                        case 'a':
                            longitud(radio);
                            break;
                        case 'b':
                            area(radio);
                            break;
                        case 'c':
                            volumen(radio);
                            break;
                        default:
                            System.out.println("No existe tal opción.");
                            break;
                    }

            } while (opcion!='d');
        System.out.println("Elejiste salir ");
        }
    }

