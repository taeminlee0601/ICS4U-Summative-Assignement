import java.util.ArrayList;
public class Move 
{
    
    private String moveName;
    private int power;
    private int accuracy;

    public Move (String moveName, int power, int accuracy)
    {
        this.moveName=moveName;
        this.power=power;
        this.accuracy=accuracy;
    }

    public Move(String moveName, int accuracy)
    {
        this.moveName=moveName;
        this.accuracy=accuracy;
    }
    
    public Move(String moveName)
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

    public static ArrayList<Move> addMoveToMoveset(Move move1, Move move2, Move move3)
    {
        ArrayList <Move> arr = new ArrayList<Move>();
        arr.add(move1);
        arr.add(move2);
        arr.add(move3);
        return arr;
    }



}
