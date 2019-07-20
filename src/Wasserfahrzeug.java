
public class Wasserfahrzeug extends Fahrzeug {
    private int laenge;
    
    public Wasserfahrzeug(String name){
        super(name);

    }
    
    public void setLaenge(int neueLaenge){
        laenge = neueLaenge;
        name = "irgendwas";
    }
    
    public int getSicherheitsabstand(){
        return laenge * 2;
    }
}
