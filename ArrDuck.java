import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ArrDuck here.
 * 
 * @Sujin Lee
 * @1.0.3
 */

public class ArrDuck extends Actor
{
    /**
     * Act - do whatever the ArrDuck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score;
    private int speed = 3;
    private LinkedList<Duck> arr = new LinkedList<Duck>(); 
    
    public ArrDuck(MomDuck mom) {
        if (arr.isEmpty()) {
            this.arr.add(mom);
        }
    }
    
    public void act()
    {
        displayArr();
        eventListner();
        getWorld().showText("Score: " + score, 50, 20);
        if(isTouching(CloneDuck.class)) {
            removeTouching(CloneDuck.class);
            Greenfoot.playSound("catch.mp4");
            this.arr.add(new BabyDuck());
            score++;
            addClone();
            PlayGame world = (PlayGame)getWorld(); //Set location of function.
        } else if(isAtEdge()) {
            PlayGame world = (PlayGame)getWorld(); //Set location of function.
            world.gameOver();//Call gameOver function.
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
    
    public void addClone() {
        CloneDuck dup = new CloneDuck();
        
        World world = getWorld();
        world.addObject(dup, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
    
    public void displayArr() {
    // Starting x and y positions for the head
    int prevX = getX();
    int prevY = getY();
    
    // Loop through the array starting from the second element (index 1)
    for (int i = 1; i < arr.size(); i++) {
        // Get the current duck
        Duck duck = arr.get(i);
        
        // Calculate the position of the current duck relative to the previous duck
        int currentX = prevX;
        int currentY = prevY;
        
        // Move the current duck to the calculated position
        duck.setLocation(currentX-20, currentY-20);
        
        // Add the current duck to the world at the calculated position
        getWorld().addObject(duck, currentX, currentY);
        
        // Update the previous position for the next duck
        prevX = currentX;
        prevY = currentY;
    }
}


}
