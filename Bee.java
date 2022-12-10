import greenfoot.*; 

public class Bee extends Actor
{
    private int xPosition;
    private int horizontalMove=2;
    
    public Bee(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/20;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
   public void act(){
        move();
    }
    
    public void move(){
        xPosition=getX();
        
        Actor actor = getOneIntersectingObject (Pared.class);
        
        if((actor != null)){
            horizontalMove *= -1;
        }
        
        actor = getOneIntersectingObject (ParedL2.class);
        if((actor != null)){
            horizontalMove *= -1;
        }
        
        setLocation(xPosition - horizontalMove,getY());
    }
    
    
    
}
