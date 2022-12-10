import greenfoot.*;  

public class Controls extends Actor
{

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Control());
        }
    }
}
