import greenfoot.*; 
 
public class Arrow extends Button
{
    private int value;
    private GreenfootSound sound;
    private String song;
    
    public Arrow(int value ){
        super();
        this.value = value;
        song = "boton.mp3";
        sound = new GreenfootSound(song);
        
        clickButton();
    }
    
    public void clickButton(){
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(10);
            switch(value){
                case 1:
                    sound.play();
                    Greenfoot.setWorld(new StartL1());
                    break;
                case 2:
                    sound.play();
                    Greenfoot.setWorld(new MissionCompleted(2));
                    break;
                case 3:
                    sound.play();
                    Greenfoot.setWorld(new MissionCompleted(3));
                    break;
                case 4:
                    sound.play();
                    Greenfoot.setWorld(new Finally(3));
                    break;
                case 5:
                    sound.play();
                    Greenfoot.setWorld(new Level1());
                    break;
                case 6:
                    sound.play();
                    Greenfoot.setWorld(new Level2());
                    break;
                case 7:
                    sound.play();
                    Greenfoot.setWorld(new Level3());
                    break;
                
            }
        }
    }
}
