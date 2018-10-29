import java.util.Scanner;

public class Clue
{
    static boolean marketInvestigation=false;
    static boolean  fromForestToMaket=false;

    public static void mainGame() //Este metodo lleva el control del juego.
    {
        Scanner input=new Scanner(System.in);
        Assassin gameAssassin=new Assassin();
        byte decisionJuegoPrincipal=0;
        boolean marketClue=false, conventClue=false, forestClue=false,validInput=false,salirMainGame=false;
        String[] respuestaJugador=new String[3];
            System.out.println("Te encontras en la entrada de Orilon, la aldea en la que tu hermana fue asesinada." +
                               "\nLo ultimo que vos supiste de ella, es que recibio una carta de una persona desconocida, la cual la invitaba a un retiro espiritual." +
                               "\nDespues de una semana de haber asistido a tal evento, los policias te informaron que su cuerpo habia sido\n"+
                               "encontrado sin vida en la entrada de la aldea.\n"+
                               "Es por ello que decidiste tratar de averiguar quien es el culpable de tal asesinato, a media noche, "+
                               "cuando no hay nadie viendo o escuchando y probablemente el asesino ande suelto buscando a una nueva victima." +
                               "Te adentras en la aldea y lo primero que ves es la plaza central. Desde ese lugar te podes dirigir al"+
                               " mercado, el bosque y el monasterio. \nAntes de moverte escuchas pasos a la lejania. Sera el asesino?\n" +
                               "A donde queres ir?\nMercado (1)\nBosque (2)\nMonasterio (3)");
            do
            {
                validInput=false;
                do
                { 
                    validInput=input.hasNextByte();
                    if (validInput)
                    {
                        decisionJuegoPrincipal=input.nextByte();
                        switch(decisionJuegoPrincipal)
                        {
                            case 1: //Se va al mercado.
                                    goToMarket(marketClue);
                            case 2: //Se  va al bosque.
                            case 3: //Se va al monasterio.

                        }
                    } else
                    {
                        System.out.println("Dato no valido. Vuelva a intentarlo");
                    }
                }while (validInput==false);
            } while (salirMainGame==false);

    }

    public static void goToMarket(boolean marketClue)
    {
        if (marketClue) //Determina si ya se ha obtenido la pista del mercado, lo cual significa que sera un duelo contra el asistente del asesino.
        {   
            if (fromForestToMaket)
            {

            }
            else
            { 
            
            }
                               

        }
        else
        {
            System.out.println("Al llegar al mercado observas un monton de locales. Es el lugar ideal para buscar pistas! Si el asesino"+
            " estuvo por aca definitivamente tuvo que haber dejado algo. Que te gustaria hacer?"+
            "\nExplorar el lugar (1)\nInvestigar un local (2)\nEsperar a ver si aparece alguien(3)");
        }
    }

    public static void assassinChallenge()
    {

    }


    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        byte decision;
        boolean isValidNumber=false,isValidInput=false;

            System.out.println("Bienvenido/a clue. El juego en el cual usted debe averiguar quien mato a su mascota, con que arma y en donde."+
                               "\nPara empezar una nueva partida ingrese el numero 1." +
                               "\nPara continuar desde el ultimo punto de guardado ingrese el numero 2" +
                               "\nPara leer las instrucciones ingrese el numero 3" +
                               "\nPara salir del juego ingrese el numero 4");
            do
            {
                isValidInput=input.hasNextByte(); //Es para evitar que se ingrese un dato erroneo por accidente(por ejemplo una K) y crashee el programa.
                if(isValidInput)
                {   
                    decision=input.nextByte();
                    switch (decision)
                    {
                        case 1: //El jugador comenzara el juego.
                                mainGame();
                                break;
                        case 2: //El jugador continuara su partida.
                                break;
                        case 3: //El jugador podra leer las instrucciones.
                                break;
                        case 4:
                                System.exit(0);
                        default:
                                System.out.println("Ingrese una opcion valida");
                                isValidNumber=false;

                    }

                } else
                {
                    System.out.println("El dato ingresado no es correcto. Por favor vuelva a intentarlo");
                    input.next();
                }
            }while (isValidNumber==false);
            
            
    }

}