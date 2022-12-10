import greenfoot.*;  
import java.time.*;

public class L1Completed extends World
{
    MenuP menuP = new MenuP();
    private Instant start;
    private Instant finish;
    private static long t1;
    
    public L1Completed(Instant start,Instant finish)
    {    
        super(600, 400, 1);
        this.start = start;
        this.finish = finish;
        
        prepare();
        
        Arrow arrow = new Arrow(2);
        addObject(arrow,550,350);
        
        Total total = new Total(start,finish);
        t1=total.calculateTotal();
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(menuP)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Menu());
        }
    }
    
    public void prepare(){
        Greenfoot.playSound("levelup.mp3");
        addObject( new PlayerCompleted(),150,200);
        addObject( new Message(),350,120);
        MenuP menuP = new MenuP();
        addObject(menuP,450,350);
    }
    
    public static long getTime(){
        return t1;
    }
}
