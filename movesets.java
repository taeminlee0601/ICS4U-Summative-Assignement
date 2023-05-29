public class movesets 
{
    private String moveName;
    private int power;
    private int accurary;

    public movesets (String moveName, int power, int accurary)
    {
        this.moveName=moveName;
        this.power=power;
        this.accurary=accurary;
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
        return accurary;
    }

}