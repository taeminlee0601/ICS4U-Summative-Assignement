import java.util.ArrayList;
import java.util.Scanner;

public class App
{
   
    public static void main(String[]args)
    {
        Stats yogStat = new Stats(900,100,50,150);
        Stats cthulhuStat = new Stats(1000,90,70,140);
        Stats azathothStat = new Stats(1500,110,40,170);

        Stats rickStat = new Stats(750,60,90,100);
        Stats derpStat = new Stats(750,100,110,80);
        Stats godzillaStat = new Stats(950, 100, 100, 130);

        Stats odinStat = new Stats(900,80,70,50);
        Stats lokiStat = new Stats(800, 90, 80,60);
        Stats thorStat = new Stats(850,100,85,40);

        Stats anubisStat = new Stats (750,130,95,80);
        Stats raStat = new Stats (650,120,105,70);
        Stats horusStat = new Stats (700,115,115,85);

        Stats zeusStat = new Stats (900,90,125,100);
        Stats posidionStat = new Stats (1000,85,75,95);
        Stats hadesStat = new Stats (850,100,120,90);
        //  Creates 3 move for each legends and add it to the arraylist Moveset
        Move yogMove1= new Move("Eldritch Grasp",150,80);
        Move yogMove2 = new Move("Unfathomable Presence",180,60);
        Move yogMove3 = new Move("Chaos Rift",120,90);

        ArrayList<Move> yogMoveset = Move.addMoveToMoveset(yogMove1,yogMove2, yogMove3);

        
        Move cthulhuMove1 = new Move("Abyssal Awakening", 130, 90);
        Move cthulhuMove2 = new Move("Call of the Deep",90,90);
        Move cthulhuMove3 = new Move("R’lyehian Resurgence",80,100);
        
        ArrayList<Move> cthMoveset = Move.addMoveToMoveset(cthulhuMove1,cthulhuMove2, cthulhuMove3);

        
        Move azathothMove1 = new Move("Nihilistic Pulse",260,20);
        Move azathothMove2 = new Move("Slumbering Malevolence",140, 70);
        Move azathothMove3 = new Move("h' zhro geb",10000,1);

        ArrayList<Move> azaMoveset = Move.addMoveToMoveset(azathothMove1,azathothMove2, azathothMove3);

        
        Move rickMove1 = new Move("Rickroll Surprise",90,100);
        Move rickMove2 = new Move("Rick’s Redemption",130,70);
        Move rickMove3 = new Move("Melodic Encore",200,40);

        ArrayList<Move> rickMoveset = Move.addMoveToMoveset(rickMove1,rickMove2,rickMove3);

        Move derpMove1 = new Move("Derpy Pouce",90,100);
        Move derpMove2 = new Move("Derpocalypse ",120,80);
        Move derpMove3 = new Move("Whimsical Charm",150,40);

        ArrayList<Move> derpMoveset = Move.addMoveToMoveset(derpMove1,derpMove2,derpMove3);
        
        
        Move godzillaMove1 = new Move("Atomic Breath",100,90);
        Move godzillaMove2 = new Move("Nuclear Regeneration",80,100);
        Move godzillaMove3 = new Move("Vengeful Retaliation",200,50);

        ArrayList<Move> godzillaMoveset = Move.addMoveToMoveset(godzillaMove1,godzillaMove2,godzillaMove3);

        
        Move odinMove1 = new Move("Hugin and Munin",70,100);
        Move odinMove2 = new Move("Allfather Strike",120,80);
        Move odinMove3 = new Move("Puppeteers Control",100,90);

        ArrayList<Move> odinMoveset = Move.addMoveToMoveset(odinMove1,odinMove2,odinMove3);

        
        Move lokiMove1 = new Move("Trickster",80,100);
        Move lokiMove2 = new Move("Illusionary Strike",120,80);
        Move lokiMove3 = new Move("Mirror Image",100,90);
        
        ArrayList<Move> lokiMoveset = Move.addMoveToMoveset(lokiMove1, lokiMove2, lokiMove3);

       
        Move thorMove1 = new Move("Mjolnir's Strike",90,100);
        Move thorMove2 = new Move("Lighting bolt",110,80);
        Move thorMove3 = new Move("Call of Lighting",150,50);

        ArrayList<Move> thorMoveset = Move.addMoveToMoveset(thorMove1, thorMove2, thorMove3);
        
        
        Move anubisMove1 = new Move("Soul Drain",100,70);
        Move anubisMove2 = new Move("Pharaoh's Tomb",70,100);
        Move anubisMove3 = new Move("Underworld Summon",200,20);

        ArrayList<Move> anubisMoveset = Move.addMoveToMoveset(anubisMove1, anubisMove2, anubisMove3);

        
        Move raMove1 = new Move("Flash",130,70);
        Move raMove2 = new Move("Lightspeed",90,100);
        Move raMove3 = new Move("Sunshine",160,60);

        ArrayList<Move> raMoveset = Move.addMoveToMoveset(raMove1, raMove2, raMove3);

       
        Move horusMove1 = new Move("Falcon Strike",80,100);
        Move horusMove2 = new Move("Divine Power",90,90);
        Move horusMove3 = new Move("Pharaoh's Judgement",160,80);

        ArrayList<Move> horusMoveset = Move.addMoveToMoveset(horusMove1, horusMove2, horusMove3);

        
        Move zeusMove1 = new Move("ThunderBolt",80,100);
        Move zeusMove2 = new Move("ThunderStorm",140,70);
        Move zeusMove3 = new Move("Typhoon",100,90);

        ArrayList<Move> zeusMoveset = Move.addMoveToMoveset(zeusMove1, zeusMove2, zeusMove3);

 
        Move poseidonMove1 = new Move("Flood",110,80);
        Move poseidonMove2 = new Move("Shark Attack",200,20);
        Move poseidonMove3 = new Move("Trident Throw",70,100);

        ArrayList<Move> poseidonMoveset = Move.addMoveToMoveset(poseidonMove1, poseidonMove2, poseidonMove3);

        Move hadesMove1 = new Move("Invisable Attack",100,90);
        Move hadesMove2 = new Move("Soul Absorb",80,100);
        Move hadesMove3 = new Move("Reckless Attack",170,50);
        
        ArrayList<Move> hadesMoveset = Move.addMoveToMoveset(hadesMove1, hadesMove2, hadesMove3);
        
        ArrayList<Legends> characterList = new ArrayList<Legends>();
        //  Adds Legends with there description and type to arraylist Legends
        Legends yog = new Legends("Yog-Sothoth","Cosmic entitiy who trasends space and time",yogMoveset,yogStat,"Outer");

        characterList.add(yog);

        Legends chthulhu = new Legends("Cthulhu","Colossal ancient god lying dormant in the sea waiting for someone to wake him",cthMoveset,cthulhuStat,"Outer");

        characterList.add(chthulhu);

        Legends azathoth = new Legends("Azathoth","Chaotic deity know as the blind god existing at the center of the cosmos",azaMoveset,azathothStat,"Outer");

        characterList.add(azathoth);

        Legends rick = new Legends("Rick Asley","Never gonna give you up never gonna let you down never gonna run around and desert you",rickMoveset,rickStat,"Meme");

        characterList.add(rick);

        Legends cat = new Legends("Derp Cat","nyanynaynaynaynaynayna",derpMoveset,derpStat,"Meme");

        characterList.add(cat);

        Legends godzilla = new Legends("Godzilla","King of the monster",godzillaMoveset,godzillaStat,"Meme");

        characterList.add(godzilla);

        Legends odin = new Legends("Odin","God of wisdom war and death the Allfather",odinMoveset,odinStat,"Norse");

        characterList.add(odin);

        Legends loki = new Legends("Loki","God of mischief who knows what he might do?",lokiMoveset,lokiStat,"Norse");

        characterList.add(loki);

        Legends thor = new Legends("Thor","God of thunder and also a powerful warrior",thorMoveset,thorStat,"Norse");

        characterList.add(thor);

        Legends anubis = new Legends("Anubis","God of the after life is your heart lighter then a feather?",anubisMoveset,anubisStat,"Egyptian");

        characterList.add(anubis);

        Legends ra = new Legends("Ra","God of the sun and creator of all life supreme leader of the Eygiptian gods",raMoveset,raStat,"Egyptian");

        characterList.add(ra);

        Legends horus = new Legends("Horus","God of the sky ruler of the pharaohs",horusMoveset,horusStat,"Egyptian");
        
        characterList.add(horus);

        Legends zeus = new Legends("Zeus","King of gods and ruler of Olympus",zeusMoveset,zeusStat,"Olympus");

        characterList.add(zeus);

        Legends poseidon = new Legends("Poseidon","God of the sea owner of atlantis",poseidonMoveset,posidionStat,"Olympus");

        characterList.add(poseidon);

        Legends hades = new Legends("Hades","God of the underworld owner of the domain of the dead",hadesMoveset,hadesStat,"Olympus");

        characterList.add(hades);
        //  Creates 2 playable people for pass and play
        Player player1 = new Player();
        Player player2 = new Player();
        //  Ask's player to choose one of the 15 legends and removed picked legend from list when they picked
        System.out.println("Player 1 choose Legends:");
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your first legend: ");
        Legends temp = chooseLegend(characterList);
        player1.setCharacter(0,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your second legend: ");
        temp = chooseLegend(characterList);
        player1.setCharacter(1,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your third legend: ");
        temp = chooseLegend(characterList);
        player1.setCharacter(2,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("These are your three selected Legends:");
        System.out.print(player1.toString());

        System.out.println();
        System.out.println();

        System.out.println("Player 2 choose Legends: ");
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your first legend: ");
        temp = chooseLegend(characterList);
        player2.setCharacter(0,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.print("Choose your second legend: ");
        temp = chooseLegend(characterList);
        player2.setCharacter(1,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();


        System.out.print("Choose your third legend: ");
        temp = chooseLegend(characterList);
        player2.setCharacter(2,temp);
        removeAlreadyPickedCharacterList(characterList,temp);
        showCharacterList(characterList);
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println("These are your three selected Legends:");
        System.out.print(player2.toString());
        System.out.println();
        System.out.println();

        
        game(player1, player2);



    }

    
    /**
     * Runs all the actions for the game attacking,buffing and swaping
     * Precondition Players have already picked legends and have legends in there arraylist
     * Postcondition will print various thinhs depending on user input
     * if they hit [1] they will attack the other legends and it will show them there possible moveset
     * if they hit [2] they will buff there legends stat the cant max buff 5 time other wise its invalid input
     * if they hit [3] they will choose to swap to a diffrent legend in ther party if they have no alive legends invalid inpit
     * @param player1 User 1 with 3 legends in his arraylist
     * @param player2 User 2 with 3 legends in his arrayList
     */
    public static void game(Player player1, Player player2)
    {
        boolean turn1 = true;
        boolean turn2 = true;
        Scanner input = new Scanner(System.in);
        int countBuff1 = 0;
        int countBuff2 =0;
        int move1 =0;
        int move2 = 0;
        while(hasAliveLegends(player1)&&hasAliveLegends(player2))
        {
            //  Gets the legends that the player picks and there movesets
            Legends currentLegendPlayer1 = player1.getCharacter(0);
            Legends currentLegendPlayer2 = player2.getCharacter(0);
            ArrayList <Move> legendPlayer1Moveset= currentLegendPlayer1.getMoveset();
            ArrayList <Move> legendPlayer2Moveset= currentLegendPlayer2.getMoveset();
            while (turn1) 
            {
                //  checks if current legend is alive to see if player cant actually do there turn/move
                if(isCurrentLegendAlive(currentLegendPlayer1))
                {
                    //  ask player to choose between attacking buffing the legend or swapping to diffrent legend
                    System.out.println("It is " + currentLegendPlayer1.getName()+ "'s turn. Choose your action (attack opponent[1], buff yourself [2], or swap legend [3]): ");
                    int action = input.nextInt();
                    input.nextLine();
                    System.out.println();
                        
                    if (action==1)
                    {
                        //  Show the stats of player 2 whenver they take there turn
                        System.out.println("The current hp of Player 2 legend is " + currentLegendPlayer2.getStats().getHP());
                        System.out.println("The current attack of Player 2 legend is " + currentLegendPlayer2.getStats().getAttack());
                        System.out.println("The current speed of Player 2 legend is " + currentLegendPlayer2.getStats().getSpeed());
                        System.out.println("The current defense of Player 2 legend is " + currentLegendPlayer2.getStats().getDefense());
                        System.out.println();
                        boolean validInput=true;
                        while(validInput)
                        {
                            //  Show the player the move they can select and give them number options for each move
                            System.out.println("The following are the moves you can select:");
                            System.out.println();
                            Legends.showMoveset(legendPlayer1Moveset);
                            System.out.print("Choose your move (move 1 [1], move 2 [2], move 3 [3]): ");
                            move1=input.nextInt();
                            for(int i = 0; i<legendPlayer1Moveset.size();i++)
                            {
                                if(move1==i+1)
                                {
                                    //Show what move player 1 chose and gets the movename
                                    System.out.println("Player 1 chooses to use " + legendPlayer1Moveset.get(i).getMoveName());
                                    System.out.println();
                                    validInput=false;
                                    break;
                                }
                                else if(move1<1&&move1>3)
                                {
                                    System.out.println("Invalid input! Please enter the correct move number.");
                                    System.out.println();
                                }
                            }
                            
                        }
                        turn1=false;
                    }
                    else if(action==2)
                    {
                        if(countBuff1<=5)
                        {
                            /* 
                            if player instead chooses to buff it adds a count to countBuff1
                            whenever it exceed 5 the player can no longer buff there legend
                            */  
                            Move.buff(currentLegendPlayer1);
                            countBuff1++;
                        }
                        else
                        {
                            //  tells player they can no longer buff after they buff 5 times
                            System.out.println("You have exceeeded the maximum buff amount!");
                            System.out.println();
                        }
                        turn1=false;
                    }
                    //  run this block of code if player chose the 3rd option
                    else if (action==3)
                    {
                        Legends.swapLegend(player1,currentLegendPlayer1);
                        turn1=false;
                    }
                    
                    else
                    {
                        System.out.println("Invalid input, try again.");
                        System.out.println();
                    }
                }
                else
                {   
                    //  automatically swaps to diffrent legend when your current legend dies
                    System.out.println("Swapping to a legend that is alive...");
                    swapToAliveLegend(player1);
                    turn1=false;
                }
                
            }
            while (turn2) 
            {
                //  Same code as above from line 291-380 buf for CurrentLegendPlayer2
                if(isCurrentLegendAlive(currentLegendPlayer2))
                {
                    System.out.println("It is " + currentLegendPlayer2.getName()+ "'s turn. Choose your action (attack opponent[1], buff yourself [2], or swap legend [3]): ");
                    int action = input.nextInt();
                    System.out.println();
                    
                    if (action==1)
                    {
                        
                        System.out.println("The current hp of Player 1 legend is " + currentLegendPlayer1.getStats().getHP());
                        System.out.println("The current attack of Player 1 legend is " + currentLegendPlayer1.getStats().getAttack());
                        System.out.println("The current speed of Player 1 legend is " + currentLegendPlayer1.getStats().getSpeed());
                        System.out.println("The current defense of Player 1 legend is " + currentLegendPlayer1.getStats().getDefense());
                        System.out.println();
                        boolean validInput=true;
                        while(validInput)
                        {
                            System.out.println("The following are the moves you can select:");
                            System.out.println();
                            Legends.showMoveset(legendPlayer2Moveset);
                            System.out.print("Choose your move (move 1 [1], move 2 [2], move 3 [3]): ");
                            move2=input.nextInt();
                            System.out.println();
                            for(int i = 0; i<legendPlayer2Moveset.size();i++)
                            {
                                if(move2==i+1)
                                {
                                    System.out.println("Player 2 chooses to use " + legendPlayer2Moveset.get(i).getMoveName());
                                    System.out.println();
                                    validInput=false;
                                    break;
                                }
                                else if (move2<1&&move2>3)
                                {
                                    System.out.println("Invalid input! Please enter the correct move number.");
                                    System.out.println();
                                }
                            }
                        }
                        turn2=false;
                        
                    }

                    else if(action==2)
                    {
                        if(countBuff2<=5)
                        {
                            Move.buff(currentLegendPlayer2);
                            countBuff2++;
                        }
                        else
                        {
                            System.out.println("You have exceeeded the maximum buff amount!");
                            System.out.println();
                        }
                        turn2=false;
                    }

                    else if (action==3)
                    {
                        Legends.swapLegend(player2,currentLegendPlayer2);
                        turn2=false;
                    }
                    else
                    {
                        System.out.println("Invalid input, try again.");
                        System.out.println();
                    }
                }
                else
                {
                    System.out.println("Swapping to a legend that is alive...");
                    swapToAliveLegend(player2);
                    turn2=false;
                }    
            }
            //  Checks both of the current legends speed stats to decide who will attack first 
            if(Stats.checkSpeed(currentLegendPlayer1, currentLegendPlayer2))
            {
                System.out.println(currentLegendPlayer1.getName()+" hits first! because " + currentLegendPlayer1.getName() + " 's speed is faster than " + currentLegendPlayer2.getName() + "'s speed.");
                System.out.println();
                attackPlayer2(move1, currentLegendPlayer1.getMoveset(), currentLegendPlayer1, currentLegendPlayer2);
                attackPlayer1(move2, currentLegendPlayer2.getMoveset(), currentLegendPlayer1, currentLegendPlayer2);
                turn1=true;
                turn2=true;


            }
            else if (Stats.checkSpeed(currentLegendPlayer2, currentLegendPlayer1))
            {
                System.out.println(currentLegendPlayer2.getName()+" hits first! because " + currentLegendPlayer2.getName() + " 's speed is faster than " + currentLegendPlayer1.getName() + "'s speed.");
                System.out.println();
                attackPlayer1(move2, currentLegendPlayer2.getMoveset(), currentLegendPlayer1, currentLegendPlayer2);
                attackPlayer2(move1, currentLegendPlayer1.getMoveset(), currentLegendPlayer1, currentLegendPlayer2);
                turn1=true;
                turn2=true;
            }

        }
        //  Checks to see if player 1 has any alive legends if not decalres player 2 the winner
        if(hasAliveLegends(player1)==false)
        {
            System.out.println("Game over! Player 2 wins!");
            System.out.println("HAHA PLAYER 1 YOU SUCK HAHAHA");
            System.out.println();
        }
        //  checks to see if player 2 has any alive legends if not decalres player 1 the winner
        else if (hasAliveLegends(player2)==false)
        {
            System.out.println("Game over! Player 1 wins!");
            System.out.println("HAHA PLAYER 2 YOU SUCK HAHAHA");
            System.out.println();
        }
    }

    /**
     * shows all the legends that the player can pick 
     * Precondition charaters where already added to the ArrayList
     * postcondition the names of the legends and shown on screen
     * @param characterList The list of all the Legends
     */
    public static void showCharacterList(ArrayList<Legends> characterList)
    {
        for(int i = 0 ;i<characterList.size();i++)
        {
            System.out.print(characterList.get(i).getName());
            if(i<characterList.size()-1)
            {
                System.out.print(", ");
            }

        }
    }
    /**
     * Removes legend from arraylist after they get picked by the player
     * precondition CharacterList has Legends in it
     * postcondition displays all the legends except the picked ones
     * @param characterList The list of all the legends
     * @param legend The legend that will get removed from the list
     */
    public static void removeAlreadyPickedCharacterList(ArrayList<Legends> characterList,Legends legend)
    {
        for(int i = 0 ; i<characterList.size();i++)
        {
            if(legend==characterList.get(i))
            {
                characterList.remove(i);
            }
        }
    }

    /**
     * Lets user choose legends from characterList
     * precondition characterList has legends in it
     * post the chosen legends are returned if user miss types legends name null is returned instead
     * @param characterList The list of the legends
     * @return The chosen Legends 
     */
    public static Legends chooseLegend(ArrayList<Legends> characterList) {
        Scanner input = new Scanner(System.in);
        String legend = "";

        boolean validInput = false;
        while (!validInput) {
            legend = input.nextLine();

            for (int i = 0; i < characterList.size(); i++) {
                if (legend.equals(characterList.get(i).getName())) {
                    validInput = true;
                    return characterList.get(i);
                }
            }

            System.out.print("Invalid input! Please enter a valid legend name: ");
        }

        return null;
    }

    
    /**
     * Player 1 attacks player 2 with there selected move
     * Precondition there is another legend to hit and player 1 has a legend that can hit
     * postcondition attack is done and output is printed in terminal
     * @param move Move selcted by player 1
     * @param moveset List of avaliable move for player 1 to choose
     * @param legend Current legend of player 1
     * @param otherLegend Curerent legend of player 2
     */
    public static void attackPlayer2(int move,ArrayList<Move> moveset,Legends legend, Legends otherLegend)
    {
        for(int i = 0 ; i<moveset.size();i++)
        {
            if(move==i+1&&Legends.accuracyCheck(moveset.get(i).getAccuracy())==true)
            {
                int newHP = otherLegend.getStats().getHP()-Legends.calcDamage(i, legend,otherLegend);
                if(newHP<0)
                {
                    newHP=0;
                }
                otherLegend.getStats().setHP(newHP);
                System.out.println("Your move hit!");
                System.out.println("You delt " + Legends.calcDamage(i, legend,otherLegend) + " damage.");
                System.out.println();
                break;
            }
            else if(move==i+1&&Legends.accuracyCheck(moveset.get(i).getAccuracy())==false)
            {
                System.out.println("Your move missed! Try again next time!");
                System.out.println();
                return;
            }
        }
        System.out.println();
        System.out.println("The updated hp of Player 2 legend is " + otherLegend.getStats().getHP());
        System.out.println("The updated attack of Player 2 legend is " + otherLegend.getStats().getAttack());
        System.out.println("The updated speed of Player 2 legend is " + otherLegend.getStats().getSpeed());
        System.out.println("The updated defense of Player 2 legend is " + otherLegend.getStats().getDefense());
        System.out.println();
    }
    
    /**
     * Player 2 attacks player 1 with there selected move
     * Precondition there is another legend to hit and player 2 has a legend that can hit
     * postcondition attack is done and output is printed in terminal
     * @param move Move selcted by player 2
     * @param moveset List of avaliable move for player 2 to choose
     * @param legend Current legend of player 2
     * @param otherLegend Curerent legend of player 1
     */
    public static void attackPlayer1(int move, ArrayList<Move> moveset,Legends legend, Legends otherLegend)
    {
        for(int i = 0 ; i<moveset.size();i++)
        {
            if(move==i+1&&Legends.accuracyCheck(moveset.get(i).getAccuracy())==true)
            {
                int newHP = legend.getStats().getHP()-Legends.calcDamage(i, otherLegend,legend);
                if(newHP<0)
                {
                    newHP=0;
                }
                legend.getStats().setHP(newHP);
                System.out.println("Your move hit!");
                System.out.println("You delt " + Legends.calcDamage(i, otherLegend,legend) + " damage.");
                System.out.println();
                break;
            }
            else if(move==i+1&&Legends.accuracyCheck(moveset.get(i).getAccuracy())==false)
            {
                System.out.println("Your move missed! Try again next time!");
                System.out.println();
                return;
            }
        }
        System.out.println();
        System.out.println("The updated hp of Player 1 legend is " + legend.getStats().getHP());
        System.out.println("The updated attack of Player 1 legend is " + legend.getStats().getAttack());
        System.out.println("The updated speed of Player 1 legend is " + legend.getStats().getSpeed());
        System.out.println("The updated defense of Player 1 legend is " + legend.getStats().getDefense());
        System.out.println();
    }
    /**
     * Checks to see if player has any alive legends
     * precondition player has legends
     * postcondition returns true if player has 1 or more legends alive returns false if player has no legends
     * @param player the player to check
     * @return returns true if player has 1 or more legends alive returns false if player has no legends
     */
    public static boolean hasAliveLegends(Player player)
    {
        int elimination = 0;
        for(int i =0 ; i<player.getCharacter().length;i++)
        {
            if(player.getCharacter(i).getStats().getHP()<=0)
            {
                elimination++;
            }
        }
        if(elimination==3)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    /**
     * checks if current legend is alive
     * precondition the current legend exist
     * postcondition returns true if player current legends has more then 0 hp otherwise returns false
     * @param currentLegend The legend to check
     * @return returns true if player current legends has more then 0 hp otherwise returns false
     */
    public static boolean isCurrentLegendAlive(Legends currentLegend)
    {
        if(currentLegend.getStats().getHP()<=0)
        {
            return false; 
        }
        else
        {
            return true;
        }
    }
    /**
     * Swap players dead legend to alive legend in players list
     * precondition the player has legends
     * postconditions the player has an alive legend in the character list
     * the legends get swapped to first alive found legend 
     * if no alive legends are found then it print out that the player has no alive legends
     * @param player player to check
     */
    public static void swapToAliveLegend(Player player)
    {
        if(isCurrentLegendAlive(player.getCharacter(1)))
        {
            Legends temp = player.getCharacter(0);
            player.setCharacter(0, player.getCharacter(1));
            player.setCharacter(1, temp);
        }
        else if(isCurrentLegendAlive(player.getCharacter(2)))
        {
            Legends temp = player.getCharacter(0);
            player.setCharacter(0, player.getCharacter(2));
            player.setCharacter(2, temp);
        }
        else if(hasAliveLegends(player)==false)
        {
            System.out.println("You do not have any more legends that are alive!");
            System.out.println();
        }
    }
}