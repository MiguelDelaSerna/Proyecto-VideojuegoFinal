import greenfoot.*;  
import java.time.*;
public class Level1 extends World
{
    private Instant start;
    private Instant finish;
    private long t1;
    
    Snake snake1 = new Snake();
    private Score score = new Score("Score : ");
    
    public Level1()
    {    
        super(600, 400, 1);
        preparaLevel1();
    }
    
    public void act(){
        if(score.getValue()==1150){
            finish = Instant.now();
  
            Greenfoot.setWorld(new L1Completed(start,finish));
        }
    }
    
    private void preparaLevel1(){
        start = Instant.now();
        addObject(new Player(),40,350);
        addObject(new Pared(),450,290);
        
        
        addObject(new Door(),580,50);
        
        addObject(new Coin(),135,140);
        addObject(new Coin(),160,140);
        addObject(new Coin(),400,350);
        addObject(new Coin(),430,350);
        addObject(new Coin(),460,350);
        addObject(new Coin(),490,350);
        
        addObject(new Coin(),100,350);
        addObject(new Coin(),130,350);
        addObject(new Coin(),160,350);
        
        
        addObject(new Coin(),50,190);
        addObject(new Coin(),50,160);
        addObject(new Coin(),50,130);
        addObject(new Coin(),50,100);
        
        
        addObject(new Coin(),380,160);
        addObject(new Coin(),410,160);
        addObject(new Coin(),315,330);
        addObject(new Coin(),315,360);
        
        addObject(new Coin(),110,50);
        addObject(new Coin(),140,50);
        addObject(new Coin(),170,50);
        addObject(new Coin(),200,50);
        
        
        addObject(new Snake(),450,50);
        addObject(new Snake(),555,240);
        addObject(new Snake(),50,245);
        addObject(new Snake(),245,355);
        
        for(int x = 15; x<700; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,10);
            pared = new Pared();
            addObject(pared,x,390);
        }
        
        for(int y = 30; y<600; y+=28){
            Pared pared = new Pared();
            addObject(pared,10,y);
        }
        
        for(int y = 90; y<600; y+=28){
            Pared pared = new Pared();
            addObject(pared,590,y);
        }
        
        for(int x = 90; x<200; x+=28){
            Pared pared = new Pared();
            addObject(pared,90,x);
            pared = new Pared();
            addObject(pared,200,x);
            pared = new Pared();
            addObject(pared,x,90);
            
        }
        
        for(int x = 90; x<130; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,200);
        }
        
        for(int y = 30; y<200; y+=28){
            Pared pared = new Pared();
            addObject(pared,500,y);
        }
        
        for(int y = 200; y<500; y+=28){
            Pared pared = new Pared();
            addObject(pared,280,y);
        }
        
        for(int x =30; x<150; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,280);
        }
        
        for(int y = 300; y<330; y+=35){
            Pared pared = new Pared();
            addObject(pared,215,y);
        }
        
        for(int y = 20; y<50; y+=28){
            Pared pared = new Pared();
            addObject(pared,280,y);
        }
        
        for(int x =230; x<450; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,120);
        }
        
        for(int y = 145; y<250; y+=28){
            Pared pared = new Pared();
            addObject(pared,350,y);
        }
        
        for(int y = 300; y<400; y+=28){
            Pared pared = new Pared();
            addObject(pared,350,y);
        }
        
        for(int x=350; x<520; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,315);
        }
        
        for(int x=350; x<520; x+=28){
            Pared pared = new Pared();
            addObject(pared,x,200);
        }
        
        addObject(score,550,15);
     
        }
}
