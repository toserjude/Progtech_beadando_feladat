public class Karakter implements IKarakter {
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

    // kaszt specifikus értékek
    private int KE;
    private int TE;
    private int VE;
    private int CE;
    private int pszipont;
    private int manapont;

   // public Karakter(){};

    public Karakter(KasztStrategia kasztStrategia) {
        this.kasztStrategia = kasztStrategia;
        setEro();
        setGyorsasag();
        setAllokepesseg();
        setUgyesseg();
        setEgeszseg();
        setSzepseg();
        setIntelligencia();
        setAkaratero();
        setAsztral();

        this.ep = getEgeszseg() == 20 ? kasztStrategia.setEp() + 10 : kasztStrategia.setEp() +  getEgeszseg() % 10;
        this.fp = kasztStrategia.setFp() + (getAllokepesseg() % 10)  + (getAkaratero() % 10);
        this.KE = kasztStrategia.setKE();
        this.TE = kasztStrategia.setTE();
        this.VE = kasztStrategia.setVE();
        this.CE = kasztStrategia.setCE();
        this.pszipont = kasztStrategia.setPszipont();
        this.manapont = kasztStrategia.setManapont();
    }

    public void setEro() {
        this.ero = kasztStrategia.setEro();
    }

    public void setGyorsasag() {
        this.gyorsasag = kasztStrategia.setGyorsasag();
    }

    public void setAllokepesseg() {
        this.allokepesseg = kasztStrategia.setAllokepesseg();
    }

    public void setUgyesseg() {
        this.ugyesseg = kasztStrategia.setUgyesseg();
    }

    public void setEgeszseg() {
        this.egeszseg = kasztStrategia.setEgeszseg();
    }

    public void setSzepseg() {
        this.szepseg = kasztStrategia.setSzepseg();
    }

    public void setIntelligencia() {
        this.intelligencia = kasztStrategia.setIntelligencia();
    }

    public void setAkaratero() {
        this.akaratero = kasztStrategia.setAkaratero();
    }

    public void setAsztral() {
        this.asztral = kasztStrategia.setAsztral();
    }

    @Override
    public int getEro() {
        return ero;
    }

    @Override
    public int getGyorsasag() {
        return gyorsasag;
    }

    @Override
    public int getAllokepesseg() {
        return allokepesseg;
    }

    @Override
    public int getUgyesseg() {
        return ugyesseg;
    }

    @Override
    public int getEgeszseg() {
        return egeszseg;
    }

    @Override
    public int getSzepseg() {
        return szepseg;
    }

    @Override
    public int getIntelligencia() {
        return intelligencia;
    }

    @Override
    public int getAkaratero() {
        return akaratero;
    }

    @Override
    public int getAsztral() {
        return asztral;
    }

    @Override
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
