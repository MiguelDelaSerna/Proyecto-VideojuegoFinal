import greenfoot.*;  
public class StartL3 extends World
{
    private GreenfootSound sound;
    private String song;
    
    public StartL3()
    {    
        super(600, 400, 1); 
        song = "levelup.mp3";
        sound = new GreenfootSound(song);
        prepare();
        
        Arrow arrow = new Arrow(7);
        addObject(arrow,550,350);
    }
    
    public void prepare(){
        sound.play();
        IntroL3 intro3 = new IntroL3();
        addObject(intro3,300,200);
        LevelThree level3 = new LevelThree();
        addObject(level3,300,50);
    }
}
