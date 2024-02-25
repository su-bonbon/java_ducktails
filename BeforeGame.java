import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeforeGame here.
 * 
 * @Sujin Lee
 * @1.0.2
 */
public class BeforeGame extends MyWorld
{
    private GreenfootSound bgm;
    /**
     * Constructor for objects of class BeforeGame.
     * 
     */
    public BeforeGame()
    {
        bgm = new GreenfootSound("bgm1.mp3");
       StartBtn startBtn = new StartBtn();
        HelpBtn helpBtn = new HelpBtn();
        addObject(startBtn, 200, 325);
        addObject(helpBtn, 400, 325);
    }
}
