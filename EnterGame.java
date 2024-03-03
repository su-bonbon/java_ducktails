import greenfoot.*;  

/**
 * Write a description of class entryGame here.
 * 
 * @Sujin Lee
 * @1.0.11
 */
public class EnterGame extends World
{
    private static GreenfootSound bgm;
    public EnterGame()
    {
      super(30, 20, 20);  
      if (bgm != null) {
          bgm.stop();
          bgm.play();
      } else {
          bgm = new GreenfootSound("bgm.mp3");
          bgm.playLoop();
      }
      StartBtn startBtn = new StartBtn();
      HelpBtn helpBtn = new HelpBtn();
      addObject(startBtn, 10, 16);
      addObject(helpBtn, 18, 16);
    }
}
