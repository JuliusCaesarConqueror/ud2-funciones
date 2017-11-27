import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer7 {
           public static boolean esValido(String iban){
               //QUITAR ESPACIOS--> [...].replaceAll("\\s+","") EL MISMO CODIGO TE MUESTRA LO QUE HACE.
             iban=iban.replaceAll("\\s+","");
               //EXTRAER LOS 4 PRIMEROS CARACTERES---> [...].substring()
               //SI TIENES ALGUNA DUDA CTRL+Q EN EL CODIGO.

               String cuatroPrimeros=iban.substring(0,4);
               String restoCadena=iban.substring(4);
               //LLEVARLOS AL FINAL

               //CONVERTIR LETRAS A NUMEROS ---> [..].indexOF(".."); COGER LOS VALORES DE UNA DETERMINADA
               //CADENA DE TEXTOS.
              int num1= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(0))+10;
               int num2= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(1))+10;
               //MONTAR EL STRING FINAL
               String nuevoiban= restoCadena+num1+num2+ cuatroPrimeros;
               // HACER DIVISION Y COMPROBAR RESTO
               long numero=Long.parseLong(nuevoiban);
               return numero%97==1;
           }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String iban;
          if (esValido(iban: "ES98 2038 5778 9830 0076 0236")){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
        }
    }
    

