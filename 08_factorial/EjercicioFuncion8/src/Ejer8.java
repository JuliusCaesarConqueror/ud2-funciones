
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer8 {
    public static int factorialrecursiva(int n){
        int r = 1;
        for (int i = 1; i <=n ; i++) {
            r*=i;
        }
        return r;

    }
public static int factorialiterativa(int n){
 //SI N>0 =(N-1)! * N  ; SI N=0 == 1
        if(n>0){
     factorialrecursiva(n-1);//LLAMO A LA RECURSIVA
 }else {
     return 1;
 }
return factorialrecursiva(n-1);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(factorialrecursiva(5));
        System.out.println(factorialiterativa(5));

    }



}



