import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfterGame here.
 * 
 * @Sujin Lee
 * @1.0.1
 */
public class AfterGame extends MyWorld
{
    private GreenfootSound bgm;
    /**
     * Constructor for objects of class AfterGame.
     * 
     */
    public AfterGame()
    {
        bgm = new GreenfootSound("bgm1.mp3");
        GreenfootImage bg = new GreenfootImage("gameover.png");
        bg.scale(600, 400);
        setBackground(bg);
        StartBtn startBtn = new StartBtn();
        HelpBtn helpBtn = new HelpBtn();
        addObject(startBtn, 200, 325);
        addObject(helpBtn, 400, 325);
    }
}
