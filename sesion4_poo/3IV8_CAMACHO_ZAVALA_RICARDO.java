/*ESTE ES EL MENU PRINCIPAL CON TODOS LOS PROGRAMAS ADJUNTADOS Y ACOMODADOS*/
import java.util.Scanner;
class menu{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //variablesescuentoAbono
        int edad;
        double abono, descuento, total;
        //variables Binario
        int numero;
        String binario = "";
        //variables Temperaturas
        double cel, far, kel, ran;
        //variables Positivos, Negativos, Ceros
        int n1, n2, n3, nm4, n5, n6, n7, n8, n9, n10;
        //variables Tiendita
        int productos;
        double p1, p2, p3, p4;
        //variables AreaPerimetroVolumen
        int altura, base, radio;
        double area, perimetro, volumen;
        //variables Factorial
        int factorial = 1;
        //variables calculadora
        double num1, num2, resultado;
        //variables generales
        int opcion;
        char letra;
        do{
            System.out.println("A que programa desea ingresas: ");
            System.out.println("1. Descuento de Abonos: ");
            System.out.println("2. Convertir Decimal a Binario: ");
            System.out.println("3. Conersion de Temperaturas: ");
            System.out.println("4. Positivos, Negativos y Ceros: ");
            System.out.println("5. Super Virtual: ");
            System.out.println("6. Area y Perimetro: ");
            System.out.println("7. Tabla de Valores: ");
            System.out.println("8. Factorial de un Numero: ");
            System.out.println("9. Calculadora: ");
            System.out.println("0. Si desea salir: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: 
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
                            System.out.println("Si desea repetir el programa teclee <s> si se quiere ir o volver al menu, teclee cualquier otra: ");
                            letra = entrada.next().charAt(0);
                    }while (letra == 's');
                    break;
                case 2: 
                    do{
                        do{
                            System.out.println("Ingrese un numero igual o mayor a 0 que quiera convertir a binario: ");
                            numero = entrada.nextInt();
                        }while(numero < 0);
                        if(numero > 0){
                             while(numero > 0){
                                if(numero % 2 == 0){
                                    binario = "0" + binario;
                                }else{
                                    binario = "1" + binario;
                                }
                                numero = (int) numero/2;
                            }
                            System.out.println("La conversion del numero que introdujo a sistema binario es: "+binario + ".");
                            System.out.println("");
                        }else{
                            System.out.println("El numero binario de cero es: 0");
                        }
                        System.out.println("Si desea repetir el programa teclee la letra <s> si se quiere ir o volver al menu, teclee cualquier otra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 3:
                    do{
                        System.out.println("Este es un convertidor de temperaturas, por favor elija la opcion que desee: ");
                        System.out.println("1.  convertir de Celcius a Fahrenheit, Kelvin y Rankine: ");
                        System.out.println("2.  convertir de Fahrenheit a Celsius, Kelvin y Rankine: ");
                        System.out.println("3.  convertir de Kelvin a Celsius, Fahrenheit y Rankine: ");
                        System.out.println("4.  convertir de Rankine a Celsius, Fahrenheit, y Kelvin: ");
                        System.out.println("5.  salir del programa: ");
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
                            System.out.println("Si desea repetir el programa teclee <s> si desea salir o volver al menu teclee cualquier otra: ");
                            letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 4:
                    do{
                        System.out.println("Ingrese el primer numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        n2 = entrada.nextInt();
                        System.out.println("Ingrese el tercer numero: ");
                        n3 = entrada.nextInt();
                        System.out.println("Ingrese el cuarto numero: ");
                        nm4 = entrada.nextInt();
                        System.out.println("Ingrese el quinto numero: ");
                        n5 = entrada.nextInt();
                        System.out.println("Ingrese el sexto numero: ");
                        n6 = entrada.nextInt();
                        System.out.println("Ingrese el septimo numero: ");
                        n7 = entrada.nextInt();
                        System.out.println("Ingrese el octavo numero: ");
                        n8 = entrada.nextInt();
                        System.out.println("Ingrese el noveno numero: ");
                        n9 = entrada.nextInt();
                        System.out.println("Ingrese el decimo numero: ");
                        n10 = entrada.nextInt();
                        int[] serie = new int[10];
                        serie[0] = n1;
                        serie[1] = n2;
                        serie[2] = n3;
                        serie[3] = nm4;
                        serie[4] = n5;
                        serie[5] = n6;
                        serie[6] = n7;
                        serie[7] = n8;
                        serie[8] = n9;
                        serie[9] = n10;
                        int positivos = 0;
                        int negativos = 0;
                        int ceros = 0;
                        for (int i=0;i < serie.length; i++){
                            if(serie[i] > 0){
                                positivos++;
                            }
                            if(serie[i] < 0){
                                negativos++;
                            }
                            if(serie[i] == 0){
                                ceros++;
                            }
                        }
                        System.out.println("La cantidad de numeros positivos es de: "+positivos);
                        System.out.println("La cantidad de numeros negativos es de: "+negativos);
                        System.out.println("La cantidad de ceros es de: "+ceros);
                        System.out.println("Si desea repetir el programa teclee <s> si quiere salir o volver al menu teclee cualquier otra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 5:
                    do{
                        System.out.println("¿cuantos productos desea comprar Mr.?: ");
                        productos = entrada.nextInt();
                        if(productos > 0){
                            System.out.println("Elija el producto que desee esas veces (un solo numero): ");
                            System.out.println("1. four loko 15 varos: ");
                            System.out.println("2. sky 5 varos: ");
                            System.out.println("3. caribe 23 varos: ");
                            System.out.println("4. kosako uva 10 varos: ");
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
                            System.out.println("Ah sos re troll, regresa despues o compra algo jiji");
                        }
                        System.out.println("Si desea repetir el programa teclee <s> si quiere salir o volver al menu teclee cualquier otra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 6:
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
                                    System.out.println("Gracias");
                            }
                            System.out.println("Si desea repetir el programa teclee <s> si quiere salir o volver al menu teclee cualquier otra: ");
                            letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 7:
                    do{
                        System.out.printf("N \t 10 \t 100 \t 1000\n");
                        System.out.printf("1 \t 10 \t 100 \t 1000\n");
                        System.out.printf("2 \t 20 \t 200 \t 2000\n");
                        System.out.printf("3 \t 30 \t 300 \t 3000\n");
                        System.out.printf("4 \t 40 \t 400 \t 4000\n");
                        System.out.printf("5 \t 50 \t 500 \t 5000\n");
                        System.out.printf("6 \t 60 \t 600 \t 6000\n");
                        System.out.printf("7 \t 70 \t 700 \t 7000\n");
                        System.out.printf("8 \t 80 \t 800 \t 8000\n");
                        System.out.printf("9 \t 90 \t 900 \t 9000\n");
                        System.out.printf("10 \t 100 \t 1000 \t 10000\n");
                        System.out.println();
                        System.out.println("Si desea repetir el programa teclee <s> si quiere salir o volver al menu teclee cualquier otra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 8:
                    do{
                            System.out.println("Ingrese el numero entero positivo del cual quiere obtener su factorial: ");
                            numero = entrada.nextInt();
                        while(numero != 0){
                            factorial = factorial*numero;
                            numero--;
                        }
                        System.out.println("El factorial del numero es igual a: "+factorial);
                        System.out.println();
                        System.out.println("Si desea repetir el programa teclee <s> si quiere salir o volver al menu teclee cualquier otra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                case 9: 
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
                                System.out.println("Gracias");
                        }
                        System.out.println("Si desea repetir el programa teclee <s> si quiere salir o volver al menu tecee cualquier otra: ");
                        letra = entrada.next().charAt(0);
                    }while(letra == 's');
                    break;
                default:
                    System.out.println("Gracias");
            }
            System.out.println("Si desea volver al menu teclee <n> si no es asi teclee cualquier otra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}