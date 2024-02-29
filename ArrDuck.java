import greenfoot.*;
import java.util.LinkedList;

public class ArrDuck extends Actor {
    private int score = 0;
    private int speed = 1;
    private LinkedList<Duck> arr = new LinkedList<>();

    public ArrDuck() {
        MomDuck mom= new MomDuck();
        arr.add(mom);
    }

    public void act() {
        eventListner();
        move();
        getWorld().showText("Score: " + score, 50, 20);
        if (isTouching(CloneDuck.class)) {
            removeTouching(CloneDuck.class);
            Greenfoot.playSound("catch.mp4");
            score++;
            speed++;
            addClone();
            addBabyDuck();
        } else if (isAtEdge()) {
            PlayGame world = (PlayGame) getWorld();
            world.gameOver();
        }
    }

    private void eventListner() {
        if (Greenfoot.isKeyDown("right"))
            setRotation(0);
        if (Greenfoot.isKeyDown("left"))
            setRotation(180);
        if (Greenfoot.isKeyDown("up"))
            setRotation(270);
        if (Greenfoot.isKeyDown("down"))
            setRotation(90);
    }

    public void addClone() {
        CloneDuck dup = new CloneDuck();
        World world = getWorld();
        world.addObject(dup, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    public void addBabyDuck() {
        BabyDuck baby = new BabyDuck();
        arr.add(baby);
        // Add the BabyDuck to the world
        World world = getWorld();
        world.addObject(baby, getX(), getY());
    }

    public void move() {
        // Move the ArrDuck
        move(speed);
        moveLinkedList();
    }
    
    
    
    public void moveLinkedList() {
        int deltaX = getX() - getX();
        int deltaY = getY() - getY();
        if(this != null) {
            for (Duck duck : arr) {
                duck.setLocation(duck.getX() + deltaX, duck.getY() + deltaY);
            }
        }
    }
}
