/*REALIZAR UN PROGRAMA QUE CALCULE EL COSTO DE LLAMADAS TELEFONICAS CELULARES, 
DEBERA CONTENER LAS SIGUIENTES VARIABLES: 
NUMERO DE CELULAR (INT)
CREDITO(INT) 
Y MEDIANTE UN METODO SE PODRA CALCULAR EL COSTO TOTAL DE LLAMADAS: 
LOCALES NACIONALES($0.5)
LOCALESINTERNACIONALES($0.6)
Y CELULARES ($0.2) 
Y SE DEBERA IR DESCONTANDO DEL CREDITO LAS LLAMADAS REALIZADAS
TAMBIEN EXISTIRA UNA OPCION Y METODO PARA PODER INGRESAR Y CONSULTAR EL CREDITO.*/
//En las instrucciones esta mas que claro

//Camacho Zavala Ricardo 

//Librerias
import java.util.Scanner;
public class Telefono{
    Scanner entrada = new Scanner(System.in);
    double num, a;
    int credito = 200;
    double ln = 0.5;
    double li = 0.6;
    double c = 0.2;
    public void Costo(){
        char op;
        double total, credif;
        System.out.println("Bienvenido al soporte de telefonia, seleccione la opcion que desee, sugerimos que si hara una llamada celular, revise su credito primero");
        System.out.println("A. Si desea consultar su credito");
        System.out.println("B. Si desea obtener el costo de su llamada celular");
        System.out.println("C. Si desea obtener el costo de su llamada local nacional");
        System.out.println("D. Si desea obtener el costo de su llamada local internacional");
        System.out.println("E. Si desea salir del programa");
        op = entrada.next().charAt(0);
        switch(op){
            case 'A':
                saldo();
                break;
            case 'B':
                double minutos;
                System.out.println("Ingrese los minutos que duro su llamada celular: ");
                minutos = entrada.nextDouble();
                total = cel(minutos);
                credif = celfin(minutos);
                System.out.println("Su llamada tuvo un costo de: "+total+" pesos");
                System.out.println("Quedo con un credito de: "+credif+" pesos");
                break;
            case 'C':
                System.out.println("Ingrese los minutos que duro su llamada local nacional: ");
                minutos = entrada.nextDouble();
                total = lona(minutos);
                System.out.println("Su llamada tuvo un costo de: "+total+" pesos");
                break;
            case 'D':
                System.out.println("Ingrese los minutos que duro su llamada local internacional: ");
                minutos = entrada.nextDouble();
                total = loin(minutos);
                System.out.println("Su llamada tuvo un costo de: "+total+" pesos");
                break;
            default:
                System.out.println("Gracias por usar este programa");

        }
    }
    private void saldo(){
        System.out.println("Ingrese su numero de celular: ");
        num = entrada.nextDouble();
        System.out.println("Cuenta con "+credito+" pesos de saldo");
    }
    private double cel(double min){
        a = min*c;
        return a;
    }
    private double celfin(double min){
        a = credito - (min*c);
        return a;
    }
    private double lona(double min){
        a = min*ln;
        return a;
    }
    private double loin(double min){
        a = min*li;
        return a;
    }
}


