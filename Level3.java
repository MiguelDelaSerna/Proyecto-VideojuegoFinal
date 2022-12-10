import greenfoot.*;  
import java.time.*;

public class Level3 extends World
{
    private Instant start;
    private Instant finish;
    private long t3;
    Score score = new Score("Score: ");
    public Level3()
    {    
        
        super(600, 400, 1); 
        prepareLevel3();
    }
    
    public void act(){
        if(score.getValue()==1350){
            finish = Instant.now();
  
            Greenfoot.setWorld(new L3Completed(start,finish));
        }
    }
    
    private void prepareLevel3(){
         start = Instant.now();
        addObject(new Player2(),40,350);
        addObject(new Door(),590,360);
        
        addObject(new Coin(),80,60);
        addObject(new Coin(),105,60);
        addObject(new Coin(),55,60);
        
        addObject(new Coin(),50,250);
        addObject(new Coin(),50,220);
        addObject(new Coin(),50,280);
        
        addObject(new Coin(),135,250);
        addObject(new Coin(),135,280);
        addObject(new Coin(),135,310);
        addObject(new Coin(),135,340);
        
        addObject(new Coin(),315,300);
        addObject(new Coin(),315,330);
        addObject(new Coin(),315,360);
        
        addObject(new Coin(),500,300);
        addObject(new Coin(),500,330);
        addObject(new Coin(),500,360);
        
        addObject(new Coin(),190,60);
        addObject(new Coin(),190,90);
        
        addObject(new Coin(),320,60);
        addObject(new Coin(),350,60);
        addObject(new Coin(),380,60);
        addObject(new Coin(),410,60);
        
        addObject(new Coin(),520,60);
        addObject(new Coin(),520,90);
        addObject(new Coin(),520,120);
        
        
        addObject(new Spider(),280,150);
        addObject(new Spider(),500,140);
        addObject(new Spider(),350,210);
        addObject(new Spider(),130,340);
        addObject(new Spider(),300,350);
        
        for(int x = 15; x<700; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,10);
            paredl3 = new ParedL3();
            addObject(paredl3,x,390);
        }
        
        for(int y = 30; y<600; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,10,y);
        }
        
        for(int y = 40; y<325; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,590,y);
        }
        
        
        for(int y = 30; y<100; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,460,y);
        }
        
        for(int y = 200; y<500; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,90,y);
        }
        
        for(int y = 200; y<300; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,180,y);
        }
        
        for(int y = 40; y<120; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,150,y);
        }
        
        for(int y = 40; y<110; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,230,y);
        }
        
        for(int y = 290; y<500; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,260,y);
        }
        
        for(int y = 290; y<500; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,450,y);
        }
        
        for(int y = 100; y<180; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,320,y);
        }
        
        for(int y = 260; y<310; y+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,370,y);
        }
        
        for(int x=120; x<150; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,200);
        }
        
        for(int x=100; x<150; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,100);
        }
        
        for(int x=350; x<470; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,100);
        }
        
        for(int x=260; x<350; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,260);
        }
        
        for(int x=450; x<520; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,260);
        }
        
        for(int x=420; x<580; x+=28){
            ParedL3 paredl3 = new ParedL3();
            addObject(paredl3,x,180);
        }
        addObject(score,550,15);
    }
}
