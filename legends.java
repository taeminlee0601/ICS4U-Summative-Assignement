import java.util.ArrayList;
import java.io.File;

public class legends
{
    private String name;
    private String description;
    private ArrayList<move> movesets;
    private stats statistic;
    private String type;
    private File imageFile;
    
    
    public legends(String name, String description, ArrayList<move> movesets, stats statistic,String type)
    {
        this.name=name;
        this.description=description;
        this.movesets=movesets;
        this.statistic=statistic;
        this.type=type;
    }

    public ArrayList<move> getMoveset()
    {
        return movesets;
    }

    public stats getStats()
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

    public static int calcDamage (int whichMove, legends legend, legends otherLegend)
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

    public static void showMoveset(ArrayList<move> moveset)
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

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public File getImageFile() {
        return imageFile;
    }

}