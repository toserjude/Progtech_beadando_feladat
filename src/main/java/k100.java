import java.util.Random;

public class k100 extends KockadobasStrategia {
    public int dobas() {
        Random r = new Random();
        int value = (r.nextInt(101 - 1) + 1);
        return value;
    }
}