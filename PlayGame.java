import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Grass here.
 * 
 * @Sujin Lee
 * @1.0.0
 */
public class PlayGame extends MyWorld
{

    /**
     * Constructor for objects of class Grass.
     * 
     */
    private ArrDuck arr = new ArrDuck(new MomDuck());
    public PlayGame()
    {
        //ArrDuck arrDuck = new ArrDuck();
        addObject(arr, 300, 200);
        CloneDuck[] arrCloneDuck = new CloneDuck[3];
        for(int i = 0; i < 3; i++) {
            arrCloneDuck[i] = new CloneDuck();
            addObject(arrCloneDuck[i], Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
    
    }   
    
    public void gameOver() {
        Greenfoot.setWorld(new AfterGame());
        Greenfoot.playSound("gameover.mp4"); //Play game over sound when user dies.
        
    }
    
    
}
