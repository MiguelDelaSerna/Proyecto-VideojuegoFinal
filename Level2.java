import greenfoot.*;  
import java.time.*;

public class Level2 extends World
{
    private Instant start;
    private Instant finish;
    private long t2;
    Score score = new Score("Score: ");
    
    public Level2()
    {   
        super(600, 400, 1); 
        prepareLevel2();
    }
    
    public void act(){
        if(score.getValue()==1000){
            finish = Instant.now();
  
            Greenfoot.setWorld(new L2Completed(start,finish));
        }
    }
    
    private void prepareLevel2(){
        start = Instant.now();
        addObject(new Player1(),60,50);
        addObject(new Door(),580,320);
        
        
        addObject(new Bee(),220,150);
        addObject(new Bee(),300,70);
        addObject(new Bee(),70,328);
        addObject(new Bee(),470,230);
        
        for(int x = 120; x<200; x+=28){
            Coin coin = new Coin();
            addObject(coin,x,220);
        }
        
        for(int x = 300; x<400; x+=28){
            Coin coin = new Coin();
            addObject(coin,x,330);
        }
        
        for(int x = 270; x<350; x+=28){
            Coin coin = new Coin();
            addObject(coin,x,100);
        }
        
        for(int y = 170; y<250; y+=28){
            Coin coin = new Coin();
            addObject(coin,370,y);
        }
        
        for(int y = 170; y<300; y+=28){
            Coin coin = new Coin();
            addObject(coin,460,y);
        }
        
        for(int x = 15; x<700; x+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,x,20);
            paredL2 = new ParedL2();
            addObject(paredL2,x,370);
        }
        
        for(int y = 50; y<350; y+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,20,y);
        }
        
        for(int y = 50; y<300; y+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,580,y);
        }
        
        for(int x = 50; x<130; x+=28){
            ParedL2 paredl2 = new ParedL2();
            addObject(paredl2,200,x);
            paredl2 = new ParedL2();
            addObject(paredl2,x,150);
            
        }
        
        for(int x = 90; x<300; x+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,x,250);
        }
        
        for(int y = 140; y<300; y+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,330,y);
        }
        
        for(int y = 110; y<350; y+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,420,y);
        }
        
        for(int x = 450; x<510; x+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,x,100);
        }
        
        for(int x = 500; x<580; x+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,x,170);
        }
        
        for(int x = 500; x<580; x+=28){
            ParedL2 paredL2 = new ParedL2();
            addObject(paredL2,x,280);
        }
        addObject(score,550,15);
        
    }
}
