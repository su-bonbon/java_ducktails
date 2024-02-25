import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeforeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeforeGame extends MyWorld
{

    /**
     * Constructor for objects of class BeforeGame.
     * 
     */
    public BeforeGame()
    {
       StartBtn startBtn = new StartBtn();
        HelpBtn helpBtn = new HelpBtn();
        addObject(startBtn, 200, 325);
        addObject(helpBtn, 400, 325);
    }
}
