import greenfoot.*;  

/**
 * Write a description of class StartBtn here.
 * 
 * @Sujin Lee
 * @1.0.9
 */
public class StartBtn extends Button
{
    public StartBtn() {
        
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PlayGame());
        }
    }
}
