//librerias
import java.util.Scanner;
public class Menu{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char letra;
        int opcion;
        do{
            System.out.println("Bienvenido a mi programa, seleccione la opcion que desea usar");
            System.out.println("1. Datos de una persona");
            System.out.println("2. Area y perimetro de figuras");
            System.out.println("3. Costo de llamadas telefonicas");
            System.out.println("4. Si desea salir del programa");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    do{
                        	Edad datos = new Edad();
                        datos.Datos();
                        System.out.println("Si desea repetir el programa teclee <v> si desea salir o volver al menu, teclee cualquier otra letra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'v');
                    break;
                case 2:
                    do{
                        AreasPer mate = new AreasPer();
                        mate.Mate();
                        System.out.println("Si desea repetir el programa teclee <v> si desea salir o volver al menu, teclee cualquier otra letra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'v');
                    break;
                case 3:
                    do{
                        Telefono costo = new Telefono();
                        costo.Costo();
                        System.out.println("Si desea repetir el programa teclee <v> si desea salir o volver al menu, teclee cualquier otra letra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'v');
                    break;
                default:
                    System.out.println("Gracias por usar mi programa jeje");
            }
            System.out.println("Si desea volver al menu teclee <s>, si no teclee cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
    }
}
