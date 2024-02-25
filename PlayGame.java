import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    private GreenfootSound bgm;
    public PlayGame()
    {
        bgm = new GreenfootSound("bgm.mp3");
        MomDuck mom = new MomDuck();
        addObject(mom, 300, 200);
        BabyDuck[] arrBabyDuck = new BabyDuck[3];
        for(int i = 0; i < 3; i++) {
            arrBabyDuck[i] = new BabyDuck();
            addObject(arrBabyDuck[i], Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
    }
    
    public void gameOver() {
        Greenfoot.setWorld(new AfterGame());
        Greenfoot.playSound("gameover.mp4"); //Play game over sound when user dies.
        
    }
    
}
