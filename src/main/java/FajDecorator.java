public abstract class FajDecorator implements IKarakter {
    protected IKarakter karakter;

    public FajDecorator(IKarakter karakter) {
        this.karakter = karakter;
    }

//    @Override
//    public int getEro(){return 0;};
//
//    @Override
//    public int getGyorsasag(){return 0;};
//
//    @Override
//    public int getAllokepesseg(){return 0;};
//
//    @Override
//    public int getUgyesseg(){return 0;};
//
//    @Override
//    public int getEgeszseg(){return 0;};
//
//    @Override
//    public int getSzepseg(){return 0;};
//
//    @Override
//    public int getIntelligencia(){return 0;};
//
//    @Override
//    public int getAkaratero(){return 0;};
//
//    @Override
//    public int getAsztral(){return 0;};
}
