/*DESARROLLE UN ALGORITMO QUE PERMITA EL DESARROLLO DE UNA CALCULADORA
 CONVENCIONAL CON SUMA RESTA MULTIPLICACION Y DIVISION, DEBERA UN INCLUIR UN
  MENU DE ENTRADA A LAS OPERACIONES Y QUE PERMITA ELEGIR ENTRE OTRA OPERACIÓN 
  O SALIR DEL PROGRAMA.(PUEDE UTILIZAR LIBRERIA SWING CON OPCION JOPTIONPANE INVESTIGACION)  */
  import java.util.Scanner;
class calculadora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        char letra;
        do{
            System.out.println("1.  realizar una suma: ");
            System.out.println("2.  realizar una resta: ");
            System.out.println("3.  realizar una multiplicacion: ");
            System.out.println("4.  realizar una divison: ");
            System.out.println("5.  salir del programa: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: "+resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es de: "+resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1*num2;
                    System.out.println("El resultado de la multiplicacion es de: "+resultado);
                    break;
                case 4: 
                    System.out.println("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();
                    resultado = num1/num2;
                    System.out.println("El resultado de la division es de: "+resultado);
                    break;
                default:
                    System.out.println("Gracias por usar mi calculadora mi pana");
            }
            System.out.println("Si desea repetir el programa teclee la letra <n> si no es asi, teclee cualquier otra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}