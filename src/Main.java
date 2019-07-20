public class Main {
    
    /**
     * Fahrzeug Beispiel
     */
    public static void main(String[] args){
        

        Kraftfahrzeug meinAuto = new Kraftfahrzeug("Fiat");
        meinAuto.setAnzahlRaeder(4);
        System.out.println(meinAuto.getName());
        System.out.println(meinAuto.getAnzahlRaeder());
        System.out.println(meinAuto.getSicherheitsabstand());

        
        Fahrzeug meinBoot = new Wasserfahrzeug("Aida");
        ((Wasserfahrzeug) meinBoot).setLaenge(10);
        System.out.println(meinBoot.getSicherheitsabstand());
    }
    
}
