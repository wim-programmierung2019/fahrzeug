
public class Kraftfahrzeug extends Fahrzeug {
    private int anzahlRaeder;
    
    public Kraftfahrzeug(String name){
        super(name);
    }
    
    public Kraftfahrzeug(String name, int raeder){
        super(name);
        anzahlRaeder = raeder;
    }
    
    public int getAnzahlRaeder(){
        return anzahlRaeder;
    }
    
    public void setAnzahlRaeder(int anzahl){
        anzahlRaeder = anzahl;
    }
}
