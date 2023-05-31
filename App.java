import java.util.ArrayList;
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
        stats posidienStat = new stats (1000,85,95,95);
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
        
    }   
}