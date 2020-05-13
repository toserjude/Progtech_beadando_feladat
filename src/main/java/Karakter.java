public class Karakter {
    // user által választott tulajdonságok
    private Fajok faj;
    private Kasztok kaszt;
    private KasztStrategia kasztStrategia;

    // kockadobással meghatározott tulajdonságok
    private int ero;
    private int gyorsasag;
    private int allokepesseg;
    private int ugyesseg;
    private int egeszseg;
    private int szepseg;
    private int intelligencia;
    private int akaratero;
    private int asztral;

    // számolt tulajdonságok
    private int ep;
    private int fp;
    private int KE;
    private int TE;
    private int VE;
    private int CE;
    private int pszipont;
    private int manapont;

    public Karakter(KasztStrategia kasztStrategia) {
        this.kasztStrategia = kasztStrategia;
        this.ero = kasztStrategia.setEro();
        this.gyorsasag = kasztStrategia.setGyorsasag();
        this.allokepesseg = kasztStrategia.setAllokepesseg();
        this.ugyesseg = kasztStrategia.setUgyesseg();
        this.egeszseg = kasztStrategia.setEgeszseg();
        this.szepseg = kasztStrategia.setSzepseg();
        this.intelligencia = kasztStrategia.setIntelligencia();
        this.akaratero = kasztStrategia.setAkaratero();
        this.asztral = kasztStrategia.setAsztral();

        this.ep = kasztStrategia.setEp() +  getEgeszseg() - 10;
        this.fp = kasztStrategia.setFp() + (getAllokepesseg() - 10)  + (getAkaratero() - 10);
        this.KE = kasztStrategia.setKE();
        this.TE = kasztStrategia.setTE();
        this.VE = kasztStrategia.setVE();
        this.CE = kasztStrategia.setCE();
        this.pszipont = kasztStrategia.setPszipont();
        this.manapont = kasztStrategia.setManapont();
    }

    public int getEro() {
        return ero;
    }

    public int getGyorsasag() {
        return gyorsasag;
    }

    public int getAllokepesseg() {
        return allokepesseg;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getEgeszseg() {
        return egeszseg;
    }

    public int getSzepseg() {
        return szepseg;
    }

    public int getIntelligencia() {
        return intelligencia;
    }

    public int getAkaratero() {
        return akaratero;
    }

    public int getAsztral() {
        return asztral;
    }

    public void printValues() {
        System.out.println("------------------ KOCKADOBÁS EREDMÉNYEK------------------------");
        System.out.println("ERŐ: " + getEro());
        System.out.println("GYORSASÁG: " + getGyorsasag());
        System.out.println("ÁLLÓKÉPESSÉG: " + getAllokepesseg());
        System.out.println("ÜGYESSÉG: " + getUgyesseg());
        System.out.println("EGESZSÉG: " + getEgeszseg());
        System.out.println("SZÉPSÉG: " + getSzepseg());
        System.out.println("INTELLIGENCIA: " + getIntelligencia());
        System.out.println("AKARATERŐ: " + getAkaratero());
        System.out.println("ASZTRÁL: " + getAsztral());
        System.out.println("------------------ SZÁMÍTOTT EREDMÉNYEK------------------------");
        System.out.println("EGÉSZSÉGPONT: " + getEp());
        System.out.println("FÁJDALOMTŰRÉS PONT: " + getFp());
        System.out.println("KEZDEMÉNYEZÉSI ÉRTÉK: " + getKE());
        System.out.println("TÁMADÓÉRTÉK: " + getTE());
        System.out.println("VÉDŐÉRTÉK: "+ getVE());
        System.out.println("CÉLZÓÉRTÉK: " + getCE());
        System.out.println("PSZI PONTOK: " + getPszipont());
        System.out.println("MANAPONTOK: " + getManapont());
    };

    public int getEp() {
        return ep;
    }

    public int getFp() {
        return fp;
    }

    public int getKE() {
        return KE;
    }

    public int getTE() {
        return TE;
    }

    public int getVE() {
        return VE;
    }

    public int getCE() {
        return CE;
    }

    public int getPszipont() {
        return pszipont;
    }

    public int getManapont() {
        return manapont;
    }
}
