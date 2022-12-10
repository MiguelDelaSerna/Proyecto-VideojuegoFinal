import greenfoot.*;  
import java.time.*;

public class L2Completed extends World
{
    MenuP menuP = new MenuP();
    private Instant start;
    private Instant finish;
    private static long t2;
    
    Home home = new Home();
    
    public L2Completed(Instant start,Instant finish)
    {    
        super(600, 400, 1);
        this.start = start;
        this.finish = finish;
        prepare();
        
        Arrow arrow = new Arrow(3);
        addObject(arrow,550,350);
        
        Total total = new Total(start,finish);
        t2=total.calculateTotal();
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
        addObject( new Message2(),350,120);
        addObject(menuP,450,350);
    }
    
    public static long getTime(){
        return t2;
    }
}
