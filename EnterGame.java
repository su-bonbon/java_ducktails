import greenfoot.*;  

/**
 * 
 * @Sujin Lee
 * @1.0.11
 */
public class EnterGame extends World
{
    private static GreenfootSound bgm;
    private StartBtn startBtn = new StartBtn();
    private HelpBtn helpBtn = new HelpBtn();
    
    public EnterGame()
    {
      super(30, 20, 20);  
      if (bgm != null) {
          bgm.stop();
          bgm.playLoop();
      } else {
          bgm = new GreenfootSound("bgm.mp3");
          bgm.playLoop();
      }
      addObject(startBtn, 10, 16);
      addObject(helpBtn, 18, 16);
    }
}
