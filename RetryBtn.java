import greenfoot.*;  

/**
 * Write a description of class RetryBtn here.
 * 
 * @Sujin Lee
 * @1.0.9
 */
public class RetryBtn extends Button
{
    public RetryBtn() {
        
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new EnterGame());
        }
    }
}
