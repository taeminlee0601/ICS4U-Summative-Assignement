public class Player {
    
    private Legends legend1;
    private Legends legend2;
    private Legends legend3;
    private Legends[] character = {legend1,legend2,legend3};
    
    public Player()
    {
        legend1=null;
        legend2=null;
        legend3=null;
    }

    public Legends[] getCharacter()
    {
        return character;
    }

    public void setCharacter(int num, Legends legend)
    {
        character[num]=legend;
    }

    public String toString()
    {
        return character[0].getName()+"\n"+character[1].getName()+"\n"+character[2].getName();
    }
}