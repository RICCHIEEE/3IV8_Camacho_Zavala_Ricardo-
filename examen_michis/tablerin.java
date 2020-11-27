public class tablerin extends variables{

    public tablerin(){}
    
    public tablerin(String[][]y,int num){
        super(num, y);
        
    }
    public void mostrartablerin(){
        inicializar(y);
        visualizar(y);
    }

    public void inicializar(String[][] y){
        for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
            
                y[0][0] = "1"; //Ingresa datos de la matriz
                y[0][1] = "2";
                y[0][2] = "3";
                y[1][0] = "4";
                y[1][1] = "5";
                y[1][2] = "6";
                y[2][0] = "7";
                y[2][1] = "8";
                y[2][2] = "9";
            }
        }
    }
    public void visualizar(String[][] y){
        for (int i=0; i < y.length; i++){
            for (int j=0; j < y[i].length; j++)
                  System.out.print(" [ " + y[i][j]+ " ] ");   
            System.out.println("\n---------------------------");
        }
    }
} 