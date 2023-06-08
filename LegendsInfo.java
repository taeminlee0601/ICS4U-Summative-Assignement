import java.io.File;
import java.util.ArrayList;

public class LegendsInfo {
    private ArrayList<Legends> characterList = new ArrayList<Legends>();
    
    public LegendsInfo() {
        Stats yogStat = new Stats(900,100,50,150);
        Stats cthulhuStat = new Stats(1000,90,70,140);
        Stats azathothStat = new Stats(1500,110,40,170);

        Stats rickStat = new Stats(750,60,90,100);
        Stats derpStat = new Stats(650,100,110,80);
        Stats godzillaStat = new Stats(950, 100, 100, 130);

        Stats odinStat = new Stats(900,80,70,50);
        Stats lokiStat = new Stats(800, 90, 80,60);
        Stats thorStat = new Stats(850,100,85,40);

        Stats anubisStat = new Stats (750,130,95,80);
        Stats raStat = new Stats (650,120,105,70);
        Stats horusStat = new Stats (700,115,100,85);

        Stats zeusStat = new Stats (900,90,115,100);
        Stats posidionStat = new Stats (1000,85,95,95);
        Stats hadesStat = new Stats (850,100,120,90);

        Move yogMove1= new Move("Eldritch Grasp",150,80);
        Move yogMove2 = new Move("Unfathomable Presence",180,60);
        Move yogMove3 = new Move("Chaos Rift",120,100);

        ArrayList<Move> yogMoveset = Move.addMoveToMoveset(yogMove1,yogMove2, yogMove3);

        Move cthulhuMove1 = new Move("Abyssal Awakening", 130, 100);
        Move cthulhuMove2 = new Move("Call of the Deep");
        Move cthulhuMove3 = new Move("R’lyehian Resurgence");
        
        ArrayList<Move> cthMoveset = Move.addMoveToMoveset(cthulhuMove1,cthulhuMove2, cthulhuMove3);

        Move azathothMove1 = new Move("Nihilistic Pulse",260,20);
        Move azathothMove2 = new Move("Slumbering Malevolence",140, 70);
        Move azathothMove3 = new Move("h' zhro geb",10000,1);

        ArrayList<Move> azaMoveset = Move.addMoveToMoveset(azathothMove1,azathothMove2, azathothMove3);

        Move rickMove1 = new Move("Rickroll Surprise",90,100);
        Move rickMove2 = new Move("Rick’s Redemption");
        Move rickMove3 = new Move("Melodic Encore");

        ArrayList<Move> rickMoveset = Move.addMoveToMoveset(rickMove1,rickMove2,rickMove3);

        Move derpMove1 = new Move("Derpy Pouce",90,100);
        Move derpMove2 = new Move("Derpocalypse ",100);
        Move derpMove3 = new Move("Whimsical Charm");

        ArrayList<Move> derpMoveset = Move.addMoveToMoveset(derpMove1,derpMove2,derpMove3);
        
        Move godzillaMove1 = new Move("Atomic Breath",100,90);
        Move godzillaMove2 = new Move("Nuclear Regeneration");
        Move godzillaMove3 = new Move("Vengeful Retaliation");

        ArrayList<Move> godzillaMoveset = Move.addMoveToMoveset(godzillaMove1,godzillaMove2,godzillaMove3);

        Move odinMove1 = new Move("Hugin and Munin");
        Move odinMove2 = new Move("Allfather Strike",120,80);
        Move odinMove3 = new Move("Insight");

        ArrayList<Move> odinMoveset = Move.addMoveToMoveset(odinMove1,odinMove2,odinMove3);

        Move lokiMove1 = new Move("Shape Shift");
        Move lokiMove2 = new Move("Illusionary Strike",100,90);
        Move lokiMove3 = new Move("Mirror Image");
        
        ArrayList<Move> lokiMoveset = Move.addMoveToMoveset(lokiMove1, lokiMove2, lokiMove3);

        Move thorMove1 = new Move("Mjolnir's Strike",90,100);
        Move thorMove2 = new Move("Lighting bolt",110,80);
        Move thorMove3 = new Move("Call of Lighting");
        ArrayList<Move> thorMoveset = Move.addMoveToMoveset(thorMove1, thorMove2, thorMove3);
        
        Move anubisMove1 = new Move("Soul Drain",100,70);
        Move anubisMove2 = new Move("Pharaoh's Tomb",70,90);
        Move anubisMove3 = new Move("Underworld Summon");

        ArrayList<Move> anubisMoveset = Move.addMoveToMoveset(anubisMove1, anubisMove2, anubisMove3);
        Move raMove1 = new Move("Flash");
        Move raMove2 = new Move("Lightspeed");
        Move raMove3 = new Move("Sunshine",160,70);

        ArrayList<Move> raMoveset = Move.addMoveToMoveset(raMove1, raMove2, raMove3);

        Move horusMove1 = new Move("Falcon Strike",80,100);
        Move horusMove2 = new Move("Divine Healing");
        Move horusMove3 = new Move("Pharaoh's Judgement",200,80);

        ArrayList<Move> horusMoveset = Move.addMoveToMoveset(horusMove1, horusMove2, horusMove3);

        Move zeusMove1 = new Move("ThunderBolt",80,100);
        Move zeusMove2 = new Move("ThunderStorm",140,70);
        Move zeusMove3 = new Move("Typhoon",100,90);

        ArrayList<Move> zeusMoveset = Move.addMoveToMoveset(zeusMove1, zeusMove2, zeusMove3);

        Move poseidonMove1 = new Move("Flood",100,80);
        Move poseidonMove2 = new Move("Regenerate");
        Move poseidonMove3 = new Move("Trident Throw",70,100);

        ArrayList<Move> poseidonMoveset = Move.addMoveToMoveset(poseidonMove1, poseidonMove2, poseidonMove3);

        Move hadesMove1 = new Move("Invisinility");
        Move hadesMove2 = new Move("Soul Absorb",80,100);
        Move hadesMove3 = new Move("Reckless Attack",170,50);
        
        ArrayList<Move> hadesMoveset = Move.addMoveToMoveset(hadesMove1, hadesMove2, hadesMove3);

        Legends yog = new Legends("Yog-Sothoth","Cosmic entitiy who trasends space and time",yogMoveset,yogStat,"Outer");
        yog.setImageFile(new File("assets/Characters/yog-sothoth.jpg"));
        
        characterList.add(yog);

        Legends cthulhu = new Legends("Cthulhu","Colossal ancient god lying dormant in the sea waiting for someone to wake him",cthMoveset,cthulhuStat,"Outer");
        cthulhu.setImageFile(new File("assets/Character/cthulhu.jpg"));
        
        characterList.add(cthulhu);

        Legends azathoth = new Legends("Azathoth","Chaotic deity know as the blind god existing at the center of the cosmos",azaMoveset,azathothStat,"Outer");
        azathoth.setImageFile(new File("assets/Characters/azathoth.jpg"));

        characterList.add(azathoth);

        Legends rick = new Legends("Rick Asley","Never gonna give you up never gonna let you down never gonna run around and desert you",rickMoveset,rickStat,"Meme");
        rick.setImageFile(new File("assets/Characters/rick.jpg"));

        characterList.add(rick);

        Legends cat = new Legends("Derp Cat","nyanynaynaynaynaynayna",derpMoveset,derpStat,"Meme");
        cat.setImageFile(new File("assets/Characters/derpcat.jpg"));

        characterList.add(cat);

        Legends godzilla = new Legends("Godzilla","King of the monster",godzillaMoveset,godzillaStat,"Meme");
        godzilla.setImageFile(new File("assets/Characters/godzilla.jpg"));

        characterList.add(godzilla);

        Legends odin = new Legends("Odin","God of wisdom war and death the Allfather",odinMoveset,odinStat,"Norse");
        odin.setImageFile(new File("assets/Characters/odin.jpg"));
        
        characterList.add(odin);

        Legends loki = new Legends("Loki","God of mischief who knows what he might do?",lokiMoveset,lokiStat,"Norse");
        loki.setImageFile(new File("assets/Characters/loki.jpg"));

        characterList.add(loki);

        Legends thor = new Legends("Thor","God of thunder and also a powerful warrior",thorMoveset,thorStat,"Norse");
        thor.setImageFile(new File("assets/Characters/thor.jpg"));

        characterList.add(thor);

        Legends anubis = new Legends("Anubis","God of the after life is your heart lighter then a feather?",anubisMoveset,anubisStat,"Egyptian");
        anubis.setImageFile(new File("assets/Characters/anubis.jpg"));

        characterList.add(anubis);

        Legends ra = new Legends("Ra","God of the sun and creator of all life supreme leader of the Eygiptian gods",raMoveset,raStat,"Egyptian");
        ra.setImageFile(new File("assets/Characters/ra.jpg"));

        characterList.add(ra);

        Legends horus = new Legends("Horus","God of the sky ruler of the pharaohs",horusMoveset,horusStat,"Egyptian");
        horus.setImageFile(new File("assets/Characters/horus.jpg"));

        characterList.add(horus);

        Legends zeus = new Legends("Zeus","King of gods and ruler of Olympus",zeusMoveset,zeusStat,"Olympus");
        zeus.setImageFile(new File("assets/Characters/zeus.jpg"));

        characterList.add(zeus);

        Legends poseidon = new Legends("Poseidon","God of the sea owner of atlantis",poseidonMoveset,posidionStat,"Olympus");
        poseidon.setImageFile(new File("assets/Characters/poseidon.jpg"));

        characterList.add(poseidon);

        Legends hades = new Legends("Hades","God of the underworld owner of the domain of the dead",hadesMoveset,hadesStat,"Olympus");
        hades.setImageFile(new File("assets/Characters/hades.jpg"));

        characterList.add(hades);
    }

    public ArrayList<Legends> getLegendsList() {
        return characterList;
    }
}
