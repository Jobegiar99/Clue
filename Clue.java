import java.util.Scanner;

public class Clue
{

    /**
     * This method controls how the game story evolves.
     * @param marketClue lets the program know if market clue has been given.
     * @param conventClue lets the program know if convent clue has been given.
     * @param forestClue lets the program know if forest clue has been given.
     * @param fromDeerToWait lets the program know if the player is moving from the forest to the market.
     * @param fromMarketExploretoForest lets the program know if the player is moving from the market to the forest.
     * @param fromConventToLake lets the program know if the player is moving from the convent to the forest.
     */
    public static void mainGame(boolean marketClue, boolean conventClue, boolean forestClue, boolean fromDeerToWait, boolean fromMarketExploretoForest, boolean 
                                fromConventToLake,boolean marketAssassinClue){                     
        Scanner input=new Scanner(System.in);
        Assassin gameAssassin=new Assassin();
        boolean isValidInput=false,firstTime=true;
        byte decision;
        String[] respuestaJugador=new String[3];
            System.out.println("Te encontras en la entrada de Orilon, la aldea en la que tu hermana fue asesinada." +
                               "\nLo ultimo que vos supiste de ella, es que recibio una carta de una persona desconocida, la cual la invitaba a un retiro espiritual." +
                               "\nDespues de una semana de haber asistido a tal evento, los policias te informaron que su cuerpo habia sido\n"+
                               "encontrado sin vida en la entrada de la aldea.\n"+
                               "Es por ello que decidiste tratar de averiguar quien es el culpable de tal asesinato, a media noche, "+
                               "cuando no hay nadie viendo o escuchando y probablemente el asesino ande suelto buscando a una nueva victima." +
                               "Te adentras en la aldea y lo primero que ves es la plaza central. Desde ese lugar te podes dirigir al"+
                               " mercado, el bosque y el monasterio. \nAntes de moverte escuchas pasos a la lejania. Sera el asesino?\n" +
                               "A donde queres ir?\nMercado (1)\nBosque (2)\nMonasterio (3)\nDecir quien es el culpable (4)");
            do{
                
                if (firstTime==false){
                    System.out.println("Volves a la plaza. A donde queres ir?\nMercado (1)\nBosque (2)\nMonasterio (3)\nDecir quien es el culpable (4)");
                }
                isValidInput=input.hasNextByte();
                if (isValidInput){
                    decision=input.nextByte();
                    firstTime=false;
                    switch (decision){
                        case 1: //Takes player to market
                                if (marketAssassinClue){

                                }else if (marketClue){
                                        marketAssassinClue=playMarket(marketClue, forestClue, isValidInput, decision, gameAssassin,marketAssassinClue);
                                        if (marketAssassinClue==false){
                    
                                        } else if (marketAssassinClue){
                                            System.out.println("Game over");
                                        }
                                }else {
                                        isValidInput=false;
                                        decision=0;
                                        marketClue=playMarket(marketClue, forestClue, isValidInput, decision, gameAssassin,marketAssassinClue);
                                        System.out.println("A donde te gustaria ir ahora? " +
                                                           "Mercado (1)\nBosque (2\nMonasterio (3)");
                                }
                        case 2: //Takes player to Forest
                        case 3://Takes player to Convent
                        case 4: //If player chooses this, the final game stage will be loaded
                    }
                }else{
                    System.out.println("Ingrese un dato valido");
                }
            }while (isValidInput==false);
            
    
    }

    
    /**
     * 
     * @param marketClue
     * @param forestClue
     * @param isValidInput
     * @param decision
     * @param gameAssassin
     * @return
     */
    public static boolean playMarket(boolean marketClue, boolean forestClue,boolean isValidInput,byte decision, Assassin gameAssassin,boolean marketAssassinClue){ 
        Scanner input=new Scanner(System.in);
        if (marketClue){ 
            System.out.println("Decidiste volver al mercado para seguir investigando ya que te parecio sospechoso un local. Cuando estas a punto "+
                               "de llegar, escuchas pasos, por lo que te escondes.\n Una voz te advierte que ya sabe que estas ahi, por lo que "+
                               "te recomienda salir antes de que el vaya por vos.\nAl salir te das cuenta de que es un viejo amigo, lo cual te alegra." +
                               " Cuando estas a punto de saludarlo, te dice que sabe que estas buscando pistas, y que, debido a que esta aburrido, "+ 
                               "te dara otra siempre y cuando respondas una pregunta, pero, si respondes mal, te matara.");
            if (marketAssassinClue){

            }else{
                System.out.println("Fin del juego");
                return true;
            }

        } else{
            System.out.println("Llegas al mercado y ves que esta vacio. Probablemente sea por la hora.\nSe te ocurre investigar mas para intentar" +
                               " obtener pistas sobre tu hermana. Que te gustaria hacer?" +
                               "\nInvestigar un local (1)\nExplorar el mercado (2)\nEsperar a que aparezca alguein (3)");
            do{
                isValidInput=input.hasNextByte();
                if (isValidInput){
                    decision=input.nextByte();
                    switch (decision){
                        case 1: //Investigate a 
                                System.out.println("Un local que tiene todo desordenado, como si alguien hubiese estado buscando algo de forma " +
                                                   "desesperada te llama la atencion.\nTe acercas y te das cuenta de que hay " + gameAssassin.getAssassinClue()
                                                   + " lo cual no tiene relacion alguna con lo que se vende en ese lugar.\nLo guardas por si pudiera servirte como una" +
                                                   "pista.\n \n Al dejar el local escuchas pasos, y por seguridad decidis volver al centro de la aldea para " +
                                                   "seguir buscando en otro lugar.");
                                isValidInput=true;
                                return true; 
                        case 2://Explore the place
                                System.out.println("Te pones a caminar por todo el mercado, hay muchos puestos, desde pociones milagrosas hasta " +
                                                   "libros de todas partes del mundo.\nCuando estas a punto de llegar al final del mercado," +
                                                   "te das cuenta de que alguien dejo tirado por el pozo " + gameAssassin.getWeaponClue()+"." +
                                                   "\nDecidis guardarlo por si pudiera servirte como una pista.\nDebido a que te das cuenta de que" +
                                                   "has llegado al final del mercado, decidis volver a la plaza central de la aldea.");
                                return true;
                                case 3://Wait for someone to get close
                                        System.out.println("Decidis esperar a que alguien se acerque, por lo que te escondes en un puesto del mercado.\n" +
                                                           "Al pasar unos minutos, escuchas pasos de una persona que deja caer un trozo de papel.\n" +
                                                           "Cuando dejas de escuchar sus pasos, salis de tu escondite y agarras el papel, que tiene escrita la "+
                                                           "palabra " + gameAssassin.getRoomClue()+ ".\nDecidis guardarlo por si puede servirte como pista " +
                                                           "y volver al centro de la aldea.");
                                return true;
                    
                    }       
                }

            }while (isValidInput==false);
        } 
               
        return true;

    }
    
    
    public static void playMarket(){

    }
  

    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        byte decision;
        boolean isValidInput=false, marketClue=false, conventClue=false, forestClue=false,validInput=false,fromDeerToWait=false,fromMarketExploretoForest=false,
                fromConventToLake=false,marketAssassinClue=false,isHard=false;

            System.out.println("Bienvenido/a clue. El juego en el cual usted debe averiguar quien mato a su hermana, con que arma y en donde."+
                               "\nPara empezar a jugar ingrese el numero 1" +
                               "\nPara continuar desde el ultimo punto de guardado ingrese el numero 2" +
                               "\nPara leer las instrucciones ingrese el numero 3" +
                               "\nPara salir del juego ingrese el numero 4");
            while (true){
                isValidInput=input.hasNextByte(); //Es para evitar que se ingrese un dato erroneo por accidente(por ejemplo una K) y crashee el programa.
                if(isValidInput)
                {   
                    decision=input.nextByte();
                    switch (decision)
                    {
                        case 1: //El jugador comenzara el juego.
                                mainGame(marketClue, conventClue, forestClue, fromDeerToWait, fromMarketExploretoForest, fromConventToLake,marketAssassinClue);
                                System.out.println( "\nPara empezar una nueva partida ingrese el numero 1." +
                                                    "\nPara continuar desde el ultimo punto de guardado ingrese el numero 2" +
                                                    "\nPara leer las instrucciones ingrese el numero 3" +
                                                    "\nPara salir del juego ingrese el numero 4");
                                break;
                        case 2: //El jugador continuara su partida.
                                break;
                        case 3: //El jugador podra leer las instrucciones.
                                break;
                        case 4:
                                System.exit(0);
                        default:
                                System.out.println("Ingrese una opcion valida");

                    }

                } else
                {
                    System.out.println("El dato ingresado no es correcto. Por favor vuelva a intentarlo");
                    input.next();
                }
            }
            
          
    }

}