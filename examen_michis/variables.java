//erencia_padre
import java.util.*;
public class variables{
    protected int num;
    protected String[][] y = new String[3][3];
    //constructor parametros
    public variables(int num, String[][] y){
        this.num=num;
        this.y=y;
    }
    //constructor vacio
    public variables(){

    }
    //getters y seters
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
    public String[][] getY(){
        return y;
    }
    public void setY(String[][] y){
        this.y=y;
    }
} 