import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class babyDuck here.
 * 
 * @Sujin Lee
 * @1.0.0
 */
public class BabyDuck extends Duck
{
    /**
     * Act - do whatever the babyDuck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        move(2);
        turn(Greenfoot.getRandomNumber(5));
        
        if (target != null && !isFollowing()) {
            if (isTouching(MomDuck.class)) {
                startFollowing();
            }
        }
        
        if (isFollowing()) {
            // Calculate the direction towards the target
            int dx = target.getX() - getX() - 20;
            int dy = target.getY() - getY() - 20;
            
            // Move towards the target
            setLocation(getX() + dx, getY() + dy);
        }
    }
    
    private Actor target; // The object to follow
    
    public BabyDuck() {
        this.target = target;
    }
    
    public BabyDuck(MomDuck target) {
        this.target = target;
    }
    
    private boolean isFollowing() {
        return target != null;
    }
    
    private void startFollowing() {
        // Start following the target
    }
    
    
    
}
