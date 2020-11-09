import java.util.*;
public class matriz{
    public void principal () {
        System.out.println("Ingrese los 9 valores de la matriz de A\nY los 9 de la matriz de B");
        int[][] matriz1 = new int[3][3];//Matrices bidimensionales
        int[][] matriz2 = new int[3][3];
        inicializar(matriz1);//A
        inicializar(matriz2);//B
        System.out.println("\nA");
        visualizar(matriz1);//A
        System.out.println("\nB");
        visualizar(matriz2);//B
        int[][] matrizSuma = sumaMatrices(matriz1, matriz2);//Resultado de la suma
            System.out.println("\nS");
            visualizar(matrizSuma);
    }
    static int[][] sumaMatrices(int[][] pMatriz1, int[][] pMatriz2){//clase que sumara las matrices
        int[][] matrizSuma;
        int filas1 =pMatriz1.length;//matriz A bidimensional 
        int columnas1 = pMatriz1[0].length;//matriz A bidimensional
        int filas2 =pMatriz2.length;//matriz B bidimensional
        int columnas2 = pMatriz2[0].length;//matriz B bidimensional
            matrizSuma = new int[filas1][columnas1]; //declaracion nueva de la variable matrizSuma con variables predefinidas en formato bidimensional
            for(int i=0;i<pMatriz1.length;i++){//matriz A columnas con variable int para una vez terminado el 3x3 pase a la matriz B
                for(int j=0;j<pMatriz1[0].length;j++){//matriz A filas con variable int "    "    "   "   "   "
                    matrizSuma[i][j] = pMatriz1[i][j] + pMatriz2[i][j];
                }
            }
            return matrizSuma; //retorno de variable
    }
    static void inicializar(int[][] matriz){//clase que hara el registro de matrices
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println(String.format("coordenada "+i+","+j, matriz[i][j]));//Ubica la cooredenada del numero ingresado
                matriz[i][j] = entrada.nextInt(); //Ingresa datos de la matriz
            }
        }
    }
    static void visualizar(int[][] matriz){//clase que dara formato a las matrices
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");//Visualiza las coordenadas dejando un espacio de tabulador entre c/u
            }
            System.out.println();
        }
    }
}