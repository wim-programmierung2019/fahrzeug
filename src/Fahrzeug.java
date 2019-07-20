public class Fahrzeug {
    protected String name;
    
    public Fahrzeug(String startName){
        name = startName;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSicherheitsabstand(){
        return 3;
    }
    
    public String toString(){
        return name;
    }
}