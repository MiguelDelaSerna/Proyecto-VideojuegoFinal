import greenfoot.*;  

public class Spider extends Actor
{
    private static final int OFFSET = 2;
    private int xPosition;
    private int horizontalMove=2;
    private int offsetX = 0;
    private int offsetY = 0;
    
    public Spider(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/24;
        int myNewWidth = (int)myImage.getWidth()/24;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        move();
    }
    
    public void move(){
        xPosition=getX();
        
        Actor actor = getOneIntersectingObject (ParedL3.class);
        
        if((actor != null)){
            horizontalMove *= -1;
        }
        
        setLocation(xPosition - horizontalMove,getY());
    }
}
