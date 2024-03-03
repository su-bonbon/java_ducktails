import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyDuck here.
 * 
 * @Sujin Lee
 * @2.0.1
 */
public class EnemyDuck extends Duck
{
    private boolean isOver = false;
    
    public EnemyDuck() {
        turn(Greenfoot.getRandomNumber(360));  //add dynamic
    }
    
    public void act()
    {
        if(!isOver) {
            if(getX() > getWorld().getWidth() ||
            getX() < 0 ||
            getY() > getWorld().getHeight() ||
            getY() < 0) {
                setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 
                            Greenfoot.getRandomNumber(getWorld().getHeight()));
            }
            if(Greenfoot.getRandomNumber(10) == 1 && !isOver) {
                turn(Greenfoot.getRandomNumber(4)*90);
                move(1);
            }
        } 
        
        if(getWorld() instanceof GameOver) {
            isOver = true;
        }
        
    }
}
