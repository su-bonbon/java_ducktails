import greenfoot.*;  

/**
 * Write a description of class babyDuck here.
 * 
 * @Sujin Lee
 * @1.0.2
 */
public class BabyDuck extends Duck
{
    private int age = 0; 
    private int lifeSpan; 
    
    public BabyDuck(int lifeSpan){
        this.lifeSpan = lifeSpan;
    }
    public void act()
    {
        if(age == lifeSpan){ 
            getWorld().removeObject(this);
        }
        age++; 
    }
}
