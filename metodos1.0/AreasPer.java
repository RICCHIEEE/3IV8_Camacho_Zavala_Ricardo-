/*REALIZAR UN PROGRAMA QUE CALCULE EL AREA Y PERIMETRO DE UN CIRCULO, RECTANGULO, CUADRADO Y TRIANGULO, 
EL PROGRAMA DEBERA CONTENER UNA CLASE DONDE SE INDIQUEN LAS VARIABLES DE INSTANCIA, 
DEBERAN EXISTIR LOS METODOS DONDE SE CALCULEN EL AREA Y EL PERIMETRO PARA CADA FIGURA.*/
//Se piden los datos de la figura en un metodo de una clase y en base a eso se resuelven con otros dos metodos a llamar con las operaciones correspondientes para que se resuelva con eso
//CAMACHO ZAVALA RICARDO 

/*Clase que compone a la principal 
*/
//Librerias
import java.util.Scanner;
public class AreasPer{
    Scanner entrada = new Scanner(System.in);
    double a;
    public void Mate(){
        char op;
        double area, perimetro;
        System.out.println("Ingrese la opcion que desee");
        System.out.println("A. Area y perimetro de un circulo");
        System.out.println("B. Area y perimetro de un rectangulo");
        System.out.println("C. Area y perimetro de un cuadrado");
        System.out.println("D. Area y perimetro de un triangulo");
        System.out.println("E. Si desea salir del programa o regresar al menu");
        op = entrada.next().charAt(0);
        switch(op){
            case 'A':
                double radio;
                System.out.println("Ingrese el radio del circulo: ");
                radio = entrada.nextDouble();
                area = circuloa(radio);
                perimetro = circulop(radio);
                System.out.println("El area del circulo es: "+area);
                System.out.println("El perimetro del circulo es: "+perimetro);
                break;
            case 'B':
                double base, altura;
                System.out.println("Ingrese la base del rectangulo: ");
                base = entrada.nextDouble();
                System.out.println("Ingrese la altura del rectangulo: ");
                altura = entrada.nextDouble();
                area = rectanguloa(base, altura);
                perimetro = rectangulop(base, altura);
                System.out.println("El area del rectangulo es: "+area);
                System.out.println("El perimetro del rectangulo es: "+perimetro);
                break;
            case 'C':
                double lado;
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = entrada.nextDouble();
                area = cuadradoa(lado);
                perimetro = cuadradop(lado);
                System.out.println("El area del cuadrado es: "+area);
                System.out.println("El perimetro del cuadrado es: "+perimetro);
                break;
            case 'D':
                System.out.println("Ingrese la base del triangulo: ");
                base = entrada.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                altura = entrada.nextDouble();
                area = trianguloa(base, altura);
                perimetro = triangulop(base);
                System.out.println("El area del triangulo es: "+area);
                System.out.println("El perimetro del triangulo es: "+perimetro);
                break;
            default:
                System.out.println("Use otro de mis programas o salga jiji");

        }
    }
    private double circuloa(double r){
        a = 3.1416*(r*r);
        return a;
    }
    private double circulop(double r){
        a = (2*3.1416)*r;
        return a;
    }
    private double rectanguloa(double ba, double al){
        a = ba*al;
        return a;
    }
    private double rectangulop(double ba, double al){
        a = (ba*2)+(al*2);
        return a;
    }
    private double cuadradoa(double l){
        a = l*l;
        return a;
    }
    private double cuadradop(double l){
        a = l*4;
        return a;
    }
    private double trianguloa(double ba, double al){
        a = (ba*al)/2;
        return a;
    }
    private double triangulop(double ba){
        a = ba*3;
        return a;
    }
}