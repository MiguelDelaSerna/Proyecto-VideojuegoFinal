import greenfoot.*;  

public class Snake extends Actor
{
    private int xPosition;
    private int horizontalMove=2;
    
    public Snake(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/55;
        int myNewWidth = (int)myImage.getWidth()/55;
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
