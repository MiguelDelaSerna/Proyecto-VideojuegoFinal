import greenfoot.*;  
import java.util.*;
import java.io.*;
import java.io.BufferedWriter;

public class Record extends World
{
    private List<Jugador> listaJugador = new LinkedList<>();
    private String text;
    private long time;
    private int y = 150;
    private int TamList;
    Back back = new Back();
    public Record()
    {    
        super(600, 400, 1); 
        prepareRecords();
    }
    
    public void prepareRecords(){
        addObject(new Champions(),300,50);
        addObject(back,550,350);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(back)){
            Greenfoot.playSound("boton.mp3");
            Greenfoot.setWorld(new Menu());
        }
        
        
    }
    
    public Record(String name,long totalTime)
    {    
        super(600, 400,1);

        Jugador newJugador = new Jugador(name,totalTime);

        listaJugador.add(newJugador);
        
        try{
            guardar(listaJugador);
        }catch (IOException ioe){
        }

        try{
            listaJugador=this.leer();
        }catch(IOException ex){

        }
        
        listaJugador.sort(Comparator.comparingLong(Jugador::getTotalTime));

        if(listaJugador.size()<=5){
            for(int i=0;i<listaJugador.size();i++){
                text=listaJugador.get(i).getNombre();
                time=listaJugador.get(i).getTotalTime();
                Jugador imprimeJugador = new Jugador();
                imprimeJugador.setImage(new GreenfootImage(""+text+" - "+time+" score",30,Color.WHITE,Color.BLUE));
                addObject(imprimeJugador,280,150+(50*i));
            }
        }else{
            TamList=listaJugador.size()-5;
            for(int i=TamList-1;i<listaJugador.size()-1;i++){
                text=listaJugador.get(i).getNombre();
                time=listaJugador.get(i).getTotalTime();
                Jugador imprimeJugador = new Jugador();
                imprimeJugador.setImage(new GreenfootImage(""+text+" - "+time+" score",30,Color.WHITE,Color.BLUE));
                addObject(imprimeJugador,280,150+(50*(i-TamList+1)));
            }
        }
        prepareRecords();
    }

    private void guardar(List<Jugador> listaJugador) throws IOException{
        File archivo=new File("Jugadores.txt");

        FileWriter escritorAlArchivo = new FileWriter(archivo,true);

        BufferedWriter escritorAlBuffer = new BufferedWriter(escritorAlArchivo);

        for(Jugador jugador:listaJugador){
            escritorAlBuffer.write(jugador.getNombre()+","+jugador.getTotalTime()+"\n");
        }
        escritorAlBuffer.close();
    }

    public static List<Jugador> leer() throws IOException, FileNotFoundException{
        File archivo=new File("Jugadores.txt");

        FileReader lectorDelArchivo = new FileReader(archivo);

        BufferedReader lectorDelBuffer = new BufferedReader(lectorDelArchivo);

        List<Jugador> listaJugadores = new LinkedList<>();

        String linea = null;

        do{
            linea=lectorDelBuffer.readLine();
            if(linea!=null){
                String[] vectorCadena = linea.split(",");
                listaJugadores.add(new Jugador(vectorCadena[0],Long.parseLong(vectorCadena[1])));
            }
        }while(linea!=null);

        lectorDelBuffer.close();

        return listaJugadores;
    }
}
