public class Elf extends FajDecorator {
    public Elf(IKarakter karakter) {
        super(karakter);
    }

    @Override
    public int getEro(){return karakter.getEro() - 2 ;};

    @Override
    public int getGyorsasag(){return karakter.getGyorsasag() + 2;};

    @Override
    public int getAllokepesseg(){return karakter.getAllokepesseg() -1;};

    @Override
    public int getUgyesseg(){return karakter.getUgyesseg() + 1;};

    @Override
    public int getEgeszseg(){return karakter.getEgeszseg();};

    @Override
    public int getSzepseg(){return karakter.getSzepseg() + 1;};

    @Override
    public int getIntelligencia(){return karakter.getIntelligencia();};

    @Override
    public int getAkaratero(){return karakter.getAkaratero();};

    @Override
    public int getAsztral(){return karakter.getAsztral();};

    @Override
    public void printValues() {karakter.printValues();};
}
