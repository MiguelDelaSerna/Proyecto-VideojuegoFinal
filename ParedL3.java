import greenfoot.*;  

public class ParedL3 extends Actor
{
    public ParedL3(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
