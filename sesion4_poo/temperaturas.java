/*ELABORA UN PROGRAMA QUE CONVIERTA TEMPERATURA EN GRADOS FAHRENHEIT, 
EN GRADOS CELSIUS, KELVIN Y RANKINE. (SE PODRA ELEGIR QUE CONVERSION DESEA REALIZAR) */
import java.util.Scanner;
class temperaturas{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       /*variables*/
        double cel, far, kel, ran;
        int opcion;
        char letra;
        do{
            System.out.println("Elija la opcion que desee convertir segun la temperatura: ");
            System.out.println("1. Si quiere convertir de Celcius a Fahrenheit, Kelvin y Rankine: ");
            System.out.println("2. Si quiere convertir de Fahrenheit a Celsius, Kelvin y Rankine: ");
            System.out.println("3. Si quiere convertir de Kelvin a Celsius, Fahrenheit y Rankine: ");
            System.out.println("4. Si quiere convertir de Rankine a Celsius, Fahrenheit, y Kelvin: ");
            System.out.println("5. Si quiere salir del programa: ");
            opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese los grados Celsius que quiere convertir: ");
                        cel = entrada.nextDouble();
                        far = ((9*cel)/5) + 32;
                        kel = cel +273.15;
                        ran = ((9*cel)/5) + 491.67;
                        System.out.println("Los grados Celsius convertidos a Fahrenheit son: "+far);
                        System.out.println("Los grados Celsisus convertidos a Kelvin son: "+kel);
                        System.out.println("Los grados Celsisus convertidos a Rankine son: "+ran);
                        break;
                    case 2:
                        System.out.println("Ingrese los grados Fahrenheit que quiere convertir: ");
                        far = entrada.nextDouble();
                        cel = (5*(far - 32))/9;
                        kel = ((5*(far - 32))/9) + 273.15;
                        ran = far + 459.67;
                        System.out.println("Los grados Fahrenheit convertidos a Celsius son: "+cel);
                        System.out.println("Los grados Fahrenheit convertidos a Kelvin son: "+kel);
                        System.out.println("Los grados Fahrenheit convertidos a Rankine son: "+ran);
                        break;
                    case 3:
                    System.out.println("Ingrese los grados Kelvin que quiere convertir: ");
                    kel = entrada.nextDouble();
                    cel = kel - 273.15;
                    far = ((9*(kel - 273.15))/5) + 32;
                    ran = ((9*(kel - 273.15))/5) + 491.67;
                    System.out.println("Los grados Kelvin convertidos a Celsius son: "+cel);
                    System.out.println("Los grados Kelvin convertidos a Fahrenheit son: "+far);
                    System.out.println("Los grados Kelvin convertidos a Rankine son: "+ran);
                    break;
                    case 4:
                    System.out.println("Ingrese los grados Rankine que quiere convertir: ");
                    ran = entrada.nextDouble();
                    cel = (5*(ran - 491.67))/9;
                    far = ran - 459.7;
                    kel = ((5*(ran - 491.67))/9) + 273.15;
                    System.out.println("Los grados Rankine convertidos a Celsius son: "+cel);
                    System.out.println("Los grados Rankine convertidos a Fahrenheit son: "+far);
                    System.out.println("Los grados Rankine convertidos a Kelvin son: "+kel);
                    break;
                    default:
                        System.out.println("See you next time baby .-.");
                }
            System.out.println("Si desea repetir el programa escriba <n> si no es asi, escriba cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}