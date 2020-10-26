/* EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, 
AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. SI LA EDAD ES MENOR QUE 21, 
SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, 
SE LES APLICA UN DESCUENTO DEL 45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. */
import java.util.Scanner;
class descuento{

    public static void main(String[] args){;
        Scanner entrada = new Scanner(System.in);
       /*variables*/
        int edad, abono, opcion;
        double descuento, total;
        char letra;
        do{
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();   
                if(edad >= 65){
                    System.out.println("Ingrese el total del abono: ");
                    abono = entrada.nextInt();
                    descuento = abono*.40;
                    total = abono-descuento;
                    System.out.println("Se le ha hecho un descuento y usted tiene que pagar: "+total);
                }
                else{
                    if(edad < 21){
                        System.out.println("Si sus padres son socios presione el numero 1: ");
                        System.out.println("Si sus padres no son socios presione el numero 2: ");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingrese el total del abono: ");
                                abono = entrada.nextInt();
                                descuento = abono*.45;
                                total = abono - descuento;
                                System.out.println("Se le ha hecho un descuento y usted tiene que pagar: "+total);
                                break;
                            case 2:
                                System.out.println("Ingrese el total del abono: ");
                                abono = entrada.nextInt();
                                descuento = abono*.25;
                                total = abono - descuento;
                                System.out.println("Se le ha hecho un descuento y usted tiene que pagar: "+total);
                                break;
                            default:
                                System.out.println("Gracias por su abono");
                        }  
                    }
                    else{
                        System.out.println("Ingrese el total de su abono: ");
                        abono = entrada.nextInt();
                        System.out.println("No se le ha hecho ningun descuento, pague: "+abono);
                    }
                }
                System.out.print("Si quiere repetir el programa teclee <n> si no es asi, teclee cualquier otra letra: ");
                letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}