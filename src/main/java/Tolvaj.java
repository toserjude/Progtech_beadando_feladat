import java.util.Random;

public class Tolvaj extends KasztStrategia {

    private final Kockadobas kockadobas = new Kockadobas();

    public int setEro() { return kockadobas._3k6_2x(); }
    public int setGyorsasag() {return kockadobas._3k6_2x();};
    public int setAllokepesseg() {return kockadobas._k10_8_kf();};
    public int setUgyesseg() {return kockadobas._k6_12_kf();};
    public int setEgeszseg() {return kockadobas._3k6_2x();};
    public int setSzepseg() {return kockadobas._2k6_6();};
    public int setIntelligencia() {return kockadobas._2k6_6();};
    public int setAkaratero() {return kockadobas._3k6();};
    public int setAsztral() {return kockadobas._3k6_2x();};

    public int setEp(){return 4;};
    public int setFp(){return 5 + kockadobas.k6() + 3;};
    public int setKE(){return 8;};
    public int setTE(){return 17;};
    public int setVE(){return 72;};
    public int setCE() {return 10;};
    public int setPszipont(){return 0;};
    public int setManapont(){return 0;};
}
