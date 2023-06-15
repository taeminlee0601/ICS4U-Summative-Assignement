//  importing packages
import java.util.ArrayList;
import java.io.File;
import java.util.Random;
import java.util.Scanner;


/**
 * The Legends class represents a legend in a game.
 * Legends have a name, description, movesets, statistics, type, and an image file.
 */
public class Legends
{
    //  Instance variables
    private String name; //  name of the legend
    private String description; //  description of the legend
    private ArrayList<Move> movesets; //  moveset of the legend (3 moves in a moveset)
    private Stats statistic; //  stats of the legend
    private String type; // type of the legend
    private File imageFile; //  image file of the legend
    
    /**
     * Constructs a Legends object with the specified name, description, movesets, statistics, and type.
     * Precondition - Legends object must take a String name, String description, ArrayList<Move> movesets, Stats statistic, and String type
     * Postcondition - Instance variables are initialized
     * @param name - the name of the legend
     * @param description - description of the legend
     * @param movesets - moveset of the legend (3 moves in a moveset)
     * @param statistic - stats of the legend
     * @param type - type of the legend
     */
    public Legends(String name, String description, ArrayList<Move> movesets, Stats statistic,String type)
    {
        this.name=name;
        this.description=description;
        this.movesets=movesets;
        this.statistic=statistic;
        this.type=type;
    }

    /**
     * Returns the ArrayList<Move> movesets of a given Legends object
     * Precondition: Legends object must be initialized
     * Postcondition: Returns ArrayList<Move> movesets accessed from the Legends object
     * @return movesets - movesets of the Legends object
     */
    public ArrayList<Move> getMoveset()
    {
        return movesets;
    }

    /**
     * Returns the Stats statistic of a given Legends object
     * Precondition: Legends object must be initialized
     * Postcondition: Returns Stats statistic accessed from the Legends object
     * @return statistic - stats pf the Legends object
     */
    public Stats getStats()
    {
        return statistic;
    }

    /**
     * Returns the ArrayList<Move> movesets of a given Legends object
     * Precondition: Legends object must be initialized
     * Postcondition: Returns String name accessed from the Legends object
     * @return name - name of the Legends object
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the String description of a given Legends object
     * Precondition: Legends object must be initialized
     * Postcondition: Returns String description accessed from the Legends object
     * @return description - description of the Legends object
     */
    public String description()
    {
        return description;
    }

    /**
     * Calculates the damage a move will do, using the formula: power of move*attack of legend/defense of otherLegend
     * Precondition 1: method must take int whichMove, Legends legend, and Legends otherLegend
     * Precondition 2: effectiveness on legend types, refer to game guide for more details
     * Postcondition: returns an int that indicates the dmg the move will do
     * @param whichMove - String object to refer to which move the player picked
     * @param legend - Legends object to refer to the player legend
     * @param otherLegend - Legends object to refer to the opponent legend
     * @return damageDone - an int that indicates the dmg the move will do
     */

    public static int calcDamage (int whichMove, Legends legend, Legends otherLegend)
    {

        int damageDone = (legend.getMoveset().get(whichMove).getPower() *  legend.getStats().getAttack() /  otherLegend.getStats().getDefense());
        
        if(legend.getType().equals("Outer")&&otherLegend.getType().equals("Olympus"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Olympus")&&otherLegend.getType().equals("Outer"))
        {
            damageDone*=0.8;
        }
        
        else if(legend.getType().equals("Meme")&&otherLegend.getType().equals("Egyptian"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Egyptian")&&otherLegend.getType().equals("Meme"))
        {
            damageDone*=0.8;
        }

        else if(legend.getType().equals("Egyptian")&&otherLegend.getType().equals("Outer"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Outer")&&otherLegend.getType().equals("Egyptian"))
        {
            damageDone*=0.8;
        }

        else if(legend.getType().equals("Olympus")&&otherLegend.getType().equals("Meme"))
        {
            damageDone*=1.2;
        }
        else if(legend.getType().equals("Meme")&&otherLegend.getType().equals("Olympus"))
        {
            damageDone*=0.8;
        }
        
        return damageDone;
    }

    /**
     * Returns the String type of a given Legends object
     * Precondition: 
     * Postcondition: returns the String type accessed from Legends object
     * @return type - String object that refers to the legend type
     */
    public String getType()
    {

        return type;

    }
    /**
     * void method that shows the list of the moves in the moveset
     * Precondition: method must take ArrayList<move> moveset
     * Postcondition: prints out the list of moves in the terminal
     * @param moveset - ArrayList<move> object to refer which moveset the method is accessing
     */
    public static void showMoveset(ArrayList<Move> moveset)
    {
        System.out.println("Move 1 name: "+ moveset.get(0).getMoveName());
        System.out.println("Move 1 power: "+ moveset.get(0).getPower());
        System.out.println("Move 1 accuracy: "+ moveset.get(0).getAccuracy());

        System.out.println();

        System.out.println("Move 2 name: "+ moveset.get(1).getMoveName());
        System.out.println("Move 2 power: "+ moveset.get(1).getPower());
        System.out.println("Move 2 accuracy: "+ moveset.get(1).getAccuracy());

        System.out.println();

        System.out.println("Move 3 name: "+ moveset.get(2).getMoveName());
        System.out.println("Move 3 power: "+ moveset.get(2).getPower());
        System.out.println("Move 3 accuracy: "+ moveset.get(2).getAccuracy());

        System.out.println();

    }
    /**
     * boolean method that checks if the move passes the accuracy check
     * Precondition 1: method must take int accuracy
     * Precondition 2: if the random number is less or equal to the accuracy of the move, it passes true, otherwise false
     * Postcondition: return true or false depending on the condition
     * @param accuracy - int object that refers to the move's accuracy
     * @return return true or false depending on the condition
     */
    public static boolean accuracyCheck (int accuracy)
    {
        Random random = new Random();

        int randomNumber = random.nextInt(101);

        if (randomNumber <= accuracy)
        {
            return true;
        }   
        else
        {
            return false;
        }
    }

    /**
     * setter method that sets the File imageFile
     * Precondition: legends object has to exist
     * Postcondition: imageFile will be set to the new File object
     * @param imageFile - new image file of the legends object you want to set
     */
    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * Returns the File imageFile of a given Legends object
     * Precondition: Legends object must be initialized
     * Postcondition: return File imageFile accessed from Legends object
     * @return imageFile - image file of the Legends object
     */
    public File getImageFile() {
        return imageFile;
    }

    /**
     * Swaps the legend with the other two legends in your team
     * Precondition: if the legend you are swapping to is eliminated, it will you to try again until you swap to a legend that is alive
     * Postcondiion: swaps the positions of the current legend and the desired legend in the player'
     * @param player - player object representing the team
     * @param legend - the current legend that the player wants to swap
     */
    public static void swapLegend(Player player,Legends legend)
    {   
        boolean validInput=true;
        Scanner input = new Scanner(System.in);
        while(validInput)
        {
            Player.showLegendListPlayer(player);
            System.out.println();
            System.out.println("Player's current legend is " + legend.getName());
            System.out.println();
            System.out.print("Who do you want to switch to? Enter 1, 2, or 3 to select: ");
            int who = input.nextInt();
            System.out.println();
            Legends desiredLegend = null;
            
            for (int i = 0; i < player.getCharacter().length; i++) {
                if (who==i+1&&App.isCurrentLegendAlive(player.getCharacter(i))) {
                    validInput=false;
                    desiredLegend = player.getCharacter(i);
                    int legendIndex = Player.getIndiceInCharacter(player.getCharacter(), legend);
                    int desiredLegendIndex = Player.getIndiceInCharacter(player.getCharacter(), desiredLegend);
                    player.setCharacter(legendIndex, desiredLegend);
                    player.setCharacter(desiredLegendIndex, legend);
                    Player.showLegendListPlayer(player);
                    System.out.println();
                    break;
                }
            }
            if(validInput)
            {
                System.out.println("The legend you chose is out of commission or you entered an invalid legend name. Please try again.");
            }
        }

        
    }
}
