import java.util.Scanner;
class calif{  
    public static void main(String[] args){
    public void principal(){
        Scanner entrada = new Scanner (System.in);
        calif supe=new calif();
        int[] calif = new int [10];
        System.out.println("Ingrese 10 calificaciones para realizar las operaciones:"); 
        ingreso(calif); impresion(calif); promediar(calif); mayor(calif); menor(calif); superiores(calif); apryrep(calif);
    }
    public static int[] ingreso(int[]calif){
        Scanner entrada=new Scanner (System.in);
        for(int i=0;i<calif.length;i++){
            calif[i]=entrada.nextInt();
        }
        return (calif);
    }
    public static int[] impresion(int[]calif){
        Scanner entrada=new Scanner (System.in);
        int a=0;
        for (int i = 0; i < calif.length; i++){
            a=i+1;
        System.out.print("Calif "+a);
        System.out.println(" : "+calif[i]);
        }
        return (calif);
    }
    public static int[] promediar(int[]calif){
        Scanner entrada=new Scanner (System.in);
        double totalpromedio=0;
        double finnal=0;
        for (int i = 0; i < calif.length; i++){
            totalpromedio+=calif[i];
        }
            finnal=totalpromedio/10;
            System.out.println("El promedio general fue de: "+finnal);
        return (calif);
    }
    public static int[] mayor(int[]calif){
        Scanner entrada=new Scanner (System.in);
            if (calif[0]>calif[1]&&calif[0]>calif[2]&&calif[0]>calif[3]&&calif[0]>calif[4]&&calif[0]>calif[5]&&calif[0]>calif[6]&&calif[0]>calif[7]&&calif[0]>calif[8]&&calif[0]>calif[9]){
                System.out.println("El mas alto fue: "+calif[0]);
            } 
            else if(calif[1]>calif[2]&&calif[1]>calif[3]&&calif[1]>calif[4]&&calif[1]>calif[5]&&calif[1]>calif[6]&&calif[1]>calif[7]&&calif[1]>calif[8]&&calif[1]>calif[9]){
                System.out.println("El mas alto fue: "+calif[1]);
            }
            else if(calif[2]>calif[3]&&calif[2]>calif[4]&&calif[2]>calif[5]&&calif[2]>calif[6]&&calif[2]>calif[7]&&calif[2]>calif[8]&&calif[2]>calif[9]){
                System.out.println("El mas alto fue: "+calif[2]);
            }
            else if(calif[3]>calif[4]&&calif[3]>calif[5]&&calif[3]>calif[6]&&calif[3]>calif[7]&&calif[3]>calif[8]&&calif[3]>calif[9]){
                System.out.println("El mas alto fue: "+calif[3]);
            }
            else if(calif[4]>calif[5]&&calif[4]>calif[6]&&calif[4]>calif[7]&&calif[4]>calif[8]&&calif[4]>calif[9]){
                System.out.println("El mas alto fue: "+calif[4]);
            }
            else if(calif[5]>calif[6]&&calif[5]>calif[7]&&calif[5]>calif[8]&&calif[5]>calif[9]){
                System.out.println("El mas alto fue: "+calif[5]);
            }
            else if(calif[6]>calif[7]&&calif[6]>calif[8]&&calif[6]>calif[9]){
                System.out.println("El mas alto fue: "+calif[6]);
            }
            else if(calif[7]>calif[8]&&calif[7]>calif[9]){
                System.out.println("El mas alto fue: "+calif[7]);
            }
            else if(calif[8]>calif[9]){
                System.out.println("El mas alto fue: "+calif[8]);
            }
            else{
                System.out.println("El mas alto fue: "+calif[9]);
            }
        return (calif);
    }
    public static int[] menor(int[]calif){
        Scanner entrada=new Scanner (System.in);
            if (calif[0]<calif[1]&&calif[0]<calif[2]&&calif[0]<calif[3]&&calif[0]<calif[4]&&calif[0]<calif[5]&&calif[0]<calif[6]&&calif[0]<calif[7]&&calif[0]<calif[8]&&calif[0]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[0]);
            } 
            else if(calif[1]<calif[2]&&calif[1]<calif[3]&&calif[1]<calif[4]&&calif[1]<calif[5]&&calif[1]<calif[6]&&calif[1]<calif[7]&&calif[1]<calif[8]&&calif[1]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[1]);
            }
            else if(calif[2]<calif[3]&&calif[2]<calif[4]&&calif[2]<calif[5]&&calif[2]<calif[6]&&calif[2]<calif[7]&&calif[2]<calif[8]&&calif[2]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[2]);
            }
            else if(calif[3]<calif[4]&&calif[3]<calif[5]&&calif[3]<calif[6]&&calif[3]<calif[7]&&calif[3]<calif[8]&&calif[3]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[3]);
            }
            else if(calif[4]<calif[5]&&calif[4]<calif[6]&&calif[4]<calif[7]&&calif[4]<calif[8]&&calif[4]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[4]);
            }
            else if(calif[5]<calif[6]&&calif[5]<calif[7]&&calif[5]<calif[8]&&calif[5]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[5]);
            }
            else if(calif[6]<calif[7]&&calif[6]<calif[8]&&calif[6]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[6]);
            }
            else if(calif[7]<calif[8]&&calif[7]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[7]);
            }
            else if(calif[8]<calif[9]){
                System.out.println("El mas bajo fue: "+calif[8]);
            }
            else{
                System.out.println("El mas bajo fue: "+calif[9]);
            }
        return (calif);
    }
    public static int[] superiores(int[]calif){
        Scanner entrada=new Scanner (System.in);
        double totalpromedio=0;
        double finnal=0;
        int x=0;
        for (int i = 0; i < calif.length; i++){
            totalpromedio+=calif[i];
        }
            finnal=totalpromedio/10;
        for (int i = 0; i < calif.length; i++){
        if (calif[i]>finnal){
                x+=1;
        }
        else if(calif[i]<finnal){
        }
        else{
            System.out.println("No hay quien supere el promedio");
        }
    }
        System.out.println("Hay "+x+" que superan al promedio");
        return (calif);
    }   
    public static int[] apryrep(int[]calif) {
        Scanner entrada=new Scanner (System.in);
        int posit=0;
        int negat=0;
        for (int i=0; i<calif.length; i++){
        if(calif[i]>=6){
            posit+=1;
        }
        else if (calif[i]<6){
            negat+=1;
        }
        }
        System.out.println("Hay "+posit+" aprobados y "+negat+" reprobados");
        return(calif);
    }
}