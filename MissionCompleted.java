import greenfoot.*;  

public class MissionCompleted extends World
{
    private int nextLevel;
        
    public MissionCompleted(int nextLevel)
    {    
        super(600, 400, 1); 
        this.nextLevel=nextLevel;
        prepare();
    }
    
    private void prepare()
    {
        Next next = new Next(nextLevel);
        addObject(next,500,360);
    
        MenuP menuP = new MenuP();
        addObject(menuP,500,303);
        
        Completed mission = new Completed();
        addObject(mission,300,150);
        
    }
}
