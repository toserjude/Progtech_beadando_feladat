public class FelElf extends FajDecorator{
    public FelElf(IKarakter karakter) {
        super(karakter);
    }

    @Override
    public int getEro(){return karakter.getEro() - 1 ;};

    @Override
    public int getGyorsasag(){return karakter.getGyorsasag() + 1;};

    @Override
    public int getAllokepesseg(){return karakter.getAllokepesseg();};

    @Override
    public int getUgyesseg(){return karakter.getUgyesseg();};

    @Override
    public int getEgeszseg(){return karakter.getEgeszseg();};

    @Override
    public int getSzepseg(){return karakter.getSzepseg();};

    @Override
    public int getIntelligencia(){return karakter.getIntelligencia();};

    @Override
    public int getAkaratero(){return karakter.getAkaratero();};

    @Override
    public int getAsztral(){return karakter.getAsztral();};

    @Override
    public void printValues() {karakter.printValues();};
}
