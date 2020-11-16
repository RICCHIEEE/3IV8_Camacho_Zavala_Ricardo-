/*
*Camacho Zavala Ricardo 
*Clase que compone a la principal
*/

//Librerias
import java.util.Scanner;
public class Edad{
    Scanner entrada = new Scanner(System.in);
    public void Datos(){
        DatosP();
        Edad();
        System.out.println("Gracias por usar este programa");
    }
    private void DatosP(){
        String nombre, apellidop, apellidom;
        double altura, peso;
        System.out.println("Ingrese su nombre sin apellidos: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido paterno: ");
        apellidop = entrada.nextLine();
        System.out.println("Ingrese su apellido materno: ");
        apellidom = entrada.nextLine();
        System.out.println("Ingrese su altura: ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese su peso: ");
        peso = entrada.nextDouble();
        System.out.println("Su nombre completo es: "+nombre+" "+apellidop+" "+apellidom);
        System.out.println("Usted mide: "+altura);
        System.out.println("Usted pesa: "+peso);
    }
    private void Edad(){
        int ano, edad;
        System.out.println("Ingrese el ano en el que nacio: ");
        ano = entrada.nextInt();
        edad = 2020 - ano;
        System.out.println("Usted tiene "+edad+" anos de edad");
    }
}