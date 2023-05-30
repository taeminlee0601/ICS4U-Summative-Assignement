public class movesets 
{
    private String moveName;
    private int power;
    private int accuracy;

    public movesets (String moveName, int power, int accuracy)
    {
        this.moveName=moveName;
        this.power=power;
        this.accuracy=accuracy;
    }

    public movesets(String moveName, int accuracy)
    {
        this.moveName=moveName;
        this.accuracy=accuracy;
    }
    
    public movesets(String moveName)
    {
        this.moveName=moveName;
    }

    public String getMove()
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

}