import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clue{

    public static String[] givenClues=new String[6];
    public static byte givenCluesControl=0;

    public static void mapCentral(){
        System.out.println("\n"+//MAPA GENERAL
        "-------------------------------------------------------------------------------\n"+
        "|________________                                            __________________|\n"+
        "|                |                                          |                  |\n"+
        "|                |      _______________________________     |                  |\n"+
        "|                |     |                               |    |                  |\n"+
        "|                |     |          ESTAS AQUI           |    |                  |\n"+
        "|    MERCADO     |     |         PLAZA CENTRAL         |    |     CONVENTO     |\n"+
        "|                |     |                               |    |                  |\n"+
        "|                |     |_______________________________|    |                  |\n"+
        "|                |      _______________________________     |                  |\n"+
        "|                |     |                               |    |                  |\n"+
        "|________________|     |                               |    |                  |\n"+
        "|                      |             BOSQUE            |    |__________________|\n"+
        "|                      |                               |                       |\n"+
        "|                      |_______________________________|                       |\n"+
        "-------------------------------------------------------------------------------");
    }

    public static void mapMarket(){
        System.out.println("\n"+//MAPA UBICADO EN MERCADo
        "-------------------------------------------------------------------------------\n"+
        "|________________                                            __________________|\n"+
        "|                |                                          |                  |\n"+
        "|                |      _______________________________     |                  |\n"+
        "|                |     |                               |    |                  |\n"+
        "|   ESTAS AQUI   |     |                               |    |                  |\n"+
        "|    MERCADO     |     |         PLAZA CENTRAL         |    |     CONVENTO     |\n"+
        "|                |     |                               |    |                  |\n"+
        "|                |     |_______________________________|    |                  |\n"+
        "|                |      _______________________________     |                  |\n"+
        "|                |     |                               |    |                  |\n"+
        "|________________|     |                               |    |                  |\n"+
        "|                      |             BOSQUE            |    |__________________|\n"+
        "|                      |                               |                       |\n"+
        "|                      |_______________________________|                       |\n"+
        "-------------------------------------------------------------------------------");
    }
    
    public static void mapForest(){
        System.out.println("\n"+//MAPA UBICADO EN BOSQUE
        "-------------------------------------------------------------------------------\n"+
        "|________________                                            __________________|\n"+
        "|                |                                          |                  |\n"+
        "|                |      _______________________________     |                  |\n"+
        "|                |     |                               |    |                  |\n"+
        "|                |     |                               |    |                  |\n"+
        "|    MERCADO     |     |         PLAZA CENTRAL         |    |     CONVENTO     |\n"+
        "|                |     |                               |    |                  |\n"+
        "|                |     |_______________________________|    |                  |\n"+
        "|                |      _______________________________     |                  |\n"+
        "|                |     |           ESTAS AQUI          |    |                  |\n"+
        "|________________|     |                               |    |                  |\n"+
        "|                      |             BOSQUE            |    |__________________|\n"+
        "|                      |                               |                       |\n"+
        "|                      |_______________________________|                       |\n"+
        "-------------------------------------------------------------------------------\n");
    }

    public static void mapConvent(){
        System.out.println("MAPA\n"+ //MAPA UBICADO EN CONVENTO
            "-------------------------------------------------------------------------------\n"+
            "|________________                                            __________________|\n"+
            "|                |                                          |                  |\n"+
            "|                |      _______________________________     |                  |\n"+
            "|                |     |                               |    |                  |\n"+
            "|                |     |                               |    |    ESTAS AQUI    |\n"+
            "|    MERCADO     |     |         PLAZA CENTRAL         |    |     CONVENTO     |\n"+
            "|                |     |                               |    |                  |\n"+
            "|                |     |_______________________________|    |                  |\n"+
            "|                |      _______________________________     |                  |\n"+
            "|                |     |                               |    |                  |\n"+
            "|________________|     |                               |    |                  |\n"+
            "|                      |             BOSQUE            |    |__________________|\n"+
            "|                      |                               |                       |\n"+
            "|                      |_______________________________|                       |\n"+
            "-------------------------------------------------------------------------------");
    }

    public static void playerLost(){
        System.out.println(
            "\n\nXX          XX\n"+
	        "  XX       XX\n"+
            "    XX   XX\n"+
            "     XXXX\n"+
            "    XX   XX\n"+
            "  XX       XX\n"+
            "XX          XX");
    }

    public static void playerWon(){
        System.out.println(
        "\n\n              /\n"+
        "             /\n"+
        "            /\n"+
        "           /\n"+
        "          /\n"+
        "    \\    /\n"+
        "     \\  /\n"+
        "      \\/");
    }

    public static void assassinChallengeDrawing(){
        System.out.println(
        "\n\nRRRRRRREEEEEEETTTTTTTOOOOOOO \n"+
        "RRRRRRREEEEEEETTTTTTTOOOOOOO\n"+
        "RRRRRREEEEEETTTTTTOOOOOO \n"+
        "RRRRREEEEETTTTTOOOOO\n"+
        "RRETOO     /|\n"+
        "RRETOO    / |\n"+
        "RRETOO__ /__|\n"+
        "RETO\n"+
        "RETO\n"+
        "RETO");
    }

    public static void gunFiresNoBullet(){
        System.out.println(
        "\n\nRRRRRRREEEEEEETTTTTTTOOOOOOO  /    \n"+
        "RRRRRRREEEEEEETTTTTTTOOOOOOO  -   \n"+
        "RRRRRREEEEEETTTTTTOOOOOO      -\n"+
        "RRRRREEEEETTTTTOOOOO          \\\n"+
        "RRETOO     /|\n"+
        "RRETOO    / |\n"+
        "RRETOO__ /__|\n"+
        "RETO\n"+
        "RETO\n"+
        "RETO");
    }

    public static void gunFiresBullet(){
        System.out.print( 
        "\n\nRRRRRRREEEEEEETTTTTTTOOOOOOO      -------------------       __________\n"+
        "RRRRRRREEEEEEETTTTTTTOOOOOOO      ------------             (          |  \n"+
        "RRRRRREEEEEETTTTTTOOOOOO          ---------------          (__________|  \n"+
        "RRRRREEEEETTTTTOOOOO              ----------------\n"+
        "RRETOO     /|\n"+
        "RRETOO    / |\n"+
        "RRETOO__ /__|\n"+
        "RETO\n"+
        "RETO\n"+
        "RETO\n");
    }

    public static void pressAKeyToContinue(Scanner input){
        System.out.println("\nIngresa cualquier dato y presiona enter para continuar");
        input.next();
    }



    /**
     * This method controls how the game story evolves.
     * @param marketClue lets the program know if market clue has been given.
     * @param conventClue lets the program know if convent clue has been given.
     * @param forestClue lets the program know if forest clue has been given.
     * @param fromDeerToWait lets the program know if the player is moving from the forest to the market.
     * @param fromMarketExploretoForest lets the program know if the player is moving from the market to the forest.
     * @param fromConventToLake lets the program know if the player is moving from the convent to the forest.
     */
    public static void mainGame(boolean marketClue, boolean conventClue, boolean forestClue, boolean forestAssassinClue, boolean 
                                marketAssassinClue, boolean conventAssassinClue,boolean isHard,boolean someoneHasDied){                     
        Scanner input=new Scanner(System.in);
        Assassin gameAssassin=new Assassin();
        boolean isValidInput=false;
        byte decision;
        String[] respuestaJugador=new String[3];
            mapCentral();
            System.out.println("\nTe encontras en la entrada de Orilon, la aldea en la que tu hermana fue asesinada." +
                               "\nLo ultimo que vos supiste de ella, es que recibio una carta de una persona desconocida, la cual la invitaba a un retiro espiritual." +
                               "\nDespues de una semana de haber asistido a tal evento, los policias te informaron que su cuerpo habia sido\n"+
                               "encontrado sin vida en la entrada de la aldea.\n"+
                               "Es por ello que decidiste tratar de averiguar quien es el culpable de tal asesinato, a media noche, "+
                               "cuando no hay nadie viendo o escuchando y probablemente el asesino ande suelto buscando a una nueva victima." +
                               "\nTe adentras en la aldea y lo primero que ves es la plaza central. \nDesde ese lugar te podes dirigir al"+
                               " mercado, el bosque y el monasterio. \nAntes de moverte escuchas pasos a la lejania. Sera el asesino?\n" +
                               "\n\nA donde queres ir?\nMercado (1)\nBosque (2)\nMonasterio (3)\nDecir quien es el culpable (4)");
            do{
                decision=isValidInput(input, isValidInput);
                    if (marketAssassinClue && forestAssassinClue && conventAssassinClue){
                            decision=4;
                    }
                    switch (decision){
                        case 1: //Takes player to market
                                if (marketAssassinClue){
                                    System.out.println("\nConsideras ir de nuevo al mercado, aunque te das cuenta de que lo mejor seria explorar algun otro lugar.");
                                    isValidInput=false;

                                }else if (marketClue){
                                        someoneHasDied=playMarket(marketClue, isValidInput, decision, gameAssassin,marketAssassinClue,someoneHasDied);
                                        if (someoneHasDied==false){
                                            marketAssassinClue=true;
                                            isValidInput=false;
                                            mapCentral();
                                            System.out.println("\nA donde te gustaria ir ahora? " +
                                                           "\nMercado (1)\nBosque (2\nMonasterio (3)\nDecir quien, donde y con que arma mataron a tu hermana (4)");
                    
                                        } else if (someoneHasDied){
                                            isValidInput=true;
                                            System.out.println("\nGame over");
                                            break;
                                        }
                                }else {
                                        isValidInput=false;
                                        decision=0;
                                        marketClue=playMarket(marketClue, isValidInput, decision, gameAssassin,marketAssassinClue,someoneHasDied);
                                        mapCentral();
                                        System.out.println("\nA donde te gustaria ir ahora? " +
                                                           "\nMercado (1)\nBosque (2\nMonasterio (3)\nDecir quien, donde y con que arma mataron a tu hermana (4)");
                                break;
                                }
                                break;
                        case 2: //Takes player to Forest
                                if (forestAssassinClue){
                                    System.out.println("\nConsideras ir de nuevo al mercado, aunque te das cuenta de que lo mejor seria explorar algun otro lugar.");
                                    isValidInput=false;
                                }else if (forestClue){
                                        someoneHasDied=playForest(forestClue, isValidInput, decision, gameAssassin,forestAssassinClue,someoneHasDied);
                                        if (someoneHasDied==false){
                                            forestAssassinClue=true;
                                            isValidInput=false;
                                            mapCentral();
                                            System.out.println("\nA donde te gustaria ir ahora? " +
                                                               "\nMercado (1)\nBosque (2\nMonasterio (3)\nDecir quien, donde y con que arma mataron a tu hermana (4)");
                                        } else if (someoneHasDied){
                                            isValidInput=true;
                                            System.out.println("\nGame over");

                                            break;
                                         
                                        }
                                }else {
                                        isValidInput=false;
                                        decision=0;
                                        forestClue=playForest(forestClue, isValidInput, decision, gameAssassin,forestAssassinClue,someoneHasDied);
                                        mapCentral();
                                        System.out.println("\nA donde te gustaria ir ahora? " +
                                                           "\nMercado (1)\nBosque (2\nMonasterio (3)\nDecir quien, donde y con que arma mataron a tu hermana (4)");
                                }
                                break;
                        case 3://Takes player to Convent

                                if (conventAssassinClue){
                                    System.out.println("\nConsideras ir de nuevo al convento, aunque te das cuenta de que lo mejor seria explorar algun otro lugar.");
                                    isValidInput=false;

                                }else if (conventClue){
                                        someoneHasDied=playConvent(conventClue, isValidInput, decision, gameAssassin,conventAssassinClue,someoneHasDied);
                                        if (someoneHasDied==false){
                                            forestAssassinClue=true;
                                            isValidInput=false;
                                            mapCentral();
                                            System.out.println("\nA donde te gustaria ir ahora? " +
                                                               "\nMercado (1)\nBosque (2\nMonasterio (3)\nDecir quien, donde y con que arma mataron a tu hermana (4)");
                                            break;
                    
                                        } else if (someoneHasDied){
                                            isValidInput=true;
                                            System.out.println("\nGame over");
                                            break;
                                        }
                                }else {
                                        isValidInput=false;
                                        decision=0;
                                        conventClue=playConvent(conventClue, isValidInput, decision, gameAssassin,conventAssassinClue,someoneHasDied);
                                        mapCentral();
                                        System.out.println("\nA donde te gustaria ir ahora? " +
                                                           "\nMercado (1)\nBosque (2\nMonasterio (3)");
                                break;
                                }
                                break;
                        case 4: //If player chooses this, the final game stage will be loaded
                                
                                finalGameStage(input, isHard,gameAssassin,decision,isValidInput);
                                
                                break;
                        default:
                                System.out.println("\nIngrese una opcion valida");
                                isValidInput=false;
                        
                    }
                
                if (decision==4){
                    break;
                }
            }while (isValidInput==false);
            
    
    }
    
 
    /**
     * This method is market gameplay.
     * @param marketClue Checks if market clue has been given, if it does, an assassin challenge is given.
     * @param isValidInput Checks if the user input is valid.
     * @param decision Let's the program know what does the player wants to do.
     * @param gameAssassin Let's playMarket method access Assassin class methods.
     * @param marketAssassinClue Checks if market assassin challenge clue has been given, if it does, playMarket method just sends a message.
     * @param someoneHasDied Checks if someone has died, if the player did, the game ends with a game over message.
     * @return
     */
    public static boolean playMarket(boolean marketClue,boolean isValidInput,byte decision, Assassin gameAssassin,boolean marketAssassinClue,
                                     boolean someoneHasDied){ 
        Scanner input=new Scanner(System.in);
        mapMarket();
        isValidInput=false;
        if (marketClue){
            if (marketAssassinClue==false){
                assassinChallengeDrawing();
                System.out.println("\nDecidiste volver al mercado para seguir investigando ya que te parecio sospechoso un local.\nCuando estas a punto "+
                               "de llegar, escuchas pasos, por lo que te escondes.\n Una voz te advierte que ya sabe que estas ahi, por lo que "+
                               "te recomienda salir antes de que vaya por vos.\nAl salir te das cuenta de que es un viejo amigo, lo cual te alegra." +
                               "\nCuando estas a punto de saludarlo, te dice que sabe que estas buscando pistas sobre el asesino de tu hermana,"+
                               " y que, debido a que la seguridad de su hermano esta en riesgo, debera detenerte a toda costa." +
                               "\n\"Mi hermano fue secuestrada por el asesino, si no quiero que lo mate tendras que enfrentarte a mi\"" +
                               "\nDicho esto, tu amigo saco una pistola." +
                               "\n\"Jugaremos ruleta rusa. Cuando contestes una pregunta, te apuntare y apretare el gatillo si es incorrecta la respuesta."+
                               "Si la respuesta es correcta, me apuntare a mi.\nLa pregunta sera la misma hasta que te mate por intentos fallidos o cambiara si"+
                               " la respuesta es correcta y no muero.\"" );

            someoneHasDied=assassinQuestions(input, isValidInput,someoneHasDied,decision);
            if (someoneHasDied){
                return true;
            } else{
                givenClues[givenCluesControl]=gameAssassin.getRoomClue();
                System.out.println("Del cadaver de tu amigo sale una nota que tiene la palabra \"" + givenClues[givenCluesControl] + "\".\nLa guardas y volves al centro de la aldea");
                givenCluesControl++;
                pressAKeyToContinue(input);
                return false;
            }
            }else if (marketAssassinClue){ //
                System.out.println("\nAntes de volver a ir, se te ocurre que seria mejor ir a revisar otros lugares");
                return true;
            }

        } else{   //First time at market 
            System.out.println("\nLlegas al mercado y ves que esta vacio. Probablemente sea por la hora.\nSe te ocurre investigar mas para intentar" +
                               " obtener pistas sobre tu hermana.\nQue te gustaria hacer?" +
                               "\nInvestigar un local (1)\nExplorar el mercado (2)\nEsperar a que aparezca alguien (3)");
            do{
                decision=isValidInput(input, isValidInput);
                    switch (decision){
                        case 1: //Investigate a local
                                givenClues[givenCluesControl]=gameAssassin.getAssassinClue();
                                System.out.println("\nUn local que tiene todo desordenado, como si alguien hubiese estado buscando algo de forma " +
                                                   "desesperada te llama la atencion.\nTe acercas y te das cuenta de que hay: \"" + givenClues[givenCluesControl] +
                                                   "\" lo cual no tiene relacion alguna con lo que se vende en ese lugar.\nLo guardas por si pudiera servirte como una" +
                                                   "pista.\n \nAl dejar el local escuchas pasos, y por seguridad decidis volver al centro de la aldea para " +
                                                   "seguir buscando en otro lugar.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true; 

                        case 2://Explore the place
                                givenClues[givenCluesControl]=gameAssassin.getWeaponClue();
                                System.out.println("\nTe pones a caminar por todo el mercado, hay muchos puestos, desde pociones milagrosas hasta " +
                                                   "libros de todas partes del mundo.\nCuando estas a punto de llegar al final del mercado," +
                                                   "te das cuenta de que alguien dejo tirado por el pozo: \"" + givenClues[givenCluesControl]+"." +
                                                   "\"\nDecidis guardarlo por si pudiera servirte como una pista.\nDebido a que te das cuenta de que" +
                                                   "has llegado al final del mercado, decidis volver a la plaza central de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true;

                        case 3://Wait for someone to get close
                                givenClues[givenCluesControl]=gameAssassin.getRoomClue();
                                System.out.println("\nDecidis esperar a que alguien se acerque, por lo que te escondes en un puesto del mercado.\n" +
                                                   "Al pasar unos minutos, escuchas pasos de una persona que deja caer un trozo de papel.\n" +
                                                   "Cuando dejas de escuchar sus pasos, salis de tu escondite y agarras el papel, que tiene escrito "+
                                                   "\"" + givenClues[givenCluesControl]+ "\".\nDecidis guardarlo por si puede servirte como pista " +
                                                   "y volver al centro de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true;
                        default:   
                                System.out.println("\nIngrese una opcion valida");
                                isValidInput=false;
                }

            }while (isValidInput==false);
        } 
               
        return true;

    }


    /**
     * This method is forest gameplay.
     * @param forestClue Checks if forest clue has been given, if it does, an assassin challenge is given.
     * @param isValidInput Checks if user input is valid.
     * @param decision Let's the program know what does the player wants to do.
     * @param gameAssassin Let's playForest method access Assassin class methods.
     * @param forestAssassinClue Checks if forest assassin challenge clue has been given, if it does, playForest method just sends a message.
     * @param someoneHasDied Checks if someone has died, if the player did, the game ends with a game over message.
     * @return
     */
    public static boolean playForest(boolean forestClue,boolean isValidInput,byte decision, Assassin gameAssassin,boolean forestAssassinClue,
                                     boolean someoneHasDied){ 
        Scanner input=new Scanner(System.in);
        mapForest();
        isValidInput=false;
        if (forestClue){
            if (forestAssassinClue==false){
                assassinChallengeDrawing();
                System.out.println("\nDecidiste volver al bosque ya que todo el estres te estaba volviendo loco.\nPor alguna razon, sentias el ambiente pesado y"+
                                   " eso te causaba un mal presentimiento.\nMientras mas te adentrabas, mas deseabas salir corriendo de alli.\n"+
                                   "\nCuando estabas decidido a dar la vuelta y volver a la aldea, tuviste la necesidad de voltear a ver hacia arriba.\n"+
                                   "No pudiste evitar gritar.\nEntre las ramas de los arboles se encontraba el cadaver de una persona, deformada por cuerdas que"+
                                   " mantenian su cadaver en una posicion anti natural."+
                                   "\n\"Veo que has encontrado a mi obra maestra\"\nDijo una voz que te asusto mucho."+
                                   "\n\"Y antes de que lo preguntes, no. No fui yo quien mato a tu hermana, pero si se muy bien quien lo hizo.\n"+
                                   "Esa persona sabe muy bien que estas buscando pistas, y me ha pedido ayuda para detenerte.\n"+
                                   "Jugaremos ruleta rusa. \nTe dare una pregunta, si respondes de forma incorrecta te apuntare y apretare el gatillo, y si moris,"+
                                   "hare de tu cuerpo una escultura como el de la persona que se encuentra sobre vos."+
                                   "\nEn cambio, si respondes bien, me apuntare a mi.\nSi muero podras encontrar una pista de que arma utilizo el asesino con tu"+
                                   "hermana. \nQue comience el juego!\"");

                someoneHasDied=assassinQuestions(input, isValidInput,someoneHasDied,decision);
                if (someoneHasDied){
                    return true;
                } else{
                    givenClues[givenCluesControl]=gameAssassin.getRoomClue();
                    System.out.println("\nDel cadaver del asesino sale una nota que tiene escrito: \"" + givenClues[givenCluesControl] + 
                                       "\".\nLa guardas y volves al centro de la aldea");
                    givenCluesControl++;
                    pressAKeyToContinue(input);
                    return false;
                }
            }else if (forestAssassinClue){ //
                System.out.println("\nAntes de volver a ir, se te ocurre que seria mejor ir a revisar otros lugares");
                return true;
            }

        } else{   //First time at forest 
            System.out.println("\nDespues de caminar durante diez minutos, llegas al centro del bosque.\nEl ambiente te resulta muy agradable." +
                               "\nTe pones a pensar en lo mucho que le gustaba a tu hermana la naturaleza, y no podes evitar llorar."+
                               "\nCuando te calmas decidis que es un lugar ideal para buscar pistas.\nA donde te gustaria ir?"+
                               "\nIr al lago del bosque (1)\nExplorar mucho mas adentro del bosque (2)\nJugar con un borrego que esta cerca(3)");
            do{
                decision=isValidInput(input, isValidInput);
                    switch (decision){
                        case 1: //Go to the lake
                                givenClues[givenCluesControl]=gameAssassin.getAssassinClue();
                                System.out.println("\nTe pones a caminar rumbo al lago que observabas desde la aldea.\nCuando llegas, te das cuenta de que es hermoso. "
                                                    +"\nTe das cuenta de que hay ciertos manchas de sangre cerca de la orilla, por lo que decidis acercarte."
                                                    +"\nCuando lo haces, descubris de que hay \""+ givenClues[givenCluesControl] + "\".\nTe parece muy sospechoso y"+
                                                   " lo guardas por si pudiera ser alguna pista.\nTe quedas observando el bello paisaje unos minutos y luego volves "+
                                                   "al centro de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true; 

                        case 2://Explore deeper into the woods.
                                givenClues[givenCluesControl]=gameAssassin.getWeaponClue();
                                System.out.println("\nTe adentras en el bosque y descubris que hay una choza que tiene la puerta entre abierta." +
                                                   "\nDecidis entrar y te das cuenta de que alguien movio un mueble y en donde deberia estar la pared hay una puerta." +
                                                   "\nTe adentras y descubris una habitacion, y en el centro hay \""+ givenClues[givenCluesControl]+"\"." +
                                                   "\nDecidis guardarlo por si pudiera servirte como una pista.\nEscuchas unos pasos en el piso de arriba y por "+
                                                   "seguridad decidis salir de ahi y volver al centro de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true;

                        case 3://Follow the animal
                                givenClues[givenCluesControl]=gameAssassin.getRoomClue();
                                System.out.println("\nCaminando por el bosque ves que un borrego esta jugueteando con algo.\n"+
                                                   "Te acercas y te das cuenta de que es una libreta con una sola hoja, que tiene escrito \""+
                                                   givenClues[givenCluesControl]+ "\".\nDecidis guardarlo por si puede servirte como pista " +
                                                   "y volves al centro de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true;
                        default:   
                                System.out.println("\nIngrese una opcion valida");
                                isValidInput=false;
                    
                    }       
                

            }while (isValidInput==false);
        } 
               
        return true;

    }


    /**
     * This method is convent gameplay.
     * @param conventClue Checks if convent clue has been given, if it does, an assassin challenge is given.
     * @param isValidInput Checks if user input is valid.
     * @param decision Let's the program know what does the player wants to do.
     * @param gameAssassin Let's playForest method access Assassin class methods.
     * @param conventAssassinClue Checks if forest assassin challenge clue has been given, if it does, playConvent method just sends a message.
     * @param someoneHasDied Checks if someone has died, if the player did, the game ends with a game over message.
     * @return
     */
    public static boolean playConvent(boolean conventClue,boolean isValidInput,byte decision, Assassin gameAssassin,boolean conventAssassinClue,
                                     boolean someoneHasDied){ 
        Scanner input=new Scanner(System.in);
        mapConvent();
        isValidInput=false;
        if (conventClue){
            if (conventAssassinClue==false){
                assassinChallengeDrawing();
                System.out.println("\nDecidiste volver al convento ya que no exploraste todo el lugar y no podias dejar de pensar en ello."+
                                   "\nAl llegar, una bala pasa al lado de tu oreja, lo cual te sorprende y hace gritar."+
                                   "\n\"Asi que vos sos el que intenta sabotear a la organizacion.\"\nVolteas a ver a quien dijo ello y te das  cuenta de que es un"+
                                   " hombre con un traje rojo y con sombrero"+
                                   "\n\"Por si no lo sabes, la persona que mato a tu hermana solo estaba mostrando de lo que somos capaces.\n"+
                                   "\nYo le dije que era muy probable que su hermano intentase descubrir quien fue para decirle a la policia."+
                                   "\nEs mi deber, como buen cazarrecompensas, detenerte.\n "+
                                   "Jugaremos ruleta rusa.\nTe dare una pregunta, si respondes bien, me apuntare a la cabeza y apretare el gatillo." +
                                   "\nSi no sale la bala, cambiare la respuesta, si respondes mal te apuntare y apretare el gatillo. Comencemos.\"");

                someoneHasDied=assassinQuestions(input, isValidInput,someoneHasDied,decision);
                if (someoneHasDied){
                    return true;
                } else{
                    givenClues[givenCluesControl]=gameAssassin.getRoomClue();
                    System.out.println("\nAl caer al piso el cadaver del cazador, de su sombrero sale \"" + gameAssassin.getAssassinClue() + 
                                       "\".\nLo guardas y volves al centro de la aldea");
                    givenCluesControl++;
                    pressAKeyToContinue(input);
                    return false;
                }
            }else if (conventAssassinClue){ //
                System.out.println("\nAntes de volver a ir, se te ocurre que seria mejor ir a revisar otros lugares");
                return true;
            }

        } else{   //First time at convent
            System.out.println("\nCuando investigaste sobre Orilon, leiste que habia un convento abandonado desde hace mucho tiempo, lo cual puede resultar perfecto "+
                               "para cometer un crimen.\nCuando llegas, ves que hay muchos lugares que pueden resultar perfectos para encontrar pistas.\n"+
                               "\nQue te gustaria hacer?\nIr a las catacumbas (1)\nExplorar el convento (2)\nIr al cementerio (3)");
            do{
                
                    decision=isValidInput(input, isValidInput);
                    switch (decision){
                        case 1: //Go to the catacombs
                                givenClues[givenCluesControl]=gameAssassin.getAssassinClue();
                                System.out.println("\nTe dirigis con cuidado a las catacumbas, ya que si algo te pasa en ese lugar nadie se dara cuenta.\n"+
                                                   "Al llegar, descubris que no se puede avanzar mucho ya que un monton de rocas bloquean el camino.\n"+
                                                   "Curiosamente, te das cuenta de que hay una caja metida entre las rocas.\n"+
                                                   "Te acercas y al abrirla ves que adentro hay \"" +givenClues[givenCluesControl] + "\"."+
                                                   "\nTe parece muy sospechoso, ya que pareciera que alguien estaba intentando esconderlo."+
                                                   " lo guardas por si pudiera ser alguna pista.\nDebido a que el lugar te da escalofrios, decidis volver al"+
                                                   " centro de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true; 

                        case 2://Explore the convent 
                                givenClues[givenCluesControl]=gameAssassin.getWeaponClue();
                                System.out.println("\nDecidis abrir la vieja puerta del convento, con mucho esfuerzo, y al hacerlo, te das cuenta de que todo esta"+
                                                   " destruido.\nCada paso que das tiene mucho eco, lo cual te resulta gracioso.\nCuriosamente," +
                                                   " ves que una estatua semi destruida, en su mano, tiene \""+givenClues[givenCluesControl]+"\"." +
                                                   "\nSi el asesino intentaba ocultarlo, definitivamente no hizo un buen trabajo.\nDecidis guardarlo por si pudiera" +
                                                   "ser una pista y volves al centro de la ciudad.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true;

                        case 3://Explore the cementery.
                                givenClues[givenCluesControl]=gameAssassin.getRoomClue();
                                System.out.println("\nVes que a la par del convento se encuentra el viejo cementerio del pueblo.\""+
                                                   givenClues[givenCluesControl]+ "\".\nDecidis guardarlo por si puede servirte como pista " +
                                                   "y volves al centro de la aldea.");
                                givenCluesControl++;
                                pressAKeyToContinue(input);
                                return true;
                        default:   
                                System.out.println("\nIngrese una opcion valida");
                                isValidInput=false;
                    
                    }        
                

            }while (isValidInput==false);
        } 
               
        return true;

    }


    /**
     * This method is the final game stage, which will decide if the player wins or loses the game.
     * @param input Allows the user to write.
     * @param isHard Checks the difficulty of the game, so the method can set the propper amount of lives.
     * @param gameAssassin Allows finalGameStage to access Assassin methods.
     * @param decision Has the control of switch.
     * @param isValidInput Checks if user input is valid.
     */
    public static void finalGameStage(Scanner input,boolean isHard,Assassin gameAssassin,byte decision,boolean isValidInput){
        String[] names=new String[]{"Plague Doctor", "Der Krampus", "Jack the Ripper", "Madame de Brinvilliers", 
        "Anne Boleyn", "Manuel Blanco Romasanta"};
        String[] weapons=new String[] {"Pistola", "Cuchillo","Veneno","Magia","Tortura","Fuego"};
        String[] rooms=new String[]{"plaza del mercado","monasterio", "bosque", "cementerio","plaza central","lago del bosque","catacumbas"};
        String userGuess;
        boolean isWrong=false;
        int lives;
        decision=3;

                if (givenCluesControl!=5){ //If six clues were not given, this fills givenClues array with text, so "null" is not shown.
                    for (int i=(givenCluesControl);i<6;i++){
                        switch(i){
                            case 0:
                                     givenClues[i]="Cabello de tu hermana";
                                     break;
                            case 1:
                                    givenClues[i]="Ropa rota de tu hermana";
                                    break;
                            case 2:
                                    givenClues[i]="Fotografia de tu hermana";
                                    break;
                            case 3:
                                    givenClues[i]="Carta de retiro espiritual";
                                    break;
                            case 4:
                                    givenClues[i]="Carta a persona misteriosa por parte de tu hermana";
                                    break;
                            case 5:
                                    givenClues[i]="Sangre";
                                    break;
                        }
                           
                    }
                }

                System.out.println("\nDespues  de haber recorrido partes de la aldea, te sentis listo para decirle a los policias quien es el asesino," +
                                " ya que has juntado evidencia que ha servido como pista para encontrarlo.\nAl llegar a la estacion de policia," +
                                " te advierten que si te equivocas, nunca te volveran a escuchar, ya que es un tema muy delicado involucrarse en una"+
                                " investigacion oficial de la policia.");
                if (isHard){
                    System.out.println("\n\"Te daremos una sola oportunidad , a la primer equivocacion te mantendremos bajo arresto domiciliar para evitar que" +
                                       " te pase algo por andar involucrandote en asuntos oficiales.\"");
                    lives=1;

                }else{
                    System.out.println("\n\"Entendemos que estas muy preocupado por tu hermana, te daremos tres oportunidades para que te resulte mas facil analizar" +
                                       "todas las pistas que has reunido");
                    lives=3;
                    
                System.out.println("\n\nLas pistas recolectadas son: " + Arrays.toString(givenClues));
                }  
                System.out.println("\nQuien es el asesino?");
                for (int i=0;i<6;i++){
                    System.out.println(names[i] + "  ("+(i)+")");
                }
                while(lives!=0){
                    decision=isValidInput(input, isValidInput);
                    if (names[decision]==gameAssassin.getName()){
                        System.out.println("\"Tiene sentido! Entre todos los sospechosos esta persona coincide con todas las pistas que hemos reunido\"");
                        break;
                    }else{
                        System.out.println("\"Descartamos a este sospechoso, las pistas reunidas no tienen ni una sola relacion.\"");
                        lives--;
                        if (lives!=0){
                            System.out.println("Te daremos una de las pistas que encontramos sobre el asesino: " + gameAssassin.getAssassinClue());
                        }
                    }
                }
                if (lives!=0){ 
                    System.out.println("\nCual de estas armas fue utilizada para asesinar a tu hermana?");

                    for (int i=0;i<6;i++){
                        System.out.println(weapons[i] + "  ("+(i)+")");
                    }
                }

                while(lives!=0){
                    decision=isValidInput(input, isValidInput);
                    if (names[decision]==gameAssassin.getName()){
                        System.out.println("\"Tiene sentido! Entre todas las armas sospechosas esta coincide con lo que se descubrio en la autospia.\"");
                        break;
                    }else{
                        System.out.println("\"Descartamos a este sospechoso, las pistas reunidas no tienen ni una sola relacion.\"");
                        lives--;
                        if (lives!=0){
                            System.out.println("Te daremos una de las pistas que encontramos sobre el arma homicida: " + gameAssassin.getWeaponClue());
                        }
                    }
                }
                if (lives!=0){ 
                    System.out.println("\nEn cual de estos lugares fue asesinada tu hermana?");
                    for (int i=0;i<7;i++){
                        System.out.println(rooms[i] + "  ("+(i)+")");
                    }
                }

                while(lives!=0){
                    decision=isValidInput(input, isValidInput);
                    if (names[decision]==gameAssassin.getName()){
                        System.out.println("\"Tiene sentido! Entre todos los lugares sospechosos este coincide con todas las pistas que hemos reunido\"");
                        break;
                    }else{
                        System.out.println("\"Descartamos ese lugar, personas no vieron a tu hermana nunca rondando por alli.\"");
                        lives--;
                        if (lives!=0){
                            System.out.println("Te daremos una de las pistas que encontramos sobre el lugar del asesianto: " + gameAssassin.getRoomClue());
                        }
                    }
                }
            if (lives!=0){
                playerWon();
                System.out.println("GANASTE");
            } else{
                playerLost();
                System.out.println("Perdiste :(");
            }

            givenCluesControl=0;

    }   
                           
    /**
     * This method prints the array for the finalGameStage method.
     * @param array
     */
    public static void printArray(String[] array){
        byte control=1;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" (" +control+")");
            control++;
        }   
    }

    /**
     * This method contains all the questions and answers of the assassin challenge.
     * @param input Allows the player to write.
     * @param isValidInput Checks if the player typed a valid input.
     * @param someoneHasDied Checks if someone has died.
     * @return
     */
    public static boolean assassinQuestions(Scanner input, boolean isValidInput, boolean someoneHasDied,byte decision){
        boolean isSameNumber=true;
        boolean isDone=false;
        String [] questions=new String[]{
            "\nDe que fue la epidemia que sufrio Estrasburgo en 1518?", //1
            "\nCual de las siguientes personas tuvo mucha influecia en la segunda guerra mundial?", //2
            "\nCual de las siguientes ciudades fue destruida por una bomba nuclear en Japon?", //3
            "\nCual de las siguientes afirmaciones de Maria Antonieta es verdadera?", //4
            "\nPara que se utilizaban las flores en la edad media? ", //5
            "\nEn la edad media, quienes recibian el apellido blanco?", //6
            "\nCual era la prueba para saber si una mujer era bruja?", //7
            "\nCual era el origen de la enfermedad del sombrerero loco?",//8
            "\nCual era un problema ocasionado por las pelucas para mujeres en el siglo  XVII?",
        };
        String [] answers=new String[]{
      /*  1*/"\nDe monos  voladores (1)\nDe diarrea y gripe (2)\nDe baile (3)\nDe lluvias de insectos que destruian las cosechas (4)\nDe alienigenas ancentrales (5)",
      /*  2*/"\nAdolf Hitler (1)\nOsama Bin Laden (2)\nDonald Trump (3)\nKim Jong Un (4)\nEllen Degeneres (5)",
      /*  3*/"\nNiko ni Noko (1)\nHiroshima (2)\nAkai Tako (3)\nKawaii Desu (4)\nShingeki no Kyojin (5)",
      /*  4*/"\nLe gustaba practicar brujeria en la edad media T(1)\nLe gustaba preparar pie de queso(2)\nPonia harina en sus pelucas(3)"+
             "\nCreia que comer rocas era saludable (4)\nLe gustaba bailar desnuda a mitad de la calle todos los martes a las tres de la tarde (5)",
      /*  5*/"\nPara crear pociones (1)\nPara decorar la vestimenta (2)\nPara reducir el mal olor (3)\nPara darle una a los caballeros cuando estos pasaran al lado (4)"+
             "\nPara llevar como muestra de buenas intenciones al visitar a alguien por primera vez (5)",
      /*  6*/"\nPersonas de la realeza (1)\nTodo hijo del tercer nieto (2)\nHuerfanos cuyos padres no se conocian (3)\nLadrones que se habian arrepentido y vuelto nobles (4)"+
             "\nToda persona cuyos actos bondadodos dieran la impresion de ser cometidos por un santo (5)",
      /*  7*/"\nInvocaban al diablo y si la saludaba de besito era bruja (1)\nLe prendian fuego a su casa, si la casa no se quemaba, era bruja (2)"+
             "\nAtaban sus pies y la lanzaban a un rio, si flotaba era bruja y la quemaban, si no , moria y por lo tanto no era bruja (3)"+
             "\nLe tiraban sal a los ojos, si de estos salian lagrimas, era una bruja (4)"+
             "\nLa tiraban de un acantilado, si sobrevivia era bruja y la quemaban, si moria, no era bruja y por lo tanto era perdonada. (5)",
      /*  8*/"\nEl trauma de haber visto morir a todos los que amaba por culpa de la reina roja (1),\n" + "Un golpe que recibio en la cabeza de adolescente (2) " +
             "\nTener que trabajar hasta muy tarde todos los dias comiendo mal (3)\nTrabajar con quimicos muy peligrosos sin proteccion que eran malos para la salud (4)"+
             "\nComer aranas y serpientes sin desinfectarlas de primero (5)",
      /*  9*/"\nCada vez que se la querian quitar debian raparse (1)\nCuando habia mucho calor se prendian en fuego (2)\nA veces pajaros las confundian con comida (3)"+
             "\nNo servian para guardar comida (4)\nAl ser muy grandes les daban dolor de cuello y de cabeza (5)",
        };
        int questionsControl=questions.length;
        Random rand=new Random();

            while (true){
                int arrayControl=rand.nextInt(7); //cambiar por una variable
                isDone=assassinChallenge(questions, answers, input,isValidInput,rand,arrayControl,questionsControl,decision);
                if (isDone){
                    return true;
                }else{
                    return false;
                }
                

            }            
           
    }

    
    /**
     * This method is the assassin challenge. If player wins, a clue is given, if not, the player is killed and the game ends.
     * @param questions Gets all the possible questions.
     * @param answers Gets all the answers for each question.
     * @param input Lets the user write his input.
     * @param isValidInput Checks if the input is a valid input.
     * @param rand This is the random generator for each question.
     * @param arrayControl Is the int that gets the random number generated with rand
     * @param questionsControl This is the int that has the maximum number of questions, so rand can generate a number that's allowed.
     * @return 
     */
    public static boolean assassinChallenge(String[] questions,String[] answers,Scanner input,boolean isValidInput,Random rand,
                                            int arrayControl, int questionsControl,byte decision){
        System.out.println(questions[arrayControl] + "\n" + answers[arrayControl]);
        byte control=6;
        int bullet=rand.nextInt(control);
        int shoot;
        boolean someoneHasDied=false;
        do{     

                decision=isValidInputAssassinChallenge(input, isValidInput);
                
    
                switch (arrayControl){
                    case 0:
                            
                            if (decision!=3){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==3){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;

                    case 1:
                            
                            if (decision!=1){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==1){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                    case 2:

                    
                            if (decision!=2){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==2){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                    case 3:

                            
                            if (decision!=3){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==3){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                    case 4:

                    
                            if (decision!=3){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==3){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                    case 5:
                            
                            if (decision!=3){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==3){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                    case 6: 
                            if (decision!=3){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==3){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                    case 7:
                            if (decision!=4){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==4){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;
                            
                    case 8:
                            if (decision!=5){
                                someoneHasDied=aimPlayer(rand,bullet,control);
                                if (someoneHasDied){
                                    return true;
                                }else{
                                    control--;
                                    bullet=rand.nextInt(control);
                                }
                                
                            }else if (decision==5){
                                someoneHasDied=aimFriend(rand,bullet,control);
                                if (someoneHasDied){
                                    return false;
                                }else {
                                    control--;
                                    bullet=rand.nextInt(control);
                                    arrayControl=rand.nextInt(questionsControl);
                                    System.out.println(questions[arrayControl]+"\n"+answers[arrayControl]);
                                }

                            }
                            
                            break;

                    default:
                            System.out.println("Ingrese una opcion valida");
                }
        }while (someoneHasDied==false);
        
        return false;
        
    }

    /**
     * If the player chooses a wrong answer for a question, this method is called, which has a random chance of killing the player.
     * @param rand It's the randomizer.
     * @param bullet Rand chooses a random number between 0 and 5, and bullet stores that value, which is the number of the catridge that has the bullet.
     * @param control Lowers maximum random number each time aim player or aim Friend method is called, which results in a maximum of 6 turns for each assassin challenge.
     * @return
     */
    public static boolean aimPlayer(Random rand, int bullet,byte control){
        System.out.println("Te apunta con la pistola y aprieta el gatillo...");
        int shoot=rand.nextInt(control);
        if (shoot==bullet){
            gunFiresBullet();
            System.out.println("Todo se empieza a mover en camara lenta, empezas a sentir que tu cuerpo cae y lentamente todo se vuelve negro.");
            return true;
        }else{
            gunFiresNoBullet();
            System.out.println("\"La respuesta es incorrecta, pero no salio la bala. Volvelo a intentar.\"");
            return false;
        }
    }

    /**
    * If the player chooses the right answer for a question, this method is called, which has a random chance of killing player's foe.
     * @param rand It's the randomizer.
     * @param bullet Rand chooses a random number between 0 and 5, and bullet stores that value, which is the number of the catridge that has the bullet.
     * @param control Lowers maximum random number each time aim player or aim Friend method is called, which results in a maximum of 6 turns for each assassin challenge.
     * @return
     */
    public static boolean aimFriend(Random rand,int bullet, byte control){
        System.out.println("Se apunta a la cabeza y aprieta el gatillo.\n");
        int shoot=rand.nextInt(control);
        if (shoot==bullet){
            gunFiresBullet();
            System.out.println("*BOOM* La pistola dispara y de ella sale una bala."); 
            return true;
        }else{
            gunFiresNoBullet();
            System.out.println("No paso nada.\n\"Creo es que es momento de cambiar la pregunta\"");
            return false;
        }
    }


    
    /**
     * This method changes difficulty
     * @param input It's user input.
     * @param decision defines which difficulty is going to be applied.
     * @param validInput checks if user input is a valid data type.
     * @return returns true or false. False= easy difficulty, True= hard difficulty.
     */
    public static boolean changeDifficulty(Scanner input, byte decision,boolean validInput){
        validInput=false;
        System.out.println("El juego consta de dos dificultades, facil y dificil. Si se escoge tener la dificultad en facil, se tendran tres intentos para adivinar" +
                           " quien es el asesino, que arma utilizo y en donde fue asesinada la hermana del protagonista.\nSi se escoge la dificultad dificil," +
                           " solo se tendra una oportunidad. Ingrese el numero de la dificultad que usted desea para el juego.\nFacil (1)\nDificil (2)");
        do{                  
                decision=isValidInput(input, validInput);
                switch (decision){
                    case 1:
                            System.out.println("Dificultad: \"facil\"");
                            return false;
                    case 2:
                            System.out.println("Dificultad: \"dificil\"");
                            return true;
                }
        }while (validInput==false);

        return false;
    }

    public static byte isValidInput(Scanner input,boolean isValidInput){
        do{ 
            isValidInput=input.hasNextByte(); //Es para evitar que se ingrese un dato erroneo por accidente(por ejemplo una K) y crashee el programa.
            if(isValidInput){
                return input.nextByte();
            }else{
                input.next();
            }
        }while (isValidInput=false);
            return -1;
    }

    public static byte isValidInputAssassinChallenge(Scanner input,boolean isValidInput){
        String valor;
        do{ 
            isValidInput=input.hasNextByte(); //Es para evitar que se ingrese un dato erroneo por accidente(por ejemplo una K) y crashee el programa.
            if(isValidInput){
                valor=input.nextByte();
                switch(valor){
                    case 1:
                            return 1;
                    case 2:
                            return 2;
                    case 3:
                            return 3;
                    case 4:
                            return 4;
                    case 5:
                            return 5;
                    default:
                            System.out.println("Ingrese un dato valido");
                }
            }else{
                input.next();
            }
        }while (isValidInput=false);
            return -1;
    }
  

    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        byte decision;
        boolean isValidInput=false, marketClue=false, conventClue=false, forestClue=false,validInput=false,forestAssassinClue=false,
                conventAssassinClue=false,marketAssassinClue=false,isHard=false,someoneHasDied=false;
            System.out.println("Bienvenido/a clue. El juego en el cual usted debe averiguar quien mato a su hermana, con que arma y en donde."+
                               "\nPara empezar a jugar ingrese el numero 1" +
                               "\nPara cambiar la dificultad ingrese el numero 2" +
                               "\nPara leer las instrucciones ingrese el numero 3" +
                               "\nPara salir del juego ingrese el numero 4");
            while (true){
                    decision=isValidInput(input, isValidInput);
                        switch (decision){
                                case 1: //El jugador comenzara el juego.
                                        mainGame(marketClue, conventClue, forestClue, forestAssassinClue, marketAssassinClue, conventAssassinClue,
                                                isHard, someoneHasDied);
                                        System.out.println( "\nPara empezar una nueva partida ingrese el numero 1." +
                                                            "\nPara cambiar la dificultad ingrese el numero 2" +
                                                            "\nPara leer las instrucciones ingrese el numero 3" +
                                                            "\nPara salir del juego ingrese el numero 4");
                                        break;
                                case 2: //El jugador cambiara la dificultad
                                        isHard=changeDifficulty(input, decision, validInput);
                                        System.out.println("\nPara empezar una nueva partida ingrese el numero 1." +
                                                        "\nPara continuar desde el ultimo punto de guardado ingrese el numero 2" +
                                                        "\nPara leer las instrucciones ingrese el numero 3" +
                                                        "\nPara salir del juego ingrese el numero 4");
                                        break;
                                case 3: //El jugador podra leer las instrucciones.

                                        break;
                                case 4:
                                        System.exit(0);
                                default:
                                        System.out.println("Ingrese una opcion valida");
                            givenCluesControl=0;
                        }
      
                
                }
    }    
    
    
}

