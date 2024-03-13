import greenfoot.*;  

/**
 * Write a description of class gameOver here.
 * 
 * @Sujin Lee
 * @1.0.2
 */
public class GameOver extends World
{
    GreenfootImage bg = new GreenfootImage("gameover.png");
    
    RetryBtn retryBtn = new RetryBtn();
    HelpBtn helpBtn = new HelpBtn();
    public GameOver()
    {
        super(30, 20, 20);
        bg.scale(600, 400);
        setBackground(bg);
        addObject(retryBtn, 10, 16);
        addObject(helpBtn, 18, 16);
    }
}
