import java.util.Scanner;
class pokedex{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
    double defensa1, defensa2, fuerza1, fuerza2, vida, impacto1, impacto2;
    int opcion;
    String id1;
    String id2;
       
    do{ /*menu de la app*/
        sistem.out.printin(" 3IV8 Camacho Zavala Ricardo");
        sistem.out.printin("Bienvenido a Pokedex Mr.");
        sistem.out.printin("¿que desea hacer Mr.?");
        sistem.out.printin("1. ver a charmander ");
        sistem.out.printin("2. ver a bulbasur ");
        sistem.out.printin("3. ver a squartle ");
        sistem.out.printin("4. ver batalla ");
        sistem.out.printin("5. regresar");
        opcion = entrada.nextInt();
        switch(opcion){
                
            case 1:/*charmander*/
                sistem.out.printin("su Id es 34532");
                sistem.out.printin("nombre charmander");
                sistem.out.printin("fuerza 7");
                sistem.out.printin("defensa 8");
                sistem.out.printin("vida 9");
                sistem.out.printin("ataque 1 patadita");
                sistem.out.printin("ataque 2 puño");

            case 2:/*bulbasor*/
                sistem.out.printin("su Id es 142032");
                sistem.out.printin("nombre bulbasor");
                sistem.out.printin("fuerza 8");
                sistem.out.printin("defensa 9");
                sistem.out.printin("vida 8");
                sistem.out.printin("ataque 1 patadita");
                 sistem.out.printin("ataque 2 puño");

            case 3:/*squartle*/
                sistem.out.printin("su Id es 346980");
                sistem.out.printin("nombre squartle");
                sistem.out.printin("fuerza 9");
                sistem.out.printin("defensa 6");
                sistem.out.printin("vida 8");
                sistem.out.printin("ataque 1 patadita");
                sistem.out.printin("ataque 2 puño");
            
            case 4:/*batalla*/
                System.out.println("Bienvenido al campo de batalla");
                System.out.println("1. Si quiere ver la batalla entre Charmander y Bulbasor: ");
                System.out.println("2. Si quiere ver la batalla entre Charmander y Squartle: ");
                System.out.println("3. Si quiere ver la batalla entre Bulbasor y Squartle");
                System.out.println("4. Si desea salir del campo de batalla: ");
                opcion = entrada.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("Charmander tiene una fuerza de 20 y una defensa de 20");
                            System.out.println("Bulbasor tiene una fuerza de 10 y una defensa de 10");
                            do{
                                fuerza1 = 20;
                                fuerza2 = 10;




                    
             }
        }while(letra == 's');
    }
}



