import greenfoot.*;  
public class Champions extends Actor
{
    public Champions(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/12;
        int myNewWidth = (int)myImage.getWidth()/12;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        
    }
}
