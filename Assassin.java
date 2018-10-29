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

    public  Assassin ()
    {
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

    public String getName()
    {
        return this.name;
    }

    public String getWeapon()
    {
        return this.weapon;
    }

    public String getRoom()
    {
        return this.room;
    }

    public String getAssassinClue()
    {
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

    private void setAssassinClues (int number)
    {
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

    private void setWeaponClues(int number)
    {
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

    private void setRoomClues(int number)
    {
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
     
}