import greenfoot.*;  
public class Door extends Actor
{
    public Door(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        
    }
}
