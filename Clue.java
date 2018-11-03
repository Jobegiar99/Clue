import java.util.Arrays;
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
                                fromConventToLake,boolean marketAssassinClue,boolean isHard){                     
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
                                        marketAssassinClue=playMarket(marketClue, isValidInput, decision, gameAssassin,marketAssassinClue);
                                        if (marketAssassinClue==false){
                    
                                        } else if (marketAssassinClue){
                                            System.out.println("Game over");
                                        }
                                }else {
                                        isValidInput=false;
                                        decision=0;
                                        marketClue=playMarket(marketClue, isValidInput, decision, gameAssassin,marketAssassinClue);
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
     * This method is market gameplay.
     * @param marketClue Checks if market clue has been given, if it does, an assassin challenge is given.
     * @param isValidInput Checks if user input is valid.
     * @param decision Let's the program know what does the player wants to do.
     * @param gameAssassin lets playMarket method access Assassin class methods.
     * @return
     */
    public static boolean playMarket(boolean marketClue,boolean isValidInput,byte decision, Assassin gameAssassin,boolean marketAssassinClue){ 
        Scanner input=new Scanner(System.in);
        isValidInput=false;
        if (marketClue){
            if (marketAssassinClue==false){
            System.out.println("Decidiste volver al mercado para seguir investigando ya que te parecio sospechoso un local. Cuando estas a punto "+
                               "de llegar, escuchas pasos, por lo que te escondes.\n Una voz te advierte que ya sabe que estas ahi, por lo que "+
                               "te recomienda salir antes de que el vaya por vos.\nAl salir te das cuenta de que es un viejo amigo, lo cual te alegra." +
                               "\nCuando estas a punto de saludarlo, te dice que sabe que estas buscando pistas sobre el asesino de tu hermana,"+
                               " y que, debido a que la seguridad de su hermano esta en riesgo, debera detenerte a toda costa." +
                               "\n\"Mi hermano fue secuestrada por el asesino, si no quiero que lo mate tendras que enfrentarte a mi\"" +
                               "\nDicho esto, tu amigo saco una pistola." +
                               "\n\"Jugaremos ruleta rusa. Cuando contestes una pregunta, te apuntare y apretare el gatillo si es incorrecta la respuesta."+
                               "Si la respuesta es correcta, me apuntare a mi. La pregunta sera la misma hasta que te mate por intentos fallidos o cambiara si"+
                               " la respuesta es correcta y no muero.\"" );
            }else if (marketAssassinClue){
                System.out.println("Consideras ir al mercado, pero como ya has ido dos veces preferis ir a otro lado");
                return true;

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
                        case 1: //Investigate a local
                                System.out.println("Un local que tiene todo desordenado, como si alguien hubiese estado buscando algo de forma " +
                                                   "desesperada te llama la atencion.\nTe acercas y te das cuenta de que hay " + gameAssassin.getAssassinClue()
                                                   + " lo cual no tiene relacion alguna con lo que se vende en ese lugar.\nLo guardas por si pudiera servirte como una" +
                                                   "pista.\n \n Al dejar el local escuchas pasos, y por seguridad decidis volver al centro de la aldea para " +
                                                   "seguir buscando en otro lugar.");
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



    public static boolean assassinChallenge(Scanner input, boolean isValidInput){
        String [] questions=new String[]{
            "\nDe que fue la epidemia que sufrio Estrasburgo en 1518?", //1
            "\nCual de las siguientes personas tuvo mucha influecia en la segunda guerra mundial?", //2
            "\nCual de las siguientes ciudades fue destruida por una bomba nuclear en Japon?", //3
            "\nCual de las siguientes afirmaciones de Maria Antonieta es verdadera?", //4
            "\nPara que se utilizaban las flores en la edad media? ", //5
            "\nEn la edad media, quienes recibian el apellido blanco?", //6
            "\nCual era la prueba para saber si una mujer era bruja?" //7
        };
        String [] answers=new String[]{
      /*  1*/"\nDe monos  voladores (1)\nDe diarrea y gripe (2)\nDe baile (3)\nDe lluvias de insectos que destruian las cosechas (4)\nDe alienigenas ancentrales (5)",
      /*  2*/"\nAdolf Hitler (1)\nOsama Bin Laden (2)\nDonald Trump (3)\nKim Jong Un (4)\nEllen Degeneres (5)",
      /*  3*/"\nNiko ni Noko (1)\nFukushima (2)\nAkai Tako (3)\nKawaii Desu (4)\nShingeki no Kyojin (5)",
      /*  4*/"\nLe gustaba practicar brujeria en la edad media (1)\nLe gustaba preparar pie de queso(2)\nPonia harina en sus pelucas(3)"+
             "\nCreia que comer rocas era saludable (4)\nLe gustaba bailar desnuda a mitad de la calle todos los martes a las tres de la tarde (5)",
      /*  5*/"\nPara crear pociones (1)\nPara decorar la vestimenta (2)\nPara reducir el mal olor (3)\nPara darle una a los caballeros cuando estos pasaran al lado (4)"+
             "\nPara llevar como muestra de buenas intenciones al visitar a alguien por primera vez (5)",
      /*  6*/"\nPersonas de la realeza (1)\nTodo hijo del tercer nieto (2)\nHuerfanos cuyos padres no se conocian (3)\nLadrones que se habian arrepentido y vuelto nobles (4)"+
             "\nToda persona cuyos actos bondadodos dieran la impresion de ser cometidos por un santo (5)",
      /*  7*/"\nInvocaban al diablo y si la saludaba de besito era bruja (1)\nLe prendian fuego a su casa, si la casa no se quemaba, era bruja (2)"+
             "\nAtaban sus pies y la lanzaban a un rio, si flotaba era bruja y la quemaban, si no , moria y por lo tanto no era bruja (3)"+
             "\nLe tiraban sal a los ojos, si de estos salian lagrimas, era una bruja (4)"+
             "\nLa tiraban de un acantilado, si sobrevivia era bruja y la quemaban, si moria, no era bruja y por lo tanto era perdonada. (5)"

        };

        System.out.println(questions[3]);
        System.out.println(answers[3]);
        return true;

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
            validInput=input.hasNextByte();
            if (validInput){
                decision=input.nextByte();
                switch (decision){
                    case 1:
                            System.out.println("Dificultad: \"facil\"");
                            return false;
                    case 2:
                            System.out.println("Dificultad: \"dificil\"");
                            return true;
                }
            } else{
                System.out.println("Ingrese un dato valido");
            }
        }while (validInput==false);

        return false;
    }
  

    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        byte decision;
        boolean isValidInput=false, marketClue=false, conventClue=false, forestClue=false,validInput=false,fromDeerToWait=false,fromMarketExploretoForest=false,
                fromConventToLake=false,marketAssassinClue=false,isHard=false;
            System.out.println("Bienvenido/a clue. El juego en el cual usted debe averiguar quien mato a su hermana, con que arma y en donde."+
                               "\nPara empezar a jugar ingrese el numero 1" +
                               "\nPara cambiar la dificultad ingrese el numero 2" +
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
                                mainGame(marketClue, conventClue, forestClue, fromDeerToWait, fromMarketExploretoForest, fromConventToLake,marketAssassinClue,isHard);
                                System.out.println( "\nPara empezar una nueva partida ingrese el numero 1." +
                                                    "\nPara continuar desde el ultimo punto de guardado ingrese el numero 2" +
                                                    "\nPara leer las instrucciones ingrese el numero 3" +
                                                    "\nPara salir del juego ingrese el numero 4");
                                break;
                        case 2: //El jugador cambiara la dificultad
                                isHard=changeDifficulty(input,decision,validInput);
                                System.out.println("\nPara empezar una nueva partida ingrese el numero 1." +
                                                   "\nPara continuar desde el ultimo punto de guardado ingrese el numero 2" +
                                                   "\nPara leer las instrucciones ingrese el numero 3" +
                                                   "\nPara salir del juego ingrese el numero 4");
                                break;
                        case 3: //El jugador podra leer las instrucciones.
                                assassinChallenge(input, isValidInput);
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