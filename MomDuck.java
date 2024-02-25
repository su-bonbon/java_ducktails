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
    private int speed = 3;
    
    public void act()
    {
        eventListner();
        getWorld().showText("Score: " + score, 50, 20);
    
        if(isTouching(BabyDuck.class)) {
            removeTouching(BabyDuck.class);
            Greenfoot.playSound("catch.mp4");
            score++;
            addBaby();
            
        } else if(isAtEdge()) {
            PlayGame world = (PlayGame)getWorld(); //Set location of function.
            world.gameOver();//Call gameOver function.
            //Greenfoot.stop();
        }
    }
    
    private void eventListner() {
        move(speed);
        if(Greenfoot.isKeyDown("right"))
            setRotation(0);
        if(Greenfoot.isKeyDown("left"))
            setRotation(180);
        if(Greenfoot.isKeyDown("up"))
            setRotation(270);
        if(Greenfoot.isKeyDown("down"))
            setRotation(90);
            
    }
    
    public void addBaby() {
        BabyDuck dup = new BabyDuck();
        
        World world = getWorld();
        world.addObject(dup, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
  
    
    
}
