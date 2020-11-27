//este fue el de prueba, salio bien pero es infinito jajaja y mejor hize otro con menos variables 
//el chido es el otro, el tablerin 
import java.util.Scanner;


public class lugardejuego {

        Scanner entrada = new Scanner(System.in);
        
        char play1 = 'x';
        char play2 = 'o';
        
        int coordenada1;
        int coordenada2;
        int turno=0;
        
        char [][] tablero = new char[3][3];
        
        boolean aux = true;
                                           
        while(turno < 10){

  System.out.print("\n\nIngrese fila: ");
  coordenada1 = entrada.nextInt();
  System.out.print("Ingrese columna: ");
  coordenada2 = entrada.nextInt();
  
  
  if(tablero[(coordenada1-1)][(coordenada2-1)] == 'x' || tablero[(coordenada1-1)][(coordenada2-1)] == 'o')  {                       
      System.out.println("ERROR, eliga otra posicion. Intente de nuevo");
  }else{
       if (turno%2 == 0) {
         tablero[(coordenada1-1)][(coordenada2-1)] = play1;
         turno ++;     
      }else{
         tablero[(coordenada1-1)][(coordenada2-1)] = play2;  
         turno ++;     
      }
   }        
  
  
  System.out.println("\n");
     
  System.out.println(" "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+" ");
  System.out.println("-----------------------------------------------------------");
  System.out.println(" "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+" ");
  System.out.println("-----------------------------------------------------------");
  System.out.println(" "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+" ");
      System.out.println(turno);
        }                         
    }    
}