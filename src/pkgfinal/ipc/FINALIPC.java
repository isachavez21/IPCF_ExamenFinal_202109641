package pkgfinal.ipc;
import java.util.Scanner;
public class FINALIPC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        Scanner inputEx = new Scanner(System.in);  
        
        int option = 0;
        while (option != 4){
            System.out.println("Menú:\n"
                + "> (1) Programa 1\n"
                + "> (2) Programa 2\n"
                + "> (3) Programa 3\n"
                + "> (4) Salir");
            System.out.print(">>>");
            option = input.nextInt();

            if (option == 1){
                int num1,num2;
        
                System.out.println("Ingresa el primer número");
                num1 = inputEx.nextInt();
                System.out.println("Ingresa el segundo número");
                num2 = inputEx.nextInt();
                System.out.println("El mayor de los dos números es " + Math.max(num1,num2));
                
            } else if (option == 2){
                int nofilas;
                System.out.print("Introduce el numero de filas: ");
                nofilas = inputEx.nextInt();
                
                if (nofilas%2!=0){
                    for(int altura = 1; altura<=Math.ceil((float)nofilas/2); altura++){
                        for(int blancos = 1; blancos<=nofilas-altura; blancos++){
                            System.out.print(" ");
                        }
                        for(int asteriscos=1; asteriscos<=(altura); asteriscos++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Recuerda: Debes ingresar solo números IMPARES");
                }
            } else if (option == 3){
                System.out.println("PROGRAMA DE VAQUITAS");
            }
        }
    }
}
   