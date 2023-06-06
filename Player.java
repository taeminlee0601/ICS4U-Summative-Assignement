public class Player {
    
    private static legends legend1;
    private static legends legend2;
    private static legends legend3;

   static legends[] character = {legend1,legend2,legend3};
    
    public Player()
    {
        legend1=null;
        legend2=null;
        legend3=null;
    }

    public legends getLegends(int num)
    {
        return character[num];
    }

    public static void setCharacter(int num, legends legend)
    {
        character[num]=legend;
    }

    public String toString()
    {
        return character[0].getName()+"\n"+character[1].getName()+"\n"+character[2].getName();
    }
}
