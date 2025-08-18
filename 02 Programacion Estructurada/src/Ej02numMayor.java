import java.util.Scanner;

public class Ej02numMayor {
    public static void main(String[] args) {

        /*Escribe un programa en Java que pida al usuario tres números enteros y
        determine cuál es el mayor.  */

        Scanner teclado = new Scanner(System.in);
        int cantNum = 3, num, numMax;

        System.out.println("Ingresa el primer numero: ");
        num = teclado.nextInt();
        numMax = num;

       for (int i = 2; i <= cantNum; i++) {
           System.out.println("Ingresa el numero " + i + ": ");
           num = teclado.nextInt();
           if (num > numMax) {
               numMax = num;

           }

       }
        System.out.println("El numero mas alto fue: " + numMax);
    }

}
