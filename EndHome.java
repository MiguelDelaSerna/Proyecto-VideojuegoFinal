import greenfoot.*;
import javax.swing.JOptionPane; 

public class EndHome extends Button
{
    
    private long totalTime;
    
    public void act()
    {
        clickButton();
    }
    
    public void clickButton(){
    totalTime=(L1Completed.getTime()+L2Completed.getTime()+L3Completed.getTime()/100);

        if(Greenfoot.mouseClicked(this)){
            String inputValue=JOptionPane.showInputDialog("Name:");

            Greenfoot.setWorld(new Record(inputValue,totalTime));
        }
    }
}