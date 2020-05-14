import java.util.Random;

public class Tolvaj extends KasztStrategia {

    public int setEro() { return Kockadobas._3k6_2x(); }
    public int setGyorsasag() {return Kockadobas._3k6_2x();};
    public int setAllokepesseg() {return Kockadobas._k10_8_kf();};
    public int setUgyesseg() {return Kockadobas._k6_12_kf();};
    public int setEgeszseg() {return Kockadobas._3k6_2x();};
    public int setSzepseg() {return Kockadobas._2k6_6();};
    public int setIntelligencia() {return Kockadobas._2k6_6();};
    public int setAkaratero() {return Kockadobas._3k6();};
    public int setAsztral() {return Kockadobas._3k6_2x();};

    public int setEp(){return 4;};
    public int setFp(){return 5 + Kockadobas.k6() + 3;};
    public int setKE(){return 8;};
    public int setTE(){return 17;};
    public int setVE(){return 72;};
    public int setCE() {return 10;};
    public int setPszipont(){return 0;};
    public int setManapont(){return 0;};
}
