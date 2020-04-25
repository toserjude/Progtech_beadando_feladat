import java.util.Random;

public class k10 extends KockadobasStrategia {
    public int dobas() {
        Random r = new Random();
        int value = (r.nextInt(11 - 1) + 1);
        return value;
    }
}