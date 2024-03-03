import greenfoot.*;  

/**
 * Write a description of class momDuck here.
 * 
 * @Sujin Lee
 * @1.0.7
 */
public class MomDuck extends Duck
{
    private int SPEED = 7; 
    private int counter = 0; 
    private int speedDivision = 0;
    private int score = 0; 
    private boolean isOver = false;
    
    public MomDuck() {
        setRotation(Greenfoot.getRandomNumber(4)*90); 
    }
    public void act()
    {
        getWorld().showText("Score: " + score, 2, 0);
        if(!isOver) {
            moveMom();
        }
        
        if(isTouching(CloneDuck.class)) {
            removeTouching(CloneDuck.class); 
            score++; 
            PlayGame world = (PlayGame)getWorld(); 
            world.addClone(); 
            Greenfoot.playSound("catch.mp4"); 
            speedDivision++;  
        }
        
        if(speedDivision == 5) {
            speedDivision = 0;
            SPEED = SPEED - 1;
        }

        
        if(isTouching(EnemyDuck.class)) {
            PlayGame world = (PlayGame)getWorld();
            world.gameOver();
            isOver = true;
        }
        
        if (getX() > getWorld().getWidth() ||
            getX() < 0 ||
            getY() > getWorld().getHeight() ||
            getY() < 0) {
            PlayGame world = (PlayGame)getWorld();
            world.gameOver();
            isOver = true;
        }
        /*
        if(isTouching(BabyDuck.class)) {
            PlayGame world = (PlayGame)getWorld();
            world.gameOver();
            isOver = true;
        }
        */
    }
    
    public void moveMom()
    {
        counter ++; 
        
        if(counter==SPEED) {
            getWorld().addObject(new BabyDuck(score*SPEED), getX(), getY()); //Add a tail to the world in position of snakehead.
            move(1);
            counter = 0;
        } 
        
        if( Greenfoot.isKeyDown("up") ) {
            setRotation(270);
        }
        
        if( Greenfoot.isKeyDown("right") ) {
            setRotation(0);
        }
        
        if( Greenfoot.isKeyDown("down") ) {
            setRotation(90);
        }
        
        if( Greenfoot.isKeyDown("left") ) {
            setRotation(180);
        }
    }
}
