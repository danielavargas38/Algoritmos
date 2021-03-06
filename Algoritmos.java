/* 
Daniela Vargas Zuleta 
Cc. 1036686455
Tdea 
Ingenieria de sofware 
*/
package AlgoritmosRecursivos;
import java.util.*;
public class Algoritmos {
    public double Iterativo(double numero1){
        double total = 0;
                for (long i = 1; i <= numero1; i++) {
            total = (1.0/i) + total;
                }
        return total;
    }
        public static double Recursiva(double numero1) {
            if (numero1 == 1){
                return 1;
            }else{
                return (1 / (double)numero1) + Recursiva(numero1 - 1);
            }
     }
        public static double loge(int n) {
            if(n == 0){
                return 1;
            }else{
                return (1 / (double)fact(n)) + loge (n - 1);
            }
       }
       public static int fact( int n){
           if(n == 1){
               return 1;
           }else{
               return n * fact(n - 1);
           }
       }
         static public long factorial (long n) {
           if ( n == 0 || n == 1){
               return 1; 
           } else {
               return n * factorial (--n);
           }
       }
         long f (int n) {
             if ( n == 0|| n == 1){
             return 1;
             }else{                         
             return 3 * f(n - 2) + 2 * f ( n - 1);
             }
         }
         long F (int n) {
             if( n == 0 || n == 1){
             return 1;
             }else{ if(n % 2 == 0){
             return 2 + f ( n -1);
             }else{
                 return 3 + f(n-2);
             }
           }
         }
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Algoritmos a = new Algoritmos();
         System.out.println("ingrese numeros :");
         double numero1 = leer.nextDouble();
         System.out.println(" La suma iterativa es :" + a.Iterativo(numero1));
         System.out.println(" La suma recursiva es :" +  Algoritmos.Recursiva(numero1));
         System.out.println(" Respuesta intentando hallar el numero es  :" + Algoritmos.loge(8));
         System.out.println(" El factorial es :" + Algoritmos.factorial(5));
         System.out.println(" La secuencia numerica del problema 4 es :" + a.f(5));
         System.out.println(" La secuencia numerica del problema 5 es :" + a.F(8));
    }
    }