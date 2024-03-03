import greenfoot.*;  

/**
 * Write a description of class playGame here.
 * 
 * @Sujin Lee
 * @1.0.7
 */
public class PlayGame extends World
{
    
    public PlayGame()
    {
        super(30, 20, 20, false); 
        addObject(new MomDuck(), getWidth()/2, getHeight()/2); //Place snakePiece in random spot.
        CloneDuck[] arrCloneDuck = new CloneDuck[5];
        for (int i = 0; i < arrCloneDuck.length; i++) {
            arrCloneDuck[i] = new CloneDuck();
            addObject(arrCloneDuck[i], Greenfoot.getRandomNumber(30) , Greenfoot.getRandomNumber(20));
        }
    }
    
    public void addClone()
    {
        if(Greenfoot.getRandomNumber(2) == 1) {
            addObject(new EnemyDuck(), Greenfoot.getRandomNumber(30) , Greenfoot.getRandomNumber(20));
        } else {
            
            addObject(new CloneDuck(), Greenfoot.getRandomNumber(30) , Greenfoot.getRandomNumber(20));
        }
    }
    
    public void gameOver()
    {
        Greenfoot.setWorld(new GameOver());
        Greenfoot.playSound("gameover.mp4"); //Play game over sound when user dies.
        
    }
}
