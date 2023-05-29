public class legends
{
    private String name;
    private String description;
    private movesets move;
    private stats statistic;
    
    public legends(String name, String description, movesets move, stats statistic)
    {
        this.name=name;
        this.description=description;
        this.move=move;
        this.statistic=statistic;
    }

    public String getName()
    {
        return name;
    }

    public String description()
    {
        return description;
    }


}