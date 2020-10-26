/*ELABORA UN PROGRAMA QUE LEA CANTIDADES (PERMITIR AL USUARIO PREGUNTAR 
CUANTAS CANTIDADES DESEA INGRESAR) , LOS PRECIOS Y LOS PRODUCTOS YA ESTAN 
DEFINIDOS Y AL FINAL QUE MUESTRE EL TOTAL DE LOS PRODUCTOS COMPRADOS Y SU FACTURA TOTAL. */
import java.util.Scanner;
class productos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int productos, opcion;
        double p1, p2, p3, p4, total;
        char letra; 
        do{
            System.out.println("¿cuantos productos desea comprar Mr.?: ");
            productos = entrada.nextInt();
            if(productos > 0){
                System.out.println("Elija el producto que desea en esa cantidad, uno solo: ");
                System.out.println("1. four loko 15 varos: ");
                System.out.println("2. sky 5 varos: ");
                System.out.println("3. caribe 23 varos: ");
                System.out.println("4. kosako 10 varos: ");
                opcion = entrada.nextInt();
                p1 = 15;
                p2 = 5;
                p3 = 23;
                p4 = 10;
                total = 0;
                do{
                    if(opcion == 1){
                        total = p1 + total;
                    }else if(opcion == 2){
                        total = p2 + total;
                    }else if(opcion == 3){
                        total = p3 + total;
                    }else if(opcion == 4){
                        total = p4 + total;
                    }
                    productos = productos - 1;
                }while(productos > 0);
                System.out.println("La factura total es de: "+total);
                System.out.println("Vuelva pronto, gracias");     
            }else{
                System.out.println("regresa despues o compra algo ");
            }
            System.out.println("Si desea repetir el programa teclee <n> si no es asi, teclee cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');     
    }
}