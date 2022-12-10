import greenfoot.*; 


public class Coin extends Actor
{
    public Coin(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/18;
        int myNewWidth = (int)myImage.getWidth()/18;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        
    }
}
