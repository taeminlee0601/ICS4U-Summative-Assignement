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

        movesets yogMove1= new movesets("Eldritch Grasp",150,80);
        movesets yogMove2 = new movesets("Unfathomable Presence",200,40);
        movesets yogMove3 = new movesets("Chaos Rift",120,100);

        movesets cthulhuMove1 = new movesets("Abyssal Awakening", 250, 30);
        movesets cthulhuMove2 = new movesets("Call of the Deep");
        movesets cthulhuMove3 = new movesets("R’lyehian Resurgence");

        movesets azathothMove1 = new movesets("Nihilistic Pulse",280,10);
        movesets azathothMove2 = new movesets("Slumbering Malevolence",150, 75);
        movesets azathothMove3 = new movesets("h' zhro geb",1);

        movesets rickMove1 = new movesets("Rickroll Surprise");
        movesets rickMove2 = new movesets("Rick’s Redemption");
        movesets rickMove3 = new movesets("Melodic Encore");

        movesets derpMove1 = new movesets("Derpy Pouce",100,100);
        movesets derpMove2 = new movesets("Derpocalypse ",100);
        movesets derpMove3 = new movesets("Whimsical Charm");
        
        movesets godzillaMove1 = new movesets("Atomic Breath",140,80);
        movesets godzillaMove2 = new movesets("Nuclear Regeneration");
        movesets godzillaMove3 = new movesets("Vengeful Retaliation");

        movesets odinMove1 = new movesets("Hugin and Munin");
        movesets odinMove2 = new movesets("Allfather Strike",130,80);
        movesets odinMove3 = new movesets("Insight");

        movesets lokiMove1 = new movesets("Shape Shift");
        movesets lokiMove2 = new movesets("Illusionary Strike",120,90);
        movesets lokiMove3 = new movesets("Mirror Image");

        movesets thorMove1 = new movesets("Mjolnir's Strike",90,100);
        movesets thorMove2 = new movesets("Lighting bolt",110,80);
        movesets thorMove3 = new movesets("Call of Lighting");

        movesets anubisMove1 = new movesets("Soul Drain",70,90);
        movesets anubisMove2 = new movesets("Pharaoh's Tomb",60,100);
        movesets anubisMove3 = new movesets("Underworld Summon");

        movesets raMove1 = new movesets("Flash");
        movesets raMove2 = new movesets("Lightspeed");
        movesets raMove3 = new movesets("Sunshine",145,80);

        movesets horusMove1 = new movesets("Falcon Strike",75,100);
        movesets horusMove2 = new movesets("Divine Healing");
        movesets horusMove3 = new movesets("Pharaoh's Judgement",200,80);


    }
}