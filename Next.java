import greenfoot.*;

public class Next extends Button
{
    private int level;
    
    public Next(int level)
    {    
        super(); 
        this.level = level;
        clickButton();
    }
    
    public void clickButton(){
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(10);
            switch(level){
                case 0:
                    Greenfoot.setWorld(new Menu());
                    break;
                case 1:
                    Greenfoot.setWorld(new StartL1());
                    break;
                case 2:
                    Greenfoot.setWorld(new StartL2());
                    break;
                case 3:
                    Greenfoot.setWorld(new StartL3());
                    break;
            }
        }
    }
}
