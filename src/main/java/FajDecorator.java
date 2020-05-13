public abstract class FajDecorator implements IKarakter {
    protected IKarakter karakter;

    public FajDecorator(IKarakter karakter) {
        this.karakter = karakter;
    }
}
