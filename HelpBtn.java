import greenfoot.*;  

/**
 * Write a description of class HelpBtn here.
 * 
 * @Sujin Lee
 * @1.0.9
 */
public class HelpBtn extends Button
{
    public HelpBtn() {
        
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HelpGame());
        }
    }
}
