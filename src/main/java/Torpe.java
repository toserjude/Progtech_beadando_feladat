public class Torpe extends FajDecorator {
    public Torpe(IKarakter karakter) {
        super(karakter);
    }

    @Override
    public int getEro(){return karakter.getEro() + 1;};

    @Override
    public int getGyorsasag(){return karakter.getGyorsasag();};

    @Override
    public int getAllokepesseg(){return karakter.getAllokepesseg() + 1;};

    @Override
    public int getUgyesseg(){return karakter.getUgyesseg();};

    @Override
    public int getEgeszseg(){return karakter.getEgeszseg() + 1;};

    @Override
    public int getSzepseg(){return karakter.getSzepseg() - 2;};

    @Override
    public int getIntelligencia(){return karakter.getIntelligencia() - 1;};

    @Override
    public int getAkaratero(){return karakter.getAkaratero();};

    @Override
    public int getAsztral(){return karakter.getAsztral() - 1;};

    @Override
    public void printValues() {karakter.printValues();};
}
