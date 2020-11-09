import java.util.Scanner;

class pares{  
    public void cacahuate(){
        Scanner entrada = new Scanner (System.in);
        int[] par = new int [10];
        System.out.println("Ingrese los valores a promediar: ");
        lecturas(par); //lectura de los valores
        tota(par); 
    }
    public static int[] lecturas(int[]par){
        Scanner entrada=new Scanner(System.in);
        for(int i=0;i<par.length;i++){
            par[i]=entrada.nextInt();
        }
        return (par);
    }
    public static int[] tota(int[]par){
        double tot=0;
        double suma=0;
        double pp=0;
        for(int i=0;i<par.length;i++){
            if (i%2==0){
                tot+=par[i];
            }
            else{
            }
        }
        pp=tot/5;
        System.out.println("El promedio de las posiciones par es: "+pp);
        return(par);
    }
}