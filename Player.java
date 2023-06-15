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
    /**
     * Used to find where legend is in ArrayList so you can swap between legends
     * @param character players legends
     * @param legend The legend used to swap
     * @return swapped legend
     */
    public static int getIndiceInCharacter(Legends[] character,Legends legend)
    {
        for(int i=0;i<character.length;i++)
        {
            if(character[i]==legend)
            {
                return i;
            }
        }
        return -1;
    }

    
    /**
     * Gets the character that player picked
     * Precondition player need to pick character
     * Postcondition returns the character the player picked
     * @param i place of legend
     * @return the character the played picked
     */
    public Legends getCharacter(int i)
    {
        return character[i];
    }

    public Legends[] getCharacter()
    {
        return character;
    }
    //set the character that the player picked
    public void setCharacter(int num, Legends legend)
    {
        character[num]=legend;
    }
    /**
     * Shows user there current legends that they can swap to and there status alive/dead
     * Precondition player must have already picked legends
     * Postconditions outputs the user legends with there status
     * @param player player to check 
     */
    public static void showLegendListPlayer(Player player)
    {
        System.out.print("1. " + player.getCharacter(0).getName() + " ");
        if(App.isCurrentLegendAlive(player.getCharacter(0)))
        {
            System.out.println("[Alive]");
        }
        else if (App.isCurrentLegendAlive(player.getCharacter(0))==false)
        {
            System.out.println("[Eliminated]");
        }
        System.out.print("2. " + player.getCharacter(1).getName() + " ");
        if(App.isCurrentLegendAlive(player.getCharacter(1)))
        {
            System.out.println("[Alive]");
        }
        else if (App.isCurrentLegendAlive(player.getCharacter(1))==false)
        {
            System.out.println("[Eliminated]");
        }
        System.out.print("3. " + player.getCharacter(2).getName() + " ");
        if(App.isCurrentLegendAlive(player.getCharacter(2)))
        {
            System.out.println("[Alive]");
        }
        else if (App.isCurrentLegendAlive(player.getCharacter(2))==false)
        {
            System.out.println("[Eliminated]");
        }
    }

    /**
     * show the legends in players party
     * Precondition Character array must exist
     * postcondition returns players legends witht here names
     */
    public String toString()
    {
        return character[0].getName() + "\n" + character[1].getName() + "\n" + character[2].getName() + "\n";
    }

    
}