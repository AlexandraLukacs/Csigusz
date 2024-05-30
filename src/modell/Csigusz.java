package modell;

public class Csigusz {
    /* Adattagok */
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[33m";
    
    private String nev;
    private String szinKod;
    
    /* Generálható szinte minden tagfüggvény az adattagokból */
    /* ALT + INSERT */

//    public Csigusz() throws Exception {
//        this("cs-0");
//    }
    
    public Csigusz(String nev) throws Exception{
        this(nev, "fekete");
    }

    public Csigusz(String nev, String szin) throws Exception {
        setNev(nev);
        setSzin();
    }

    private void setNev(String nev) throws Exception {
        //this.nev = nev;
        /* Név ellenőrzése: az els betű legyen nagy --> csere, ha nem jó */
        if (nev.length() >= 3) {
            char nevElsoBetuje = nev.charAt(0);
            if (Character.isLowerCase(nevElsoBetuje)) {
                nevElsoBetuje = Character.toUpperCase(nevElsoBetuje);
                nev = nevElsoBetuje + nev.substring(1);
            }
            this.nev = nev;
        } else {
            throw new Exception("Rövid a név!");
        }
    }
    
    private void setSzin(){
        switch(szinKod){
            case "piros":
                this.szinKod = Csigusz.RED;
                break;
            case "kék":
                this.szinKod = Csigusz.BLUE;
                break;
            case "zöld":
                this.szinKod = Csigusz.GREEN;
                break;
        }
        
    }

    public String getNev() {
        return nev;
    }

    public String getSzin() {
        return szinKod;
    }
    
    @Override
    public String toString() {
        return szinKod + "Csigusz{" + "nev=" + nev + "," + "szin=" + szinKod + '}';
    }
    
}
