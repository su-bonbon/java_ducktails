import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MomDuck here.
 * 
 * @Sujin Lee
 * @1.0.0
 */
public class MomDuck extends Duck
{
    /**
     * Act - do whatever the MomDuck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score;
    
    public void act()
    {
        eventListner();
        getWorld().showText("Score: " + score, 50, 20);
        
        if(isTouching(BabyDuck.class)) {
            //removeTouching(BabyDuck.class);
            Greenfoot.playSound("catch.mp4");
            score++;
            
        }
    }
    
    private void eventListner() {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if (mouseInfo != null) {
            // Get the current location of the mouse cursor
            int mouseX = mouseInfo.getX();
            int mouseY = mouseInfo.getY();
            
            // Update the location of the actor to follow the mouse
            setLocation(mouseX, mouseY);
        } 
    }
  
    
}
