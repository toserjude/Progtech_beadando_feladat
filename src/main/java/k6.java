import java.util.Random;

public class k6 extends KockadobasStrategia {
    public int dobas() {
        Random r = new Random();
        int value = (r.nextInt(7 - 1) + 1);
        return value;
    }
}
