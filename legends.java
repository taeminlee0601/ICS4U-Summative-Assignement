import java.util.ArrayList;
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

    public ArrayList<move> getMovesets()
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

    public static ArrayList<move> addMoveToMoveset(move move1, move move2, move move3)
    {
        ArrayList arr = new ArrayList();
        arr.add(move1);
        arr.add(move2);
        arr.add(move3);
        return arr;
    }

    public String getType()
    {

        return type;

    }




}