import java.util.Random;

public class Assassin
{
    private String name;
    private String weapon;
    private String room;
    private String assassinClue1;
    private String assassinClue2;
    private String assassinClue3;
    private String weaponClue1;
    private String weaponClue2;  
    private String weaponClue3;
    private String roomClue1;
    private String roomClue2;
    private String roomClue3;
    private String assassinQuestion1;
    private String assassinAnswer1;
    private String assassinWrong1;
    private String assassinQuestion2;
    private String assassinAnswer2;
    private String assassinWrong2;
    private String assassinQuestion3;
    private String assassinAnswer3;
    private String assassinWrong3;
    

    public  Assassin (){
        String[] names=new String[]{"Plague Doctor", "Der Krampus", "Jack the Ripper", "Madame de Brinvilliers", "Anne Boleyn", "Manuel Blanco Romasanta"};
        String[] weapons=new String[] {"Pistola", "Cuchillo","Veneno","Magia","Tortura","Fuego"};
        String[] rooms=new String[]{"plaza del mercado","monasterio", "bosque", "cementerio","plaza central","lago del bosque","catacumbas"};
        
        Random arrayControl=new Random();
        int randomDecision= arrayControl.nextInt(6);//crea un numero aleatorio para definir el asesino en base al numero del arreglo 
            this.name=names[randomDecision];
            setAssassinClues(randomDecision); 
        randomDecision=arrayControl.nextInt(6); //crea un numero aleatorio para definir el arma homicida en base al numero del arreglo 
            this.weapon=weapons[randomDecision];
            setWeaponClues(randomDecision);
        randomDecision=arrayControl.nextInt(7);//crea un numero aleatorio para definir el lugar del asesinato en base al numero del arreglo 
            this.room=rooms[randomDecision];
            setRoomClues(randomDecision);

    }

    /**
     * This method returns the name of the assassin.
     * @return name the name of the assassin
     */
    public String getName(){ //Da como String el nombre del asesino
        return this.name;
    }

    /**
     * This method returns the name of the weapon used to kill the victim.
     * @return
     */
    public String getWeapon(){ //Da como String el arma homicida
        return this.weapon;
    }

    /**
     * This method returns the name of the place where the victim was murdered.
     * @return
     */
    public String getRoom(){ 
        return this.room;
    }

    /**
     * This method gives a random clue related to 
     * @return
     */
    public String getAssassinClue(){ 
    
        Random rand=new Random();
        int giveAssassinClue=rand.nextInt(3);
        switch(giveAssassinClue)
        {
            case 0:
                    return this.assassinClue1;
            case 1:
                    return this.assassinClue2;
            case 2:
                    return this.assassinClue3;  
        }
        return "polvo";
    }

    /**
     * This method returns a random clue about what weapon was used to kill the victim.
     * @return
     */
    public String getWeaponClue(){  
    
        Random rand=new Random();
        int giveWeaponClue=rand.nextInt(3);
        switch(giveWeaponClue){
                case 0:
                        return this.weaponClue1;
                case 1:
                        return this.weaponClue2;
                case 2: 
                        return this.weaponClue3;
            }
            return "polvo";
    }

    /**
     * This method returns a random clue about where was the victim murdered.
     * @return
     */
    public String getRoomClue(){
        Random rand=new Random();
        int giveRoomClue=rand.nextInt(3);
                switch (giveRoomClue){
                        case 0: 
                                return this.roomClue1;
                        case 1:
                                return this.roomClue2;
                        case 2:
                                return this.roomClue3;
                                
                }
                return "tu hermana dice hola";
        
    }
    

    /**
     * This method sets assassin clues.
     * @param number gets the number of the assassin.
     */
    private void setAssassinClues (int number) {
        switch(number)
        {
            case 0: //Plague Doctor
                    this.assassinClue1=("sanguijuelas");
                    this.assassinClue2=("monedas");
                    this.assassinClue3=("baston");
                    break;
            case 1: //Der Krampus
                    this.assassinClue1=("zapatos");
                    this.assassinClue2=("pelo de cabra");
                    this.assassinClue3=("una bolsa grande");
                    break;
            case 2://Jack the Ripper
                    this.assassinClue1=("daga");
                    this.assassinClue2=("mapa");
                    this.assassinClue3=("periodico");
                    break;
            case 3: // Madame de Brinvilliers
                    this.assassinClue1=("veneno");
                    this.assassinClue2=("cuero rojo");
                    this.assassinClue3=("salpicaduras de agua");
                    break;
            case 4://Anne Boleyn
                    this.assassinClue1=("libro de magia negra");
                    this.assassinClue2=("velas negras");
                    this.assassinClue3=("sangre de cabra");
                    break;
            case 5://Manuel Blanco Romasanta
                    this.assassinClue1=("burbujas de jabon");
                    this.assassinClue2=("babeo");
                    this.assassinClue3=("garras");
                    break;
        }
    }


    /**
     * This method defines the clues for the weapon used to kill player's sister.
     * @param number gets the number of the weapon used to kill the victim.
     */
    private void setWeaponClues(int number) {
        switch(number)
        {
            case 0: //Pistola
                    this.weaponClue1="polvora";
                    this.weaponClue2="cartuchos";
                    this.weaponClue3="silenciador";
                    break;
            case 1: //Cuchillo
                    this.weaponClue1="piedra para afilar";
                    this.weaponClue2="toalla llena de sangre";
                    this.weaponClue3="pedazo de metal";
                    break;
            case 2: //Veneno
                    this.weaponClue1="frasco vacio";
                    this.weaponClue2="gotas de una sustancia desconocida";
                    this.weaponClue3="comida en mal estado";
                    break;
            case 3: //Magia
                    this.weaponClue1="tiza";
                    this.weaponClue2="pergamino con nombres escritos";
                    this.weaponClue3="cabello";
                    break;
            case 4: //Tortura
                    this.weaponClue1="cuerdas";
                    this.weaponClue2="martillo";
                    this.weaponClue3="tijera";
                    break;
            case 5: //Fuego
                    this.weaponClue1="madera quemada";
                    this.weaponClue2="fosforos";
                    this.weaponClue3="cuerdas quemadas";
                    break;
        }


    }


    /**
     * This method defines the clues for the room where player's sister was murdered.
     * @param number gets the number of the room.
     */
    private void setRoomClues(int number) {
        switch(number)
        {
            case 0://plaza del mercado
                    this.roomClue1="peniques";
                    this.roomClue2="frescas";
                    this.roomClue3="nuevo";
                    break;
            case 1://monasterio
                    this.roomClue1="cantus";
                    this.roomClue2="eterna";
                    this.roomClue3="prior";
                    break;
            case 2://bosque
                    this.roomClue1="alto";
                    this.roomClue2="verde";
                    this.roomClue3="robusto";
                    break;
            case 3://cementerio
                    this.roomClue1="flores";
                    this.roomClue2="paz";
                    this.roomClue3="silencio";
                    break;
            case 4://plaza central
                    this.roomClue1="vivo";
                    this.roomClue2="colorido";
                    this.roomClue3="hermoso";
                    break;
            case 5://lago del bosque
                    this.roomClue1="luna";
                    this.roomClue2="sobre";
                    this.roomClue3="brisa";
                    break;
            case 6://catacumbas
                    this.roomClue1="oscuro";
                    this.roomClue2="frio";
                    this.roomClue3="descanso";
                    break;
        }
    }

    private void setAssassinQuestionsandAnswers(){
        String [] questions=new String[]{
                "\nDe que fue la epidemia que sufrio Estrasburgo en 1518?",
                "\nCual de las siguientes personas tuvo mucha influecia en la segunda guerra mundial?",
                "\nCual de las siguientes ciudades fue destruida por una bomba nuclear en Japon?"
         };
        String [] answers=new String[]{
                "\nDe monos  voladores (1)\nDe diarrea y gripe (2)\nDe baile (3)\nLluvia de insectos que destruian las cosechas (4)\nAlienigenas y reptilianos (5)",
                 "\nAdolf Hitler (1)\nOsama Bin Laden (2)\nDonald Trump (3)\n Kim Jong Un (4)\nEllen Degeneres (5)",
                 "\nNiko ni Noko (1)\nFukushima (2)\nAkai Tako (3)\nKawaii Desu (4)\nShingeki no Kyojin (5)"
        };
    }
}