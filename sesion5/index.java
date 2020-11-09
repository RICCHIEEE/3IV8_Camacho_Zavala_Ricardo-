import java.util.*;

class index{
public static void main(String[] args){
    promedio prom=new promedio();
    pares pez=new pares();
    calif total=new calif();
    matriz mat=new matriz();
    Scanner entrada = new Scanner (System.in);
    int index;
    char limf;
    do{
        System.out.println("Escoja cual programa quiere ejecutar:");
        System.out.println("1.- Promedios");
        System.out.println("2.- Pares array promedio");
        System.out.println("3.- Calificaciones");
        System.out.println("4.- Matrices 3x3");
        System.out.println("0.- Salir");
        index=entrada.nextInt();
        switch (index) {
            case 1:
            prom.principal();
                break;
            case 2:
            pez.cacahuate();
                break;
            case 3:
            total.principal();
                break;
            case 4:
            mat.principal();
                break;
            default:
            System.out.println("gracias:)");
                break;
        }
        System.out.println("ingrese s si quiere reiniciar");
        limf = entrada.next().charAt(0);
    }while (limf=='s');
System.out.println("hasta laproxima:)");
}
}
