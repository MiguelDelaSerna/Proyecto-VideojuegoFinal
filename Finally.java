import greenfoot.*;  
import java.time.*;   

public class Finally extends World
{
    private int levelRestart;
    private Instant start;
    private Instant end;
    private static long t3;
    EndHome endhome = new EndHome();
    private GreenfootSound sound;
    private String song;
    
    public Finally(int levelRestart)
    {    
        super(600, 400, 1);
        this.start = start;
        this.end = end;
        
        song = "levelup.mp3";
        sound = new GreenfootSound(song);
        prepare();
        
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(endhome)){
            Greenfoot.playSound("boton.mp3");
        }
    }
    
    public void prepare(){
        sound.play();
        addObject(new Message3(),300,100);
        MenuP menuP = new MenuP();
        addObject(menuP,550,270);
        addObject(endhome,550,350);
        
        Auro auro = new Auro();
        addObject(auro,300,300);
    }
}
