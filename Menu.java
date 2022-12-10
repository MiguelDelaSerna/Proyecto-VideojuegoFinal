import greenfoot.*;

public class Menu extends World
{
    private GreenfootSound sound;
    private String song;
    Play play = new Play();
    Back back = new Back();
    private int opcion=0;
    private int y=200;
    String name;
    
    public Menu()
    {    
      
        super(600, 400, 1);
        song = "jungle.mp3";
        sound = new GreenfootSound(song);
        preparaMundo();
    }
    
    private void preparaMundo(){
        addObject(new Fondo(),300,200);
        addObject(play,300,200);
        addObject(new Controls(),300,250);
        addObject(new Records(),300,300);
        addObject(new Exit(),300,350);
    }
    
    public void act(){
        sound.play();
        if(Greenfoot.mouseClicked(play)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Historia());
            sound.stop();
        } 
    }
} 

    
  
