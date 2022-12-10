import greenfoot.*;  
import java.time.*;

public class L3Completed extends World
{
    private Instant start;
    private Instant finish;
    private static long t3;
    
    Home home = new Home();
    
    public L3Completed(Instant start,Instant finish)
    {    
        super(600, 400, 1);
        this.start = start;
        this.finish = finish;
        prepare();
        
        Arrow arrow = new Arrow(4);
        addObject(arrow,550,350);
        
        Total total = new Total(start,finish);
        t3=total.calculateTotal();
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(home)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Menu());
        }
    }
    
    public void prepare(){
        Greenfoot.playSound("levelup.mp3");
        addObject( new PlayerCompleted(),150,200);
        addObject( new MessageFinal(),350,120);
        addObject(home,450,350);
    }
    
    public static long getTime(){
        return t3;
    }
}