/*ELABORA UN PROGRAMA PARA CONVERTIR UN NÚMERO DECIMAL N DADO POR TECLADO A BINARIO. */
import java.util.Scanner;
class binarios{

public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    /*variables*/
    int numero;
    String binario = "";
    char letra;
    do{
            do{
                System.out.println("Ingrese un numero igual o mayor a 0 para convertir a binario: ");
                numero = entrada.nextInt();
            }while(numero < 0);
            if(numero > 0){
                 while(numero > 0){
                    if(numero % 2 == 0){
                        binario = "0" + binario;
                    }else{
                        binario = "1" + binario;
                    }
                    numero = (int) numero/2;
                }
                System.out.println("La conversion del numero a sistema binario es: "+binario + ".");
                System.out.println("");
            }else{
                System.out.println("El numero binario de cero es: 0");
            }
        System.out.println("Si desea repetir el programa escriba la letra <n> si no es asi, escribe cualquier otra: ");
        letra = entrada.next().charAt(0);
    }while(letra == 'n');
}
}

