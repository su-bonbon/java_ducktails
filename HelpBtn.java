import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpBtn here.
 * 
 * @Sujin Lee
 * @1.0.1
 */
public class HelpBtn extends Btn
{
    /**
     * Act - do whatever the HelpBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HelpDesc());
        }
    }
}
