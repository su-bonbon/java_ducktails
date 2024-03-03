import greenfoot.*;  

/**
 * Write a description of class gameOver here.
 * 
 * @Sujin Lee
 * @1.0.2
 */
public class GameOver extends World
{
    
    public GameOver()
    {
        super(30, 20, 20);
        GreenfootImage bg = new GreenfootImage("gameover.png");
        bg.scale(600, 400);
        setBackground(bg);
        
        RetryBtn retryBtn = new RetryBtn();
        HelpBtn helpBtn = new HelpBtn();
        addObject(retryBtn, 10, 16);
        addObject(helpBtn, 18, 16);
    }
}
