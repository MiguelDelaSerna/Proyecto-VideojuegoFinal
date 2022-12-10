import greenfoot.*;  
import java.time.*;

public class Total extends Actor
{
    private Instant start;
    private Instant end;
    private long timeElapsed;
    
    public Total(Instant start, Instant end){
        this.start = start;
        this.end = end;
    }
    
    public long calculateTotal()
    {    
        timeElapsed = Duration.between(start,end).toMillis();
        
        return timeElapsed;
    }
}

