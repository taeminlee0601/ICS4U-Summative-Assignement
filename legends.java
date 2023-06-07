import java.util.ArrayList;
import java.io.File;

public class legends
{
    private String name;
    private String description;
    private ArrayList<move> movesets;
    private stats statistic;
    private String type;
    
    
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




}