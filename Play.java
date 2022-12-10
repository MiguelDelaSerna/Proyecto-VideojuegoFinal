import greenfoot.*; 

public class Play extends Button
{
    public void clickButton()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Historia());
        }
    }
}
