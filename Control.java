import greenfoot.*;  

public class Control extends World
{
    Back back = new Back();
    
    public Control()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepareControls();
    }
    
    private void prepareControls(){
        addObject(new Up(),80,225);
        addObject(new Down(),230,225);
        addObject(new Left(),380,225);
        addObject(new Right(),530,225);
        addObject(back,30,30);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(back)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Menu());
        }
    }
}
