import java.util.ArrayList;
import java.util.Scanner;
public class App
{

    public static void main(String[]args)
    {
        stats yogStat = new stats(900,100,50,150);
        stats cthulhuStat = new stats(1000,90,70,140);
        stats azathothStat = new stats(1500,110,40,170);

        stats rickStat = new stats(750,60,90,100);
        stats derpStat = new stats(650,100,110,80);
        stats godzillaStat = new stats(950, 100, 100, 130);

        stats odinStat = new stats(900,80,70,50);
        stats lokiStat = new stats(800, 90, 80,60);
        stats thorStat = new stats(850,100,85,40);

        stats anubisStat = new stats (750,130,95,80);
        stats raStat = new stats (650,120,105,70);
        stats horusStat = new stats (700,115,100,85);

        stats zeusStat = new stats (900,90,115,100);
        stats posidionStat = new stats (1000,85,95,95);
        stats hadesStat = new stats (850,100,120,90);

        move yogMove1= new move("Eldritch Grasp",150,80);
        move yogMove2 = new move("Unfathomable Presence",180,60);
        move yogMove3 = new move("Chaos Rift",120,100);

        ArrayList<move> yogMoveset = legends.addMoveToMoveset(yogMove1,yogMove2, yogMove3);

        move cthulhuMove1 = new move("Abyssal Awakening", 130, 100);
        move cthulhuMove2 = new move("Call of the Deep");
        move cthulhuMove3 = new move("R’lyehian Resurgence");
        
        ArrayList<move> cthMoveset = legends.addMoveToMoveset(cthulhuMove1,cthulhuMove2, cthulhuMove3);

        move azathothMove1 = new move("Nihilistic Pulse",260,20);
        move azathothMove2 = new move("Slumbering Malevolence",140, 70);
        move azathothMove3 = new move("h' zhro geb",1);

        ArrayList<move> azaMoveset = legends.addMoveToMoveset(azathothMove1,azathothMove2, azathothMove3);

        move rickMove1 = new move("Rickroll Surprise",90,100);
        move rickMove2 = new move("Rick’s Redemption");
        move rickMove3 = new move("Melodic Encore");

        ArrayList<move> rickMoveset = legends.addMoveToMoveset(rickMove1,rickMove2,rickMove3);

        move derpMove1 = new move("Derpy Pouce",90,100);
        move derpMove2 = new move("Derpocalypse ",100);
        move derpMove3 = new move("Whimsical Charm");

        ArrayList<move> derpMoveset = legends.addMoveToMoveset(derpMove1,derpMove2,derpMove3);
        
        move godzillaMove1 = new move("Atomic Breath",100,90);
        move godzillaMove2 = new move("Nuclear Regeneration");
        move godzillaMove3 = new move("Vengeful Retaliation");

        ArrayList<move> godzillaMoveset = legends.addMoveToMoveset(godzillaMove1,godzillaMove2,godzillaMove3);

        move odinMove1 = new move("Hugin and Munin");
        move odinMove2 = new move("Allfather Strike",120,80);
        move odinMove3 = new move("Insight");

        ArrayList<move> odinMoveset = legends.addMoveToMoveset(odinMove1,odinMove2,odinMove3);

        move lokiMove1 = new move("Shape Shift");
        move lokiMove2 = new move("Illusionary Strike",100,90);
        move lokiMove3 = new move("Mirror Image");
        
        ArrayList<move> lokiMoveset = legends.addMoveToMoveset(lokiMove1, lokiMove2, lokiMove3);

        move thorMove1 = new move("Mjolnir's Strike",90,100);
        move thorMove2 = new move("Lighting bolt",110,80);
        move thorMove3 = new move("Call of Lighting");
        ArrayList<move> thorMoveset = legends.addMoveToMoveset(thorMove1, thorMove2, thorMove3);
        
        move anubisMove1 = new move("Soul Drain",100,70);
        move anubisMove2 = new move("Pharaoh's Tomb",70,90);
        move anubisMove3 = new move("Underworld Summon");

        ArrayList<move> anubisMoveset = legends.addMoveToMoveset(anubisMove1, anubisMove2, anubisMove3);
        move raMove1 = new move("Flash");
        move raMove2 = new move("Lightspeed");
        move raMove3 = new move("Sunshine",160,70);

        ArrayList<move> raMoveset = legends.addMoveToMoveset(raMove1, raMove2, raMove3);

        move horusMove1 = new move("Falcon Strike",80,100);
        move horusMove2 = new move("Divine Healing");
        move horusMove3 = new move("Pharaoh's Judgement",200,80);

        ArrayList<move> horusMoveset = legends.addMoveToMoveset(horusMove1, horusMove2, horusMove3);

        move zeusMove1 = new move("ThunderBolt",80,100);
        move zeusMove2 = new move("ThunderStorm",140,70);
        move zeusMove3 = new move("Typhoon",100,90);

        ArrayList<move> zeusMoveset = legends.addMoveToMoveset(zeusMove1, zeusMove2, zeusMove3);

        move poseidonMove1 = new move("Flood",100,80);
        move poseidonMove2 = new move("Regenerate");
        move poseidonMove3 = new move("Trident Throw",70,100);

        ArrayList<move> poseidonMoveset = legends.addMoveToMoveset(poseidonMove1, poseidonMove2, poseidonMove3);

        move hadesMove1 = new move("Invisinility");
        move hadesMove2 = new move("Soul Absorb",80,100);
        move hadesMove3 = new move("Reckless Attack",170,50);
        
        ArrayList<move> hadesMoveset = legends.addMoveToMoveset(hadesMove1, hadesMove2, hadesMove3);
        
        ArrayList<legends> characterList = new ArrayList<legends>();

        legends yog = new legends("Yog-Sothoth","Cosmic entitiy who trasends space and time",yogMoveset,yogStat,"Outer");

        characterList.add(yog);

        legends chthulhu = new legends("Cthulhu","Colossal ancient god lying dormant in the sea waiting for someone to wake him",cthMoveset,cthulhuStat,"Outer");

        characterList.add(chthulhu);

        legends azathoth = new legends("Azathoth","Chaotic deity know as the blind god existing at the center of the cosmos",azaMoveset,azathothStat,"Outer");

        characterList.add(azathoth);

        legends rick = new legends("Rick Asley","Never gonna give you up never gonna let you down never gonna run around and desert you",rickMoveset,rickStat,"Meme");

        characterList.add(rick);

        legends cat = new legends("Derp Cat","nyanynaynaynaynaynayna",derpMoveset,derpStat,"Meme");

        characterList.add(cat);

        legends godzilla = new legends("Godzilla","King of the monster",godzillaMoveset,godzillaStat,"Meme");

        characterList.add(godzilla);

        legends odin = new legends("Odin","God of wisdom war and death the Allfather",odinMoveset,odinStat,"Norse");

        characterList.add(odin);

        legends loki = new legends("Loki","God of mischief who knows what he might do?",lokiMoveset,lokiStat,"Norse");

        characterList.add(loki);

        legends thor = new legends("Thor","God of thunder and also a powerful warrior",thorMoveset,thorStat,"Norse");

        characterList.add(thor);

        legends anubis = new legends("Anubis","God of the after life is your heart lighter then a feather?",anubisMoveset,anubisStat,"Egyptian");

        characterList.add(anubis);

        legends ra = new legends("Ra","God of the sun and creator of all life supreme leader of the Eygiptian gods",raMoveset,raStat,"Egyptian");

        characterList.add(ra);

        legends horus = new legends("Horus","God of the sky ruler of the pharaohs",horusMoveset,horusStat,"Egyptian");
        
        characterList.add(horus);

        legends zeus = new legends("Zeus","King of gods and ruler of Olympus",zeusMoveset,zeusStat,"Olympus");

        characterList.add(zeus);

        legends poseidon = new legends("Poseidon","God of the sea owner of atlantis",poseidonMoveset,posidionStat,"Olympus");

        characterList.add(poseidon);

        legends hades = new legends("Hades","God of the underworld owner of the domain of the dead",hadesMoveset,hadesStat,"Olympus");

        characterList.add(hades);

        Player player1 = new Player();
        Player player2 = new Player();



        

        

        System.out.println("Player 1 choose legends:");
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your first legend: ");
        legends temp = checkSwap(characterList);
        player1.setCharacter(0,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your second legend: ");
        temp = checkSwap(characterList);
        player1.setCharacter(1,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your third legend: ");
        temp = checkSwap(characterList);
        player1.setCharacter(2,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("These are your three selected legends:");
        System.out.print(player1.toString());

        System.out.println();
        System.out.println();

        System.out.println("Player 2 choose legends: ");
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your first legend: ");
        temp = checkSwap(characterList);
        player2.setCharacter(0,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your second legend: ");
        temp = checkSwap(characterList);
        player2.setCharacter(1,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();


        System.out.print("Choose your third legend: ");
        temp = checkSwap(characterList);
        player2.setCharacter(2,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println("These are your three selected legends:");
        System.out.print(player2.toString());

    }

    public static void showCharacterList(ArrayList<legends> characterList)
    {
        for(int i = 0 ;i<characterList.size();i++)
        {
            System.out.print(characterList.get(i).getName()+" ");
        }
    }

    public static void removeAlreadyPickedCharacterList(ArrayList<legends> characterList,legends legend)
    {
        for(int i = 0 ; i<characterList.size();i++)
        {
            if(legend==characterList.get(i))
            {
                characterList.remove(i);
            }
        }
    }

    //Improved Version
    public static legends checkSwap(ArrayList<legends> characterList)
    {
        Scanner input = new Scanner(System.in);
        String legend = input.nextLine();
        for(int i =0 ; i<characterList.size();i++)
        {
            if(legend.equals(characterList.get(i).getName()))
            {
                return characterList.get(i);
            }
        }
        return null;
   
    
    }

    public static attack(ArrayList<move> Moveset)
    {

        Scanner input = new Scanner(System.in);
        String Moveset = input.next();

        for(int i = 0 ; i < Moveset.getmoveName;i++)
        {
            



        }


    }


    System.out.print("Pick a move");
    Scanner input = new Scanner(System.in);
    String  


    

    














    // public static legends checkSwap(legends yog, legends chthulhu, legends azathoth, legends rick, legends cat, legends godzilla, legends odin, legends loki, legends thor, legends anubis, legends ra, legends horus, legends zeus, legends poseidon, legends hades)
    // {
    //     Scanner input = new Scanner (System.in);
    //     String legend = input.nextLine();
    //     if(legend.equals("Yog-Sothoth"))
    //     {
            
    //         return yog;
    //     }
    //     if(legend.equals("Chthulhu"))
    //     {
            
    //         return chthulhu;
    //     }
    //     if(legend.equals("Azathoth"))
    //     {
            
    //         return azathoth;
    //     }
    //     if(legend.equals("Rick Asley"))
    //     {
            
    //         return rick;
    //     }
    //     if(legend.equals("Derp Cat"))
    //     {
            
    //         return cat;
    //     }
    //     if(legend.equals("Godzilla"))
    //     {
            
    //         return godzilla;
    //     }
    //     if(legend.equals("Odin"))
    //     {
            
    //         return odin;
    //     }
    //     if(legend.equals("Loki"))
    //     {
            
    //         return loki;
    //     }
    //     if(legend.equals("Thor"))
    //     {
            
    //         return thor;
    //     }
    //     if(legend.equals("Anubis"))
    //     {
            
    //         return anubis;
    //     }
    //     if(legend.equals("Ra"))
    //     {
            
    //         return ra;
    //     }
    //     if(legend.equals("Horus"))
    //     {
            
    //         return horus;
    //     }
    //     if(legend.equals("Zeus"))
    //     {
            
    //         return zeus;
    //     }
    //     if(legend.equals("Poseidon"))
    //     {
            
    //         return poseidon;
    //     }
    //     if(legend.equals("Hades"))
    //     {
            
    //         return hades;
    //     }
        
    //     return null;
    // }
}