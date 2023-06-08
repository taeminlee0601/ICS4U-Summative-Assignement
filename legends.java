import java.util.ArrayList;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Legends
{
    private String name;
    private String description;
    private ArrayList<Move> movesets;
    private Stats statistic;
    private String type;
    private File imageFile;
    
    
    public Legends(String name, String description, ArrayList<Move> movesets, Stats statistic,String type)
    {
        this.name=name;
        this.description=description;
        this.movesets=movesets;
        this.statistic=statistic;
        this.type=type;
    }

    public ArrayList<Move> getMoveset()
    {
        return movesets;
    }

    public Stats getStats()
    {
        return statistic;
    }

    public String getName()
    {
        return name;
    }

    public String description()
    {
        return description;
    }

    public static int calcDamage (int whichMove, Legends legend, Legends otherLegend)
    {

        int damageDone = (legend.getMoveset().get(whichMove).getPower() *  legend.getStats().getAttack() /  otherLegend.getStats().getDefense());
        
        if(legend.getType().equals("Outer")&&otherLegend.getType().equals("Olympus"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Olympus")&&otherLegend.getType().equals("Outer"))
        {
            damageDone*=0.8;
        }
        
        else if(legend.getType().equals("Meme")&&otherLegend.getType().equals("Egyptian"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Egyptian")&&otherLegend.getType().equals("Meme"))
        {
            damageDone*=0.8;
        }

        else if(legend.getType().equals("Egyptian")&&otherLegend.getType().equals("Outer"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Outer")&&otherLegend.getType().equals("Egyptian"))
        {
            damageDone*=0.8;
        }

        else if(legend.getType().equals("Olympus")&&otherLegend.getType().equals("Meme"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Meme")&&otherLegend.getType().equals("Olympus"))
        {
            damageDone*=0.8;
        }
        
        return damageDone;
    }

    public String getType()
    {

        return type;

    }

    public static void showMoveset(ArrayList<Move> moveset)
    {
        System.out.println("Move 1 name: "+ moveset.get(0).getMoveName());
        System.out.println("Move 1 power: "+ moveset.get(0).getPower());
        System.out.println("Move 1 accuracy: "+ moveset.get(0).getAccuracy());

        System.out.println();

        System.out.println("Move 2 name: "+ moveset.get(1).getMoveName());
        System.out.println("Move 2 power: "+ moveset.get(1).getPower());
        System.out.println("Move 2 accuracy: "+ moveset.get(1).getAccuracy());

        System.out.println();

        System.out.println("Move 3 name: "+ moveset.get(2).getMoveName());
        System.out.println("Move 3 power: "+ moveset.get(2).getPower());
        System.out.println("Move 3 accuracy: "+ moveset.get(2).getAccuracy());

        System.out.println();

    }

    public static boolean accuracyCheck (int accuracy)
    {
        Random random = new Random();

        int randomNumber = random.nextInt(101);

        if (randomNumber <= accuracy)
        {
            return true;
        }   
        else
        {
            return false;
        }
    }

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public File getImageFile() {
        return imageFile;
    }
    
    public static void swapLegend(Player player,Legends legend, Legends otherLegend)
    {   
        int legendIndex = Player.getIndiceInCharacter(player.getCharacter(), legend);
        int otherLegendIndex = Player.getIndiceInCharacter(player.getCharacter(), otherLegend);
        
        player.setCharacter(legendIndex, otherLegend);
        player.setCharacter(otherLegendIndex, legend);

        player.showLegendListPlayer(player);
        System.out.println();
    }

}

>>>>>>> 08169b164af78f179d39fe318a871a3e2fb21224
