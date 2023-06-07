import java.util.ArrayList;
import java.lang.Math;

public class stats
{
    private int hp;
    private int attack;
    private int speed;
    private int defense;

//constructors

    public stats(int hp, int attack, int speed, int defense)
    {
        this.hp=hp;
        this.attack=attack;
        this.speed=speed;
        this.defense=defense;
    }

    public static int calcDamage (Player player1, Player player2,int numLegend,ArrayList<move> movesets,int numMove)
    {

        int damageDone = (player1.getLegends(numLegend).getMovesets().* player1.getLegends(num).getAttack() / defense);
        
        if(type1.equals("Outer")&&type2.equals("Olympus"))
        {
            damageDone*=1.2;
        }
        else if(type1.equals("Olympus")&&type2.equals("Outer"))
        {
            damageDone*=0.8;
        }
        else if(type1.equals("Meme")&&type2.equals("Egyptian"))
        {
            damageDone*=1.2;
        }
        else if(type1.equals("Egyptian")&&type2.equals("Meme"))
        {
            damageDone*=0.8;
        }
        else if(type1.equals("Egyptian")&&type2.equals("Outer"))
        {
            damageDone*=1.2;
        }
        else if(type1.equals("Outer")&&type2.equals("Egyptian"))
        {
            damageDone*=0.8;
        }
        else if(type1.equals("Olympus")&&type2.equals("Meme"))
        {
            damageDone*=1.2;
        }
        else if(type1.equals("Meme")&&type2.equals("Olympus"))
        {
            damageDone*=0.8;
        }
        
        return damageDone;
    }

    








    public int getHP()
    {
        return hp;
    }

    public void setHP(int hp)
    {
        this.hp=hp;
    }

    public int getAttack()
    {
        return attack;
    }

    public void setAttack(int attack)
    {
        this.attack=attack;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed=speed;
    }

    public int getDefense()
    {
        return defense;
    }

    public void setDefense(int defense)
    {
        this.defense=defense;
    }

    
} 