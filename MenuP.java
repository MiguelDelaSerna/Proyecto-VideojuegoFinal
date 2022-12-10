import greenfoot.*;

public class MenuP extends Button
{
    public void clickButton(){

        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(10);
            Greenfoot.setWorld(new Menu());
        }
    }
}
