import greenfoot.*;  
public class StartL2 extends World
{
    private GreenfootSound sound;
    private String song;
    
    public StartL2()
    {    
        super(600, 400, 1); 
        song = "levelup.mp3";
        sound = new GreenfootSound(song);
        prepare();
        
        Arrow arrow = new Arrow(6);
        addObject(arrow,550,350);
    }
    
    public void prepare(){
        sound.play();
        IntroL2 intro2 = new IntroL2();
        addObject(intro2,300,200);
        LevelTwo level2 = new LevelTwo();
        addObject(level2,300,50);
        
        
    }
}
