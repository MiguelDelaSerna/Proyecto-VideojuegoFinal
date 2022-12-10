import greenfoot.*;  

public class Pared extends Actor
{
    public Pared(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/7;
        int myNewWidth = (int)myImage.getWidth()/7;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        
    }
}
