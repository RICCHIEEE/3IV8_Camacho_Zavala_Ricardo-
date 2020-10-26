/*ELABORA UN PROGRAMA DONDE SE INTRODUCE UNA SERIE DE NÚMEROS 
DEBERA CONTAR CUANTOS SON POSITIVOS  Y CUANTOS NEGATIVOS. */
import java.util.Scanner;
class serienum{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //programa para contar los numeros + y - de una serie de 10 con un arreglo de la infor. de la sesion 5
        int n1, n2, n3, n4, nm4, n5, n6, n7, n8, n9, n10;
        char letra;
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
            System.out.println("Si desea repetir el programa escriba la letra <n> si no es asi, escriba cualquier otra letra: ");
            letra = entrada.next().charAt(0);
        }while(letra == 'n');
    }
}
