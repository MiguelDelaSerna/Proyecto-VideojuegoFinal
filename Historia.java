import greenfoot.*;  
public class Historia extends World
{ 
    
    public Historia()
    {    
        super(600, 400, 1); 
        Arrow arrow = new Arrow(1);
        addObject(arrow,550,350);
        MessageHistory message = new MessageHistory();
        addObject(message,200,150);
        PlayerCompleted player = new PlayerCompleted();
        addObject(player,500,200);
    }
}
