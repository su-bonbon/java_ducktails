import greenfoot.*;  

/**
 * Write a description of class HelpOver here.
 * 
 * @Sujin Lee
 * @1.0.2
 */
public class HelpGame extends World
{
    RetryBtn retryBtn = new RetryBtn();
    StartBtn startBtn = new StartBtn();
    public HelpGame()
    {
        super(30, 20, 20);
    
        addObject(retryBtn, 10, 16);
        addObject(startBtn, 18, 16);
    }
}