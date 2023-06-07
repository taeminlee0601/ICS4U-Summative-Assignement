public class Player {
    
    private legends legend1;
    private legends legend2;
    private legends legend3;
    private legends[] character = {legend1,legend2,legend3};
    
    public Player()
    {
        legend1=null;
        legend2=null;
        legend3=null;
    }

    public legends[] getCharacter()
    {
        return character;
    }

    public void setCharacter(int num, legends legend)
    {
        character[num]=legend;
    }

    public String toString()
    {
        return character[0].getName()+"\n"+character[1].getName()+"\n"+character[2].getName();
    }
}
