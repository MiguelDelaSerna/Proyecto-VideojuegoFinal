import greenfoot.*;  
import java.time.*;

public class Player2 extends Actor
{
    private static final int OFFSET = 2;
    
    private int offsetX = 0;
    private int offsetY = 0;
    public int score;
    private int life =100;
    
    public Player2(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        if(life==0){
            Greenfoot.setWorld(new GameOver());
        }
       showHud();
       Movement();
       moveIfNoCollision(offsetX, offsetY);
       eatItems();
    }
    
    private void showHud(){
        getWorld().showText(Integer.toString(life), 70, 15);
        getWorld().showText("Life: ", 30, 15);
    }
    
   
    private void Movement(){
        
        if(Greenfoot.isKeyDown("Right")){
            offsetY = 0;
            offsetX = OFFSET;
        } else if(Greenfoot.isKeyDown("Left")){
            offsetY = 0;
            offsetX = -OFFSET; 
        } else if(Greenfoot.isKeyDown("Up")){
            offsetX = 0;
            offsetY = -OFFSET;
        } else if(Greenfoot.isKeyDown("Down")){
            offsetX = 0;
            offsetY = OFFSET;
        }
    }
    
    private void moveIfNoCollision(int dx, int dy){
        if(this.getOneObjectAtOffset(dx *4, dy*10, ParedL3.class) == null){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    
    private void eatItems(){
        if(isTouching(Coin.class)){
            Score score = (Score) getWorld().getObjects(Score.class).get(0);
            score.add(50);
            removeTouching(Coin.class);
        }
        
        if(isTouching(Spider.class)){
            life-=1;
        }
        
        if(isTouching(Door.class)){
            Score score = (Score) getWorld().getObjects(Score.class).get(0);
            score.add(100);
            removeTouching(Door.class);
        }
    }
}
