import java.util.Random;

public class Kockadobas {
    public int k6() {
        Random r = new Random();
        int value = (r.nextInt(7 - 1) + 1);
        return value;
    }

    public int k10() {
        Random r = new Random();
        int value = (r.nextInt(7 - 1) + 1);
        return value;
    }

    public int k100() {
        Random r = new Random();
        int value = (r.nextInt(11 - 1) + 1);
        return value;
    }

    public int _3k6() {
        return k6() + k6() + k6();
    }

    public int _3k6_2x() {
        int elsoDobas = _3k6();
        int masodikDobas = _3k6();
        return Math.max(elsoDobas, masodikDobas);
    }

    public int _2k6_6() {
        return k6() + 6;
    }

    public int _2k6_6_kf() {
            int alap = _2k6_6();
            if (alap == 18) {
                return kf();
            }
            return alap;
    }

    public int _k6_12() {
        return k6() + 12;
    }
    public int _k6_12_kf() {
        int alap = _k6_12();
        if (alap == 18) {
            return kf();
        }
        return alap;
    }

    public int _k10_8() {
        return k10() + 8;
    }

    public int _k10_8_kf() {
        int alap = _k10_8();
        if (alap == 18) {
            return kf();
        }
        return alap;
    }

    public int _k10_10() {
        return k10() + 10;
    }


    public int kf() {
        int dobas = k100();
        if (dobas == 1) {
            return 0;
        } else if (dobas < 21) {
            return 18 - k6();
        } else if (dobas < 51) {
            return 17;
        } else if (dobas < 76) {
            return 18;
        } else if (dobas < 96) {
            return 19;
        } else {
            return 20;
        }
    }
}

