import java.util.ArrayList;
public class move 
{
    
    private String moveName;
    private int power;
    private int accuracy;

    public move (String moveName, int power, int accuracy)
    {
        this.moveName=moveName;
        this.power=power;
        this.accuracy=accuracy;
    }

    public move(String moveName, int accuracy)
    {
        this.moveName=moveName;
        this.accuracy=accuracy;
    }
    
    public move(String moveName)
    {
        this.moveName=moveName;
    }

    public String getMoveName()
    {
        return moveName;
    }

    public int getPower()
    {
        return power;
    }

    public int getAccuracy()
    {
        return accuracy;
    }

    public static ArrayList<move> addMoveToMoveset(move move1, move move2, move move3)
    {
        ArrayList <move> arr = new ArrayList<move>();
        arr.add(move1);
        arr.add(move2);
        arr.add(move3);
        return arr;
    }



}