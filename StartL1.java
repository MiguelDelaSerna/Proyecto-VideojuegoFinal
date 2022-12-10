import greenfoot.*;  
public class StartL1 extends World
{
    
    public StartL1()
    {   
        super(600, 400, 1);
        Greenfoot.playSound("levelup.mp3");
        
        prepare();
        
        Arrow arrow = new Arrow(5);
        addObject(arrow,550,350);
    }
    
    public void prepare(){
        IntroL1 intro1 = new IntroL1();
        addObject(intro1,300,200);
        LevelOne level1 = new LevelOne();
        addObject(level1,300,50);
    }
}
