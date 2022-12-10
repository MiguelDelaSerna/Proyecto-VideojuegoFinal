import greenfoot.*;  
public class GameOver extends World
{
    Home home = new Home();
    private GreenfootSound sound;
    private String song;
    public GameOver()
    {    
        super(600, 400, 1); 
        song = "lost.mp3";
        sound = new GreenfootSound(song);
        prepareGameOver();
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(home)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Menu());
        }
    }
    
    public void prepareGameOver(){
        addObject(home,550,350);
        sound.play();
    }
}
