/*ELABORA UN PROGRAMA QUE REALICE A. EL AREA  Y PERIMETRO DE UN RECTANGULO, B.
 EL PERIMETRO Y AREA DE UN TRIANGULO, C. EL VOLUMEN DE UNA ESFERA Y VOLUMEN DE UN CILINDRO. */
import java.util.Scanner;
class area{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion, altura, base, radio;
        double area, perimetro, volumen;
        char letra;
        do{
            System.out.println("1.  calcular el area y perimetro de un rectangulo: ");
            System.out.println("2.  calcular el area y perimetro de un triangulo equilatero: ");
            System.out.println("3.  calcular el volumen de una esfera: ");
            System.out.println("4.  calcular el volumen de un cilindro: ");
            System.out.println("5.  salir del programa: ");
            opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el valor de la base del rectangulo: ");
                        base = entrada.nextInt();
                        System.out.println("Ingrese el valor de la altura del rectangulo: ");
                        altura = entrada.nextInt();
                        area = base*altura;
                        perimetro = (2*base) + (2*altura);
                        System.out.println("El area del rectangulo es de: "+area);
                        System.out.println("El perimetro del rectangulo es de: "+perimetro);
                        break;
                    case 2:
                        System.out.println("Ingrese el valor de un lado del triangulo equilatero: ");
                        base = entrada. nextInt();
                        System.out.println("Ingrese el valor de la altura del triangulo rectangulo: ");
                        altura = entrada.nextInt();
                        area = (base*altura)/2;
                        perimetro = base*3;
                        System.out.println("El area del triangulo equilatero es: "+area);
                        System.out.println("El perimetro del triangulo equilatero es de : "+perimetro);
                        break;
                    case 3:
                        System.out.println("Ingrese el valor del radio de la esfera: ");
                        radio = entrada.nextInt();
                        volumen = (4/3)*(3.1416)*(radio*radio*radio);
                        System.out.println("El volumen de la esfera es de: "+volumen);
                        break;
                    case 4: 
                        System.out.println("Ingrese el valor del radio del cilindro: ");
                        radio = entrada.nextInt();
                        System.out.println("Ingrese el valor de la altura del cilindro: ");
                        altura = entrada.nextInt();
                        volumen = (3.1416)*(radio*radio)*(altura);
                        System.out.println("El volumen del cilindro es de: "+volumen);
                        break;
                    default:
                        System.out.println("Gracias por usar mi programa, tqm");
                }
                System.out.println("Si quiere repetir el programa inserte <n> si no es asi, presione cualquier otra: ");
                letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}
