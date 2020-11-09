import java.util.Scanner;

class promedio{  
    public void principal(){
        Scanner entrada = new Scanner (System.in);
        int[] pr = new int [10];
        System.out.println("Ingrese los valores a promediar: ");
        lectura(pr); //lectura de los valores pr
        tot(pr);       

    }
    public static int[] lectura(int[]pr){
        Scanner entrada=new Scanner(System.in);
        for(int i=0;i<pr.length;i++){
            pr[i]=entrada.nextInt();
        }
        return (pr);
    }
    public static int[] tot(int[]pr){
        double ppos=0; //suma positivos
        double pneg=0; //suma negativos
        double pos=0; //valores positivos
        double neg=0; //valores negativos
        double totp=0;
        double totn=0;
        for(int i=0;i<pr.length;i++){
            if (pr[i]>=0){
                ppos+= pr[i];
                pos++;
            }
            else if(pr[i]<0){
                pneg+=pr[i];
                neg++;
            }
        }
            totp=ppos/10;
            totn=pneg/10;
                System.out.println("El promedio de los positivos es: "+totp);
                System.out.println("El promedio de los negativos es: "+totn);
            return (pr);
        }
    }