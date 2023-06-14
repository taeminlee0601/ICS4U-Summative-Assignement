//  importing packages
import java.util.ArrayList;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

//  Legends class
public class Legends
{
    //  Instance variables
    private String name;
    private String description;
    private ArrayList<Move> movesets;
    private Stats statistic;
    private String type;
    private File imageFile;
    
    //  Legends constructor
    public Legends(String name, String description, ArrayList<Move> movesets, Stats statistic,String type)
    {
        this.name=name;
        this.description=description;
        this.movesets=movesets;
        this.statistic=statistic;
        this.type=type;
    }

    //  getter method for the arraylist moveset
    public ArrayList<Move> getMoveset()
    {
        return movesets;
    }

    //  getter method for Stats object statistic
    public Stats getStats()
    {
        return statistic;
    }

    //  getter method for String name
    public String getName()
    {
        return name;
    }

    //  getter method for String description
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
     * getter method that returns the String type
     * Precondition: String type has to exist
     * Postcondition: returns the String type
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
     * 
     * @param imageFile
     */
    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public File getImageFile() {
        return imageFile;
    }

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
