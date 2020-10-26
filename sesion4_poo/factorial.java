/*ESCRIBA UN PROGRAMA QUE LEA UN ENTERO NO NEGATIVO Y QUE CALCULE E IMPRIMA SU FACTORIAL. */
import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int factorial = 1;
        char letra;
        do{
                System.out.println("Ingrese un numero entero positivo para obtener su factorial: ");
                numero = entrada.nextInt();
            while(numero != 0){
                factorial = factorial*numero;
                numero--;
            }
            System.out.println("El factorial del numero es igual a: "+factorial);
            System.out.println();
            System.out.println("Si desea repetir el programa teclee la letra <n> si no es asi, teclee cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}
