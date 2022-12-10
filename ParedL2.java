import greenfoot.*;  
public class ParedL2 extends Actor
{
    public ParedL2(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/20;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        
    }
}
