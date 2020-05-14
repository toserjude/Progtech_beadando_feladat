import org.junit.Test;

public class LovagTest {

    @Test
    public void tesztLovagIsALovag() {
        Karakter tesztLovag = new Karakter(LovagFactory.LOVAG);

        assert tesztLovag.getEro() >= 14;
        assert tesztLovag.getGyorsasag() >= 3;
        assert tesztLovag.getAllokepesseg() >= 9;
        assert tesztLovag.getUgyesseg() >= 3;
        assert tesztLovag.getEgeszseg() >= 11;
        assert tesztLovag.getSzepseg() >= 8;
        assert tesztLovag.getIntelligencia() >= 8;
        assert tesztLovag.getAkaratero() >= 9;
        assert tesztLovag.getAsztral() >= 3;

        assert tesztLovag.getEp() >= 8;
        assert tesztLovag.getFp() >= 12;
        // kaszt specifikus értékek
        assert tesztLovag.getKE() == 5;
        assert tesztLovag.getTE() == 20;
        assert tesztLovag.getVE() == 75;
        assert tesztLovag.getCE() == 0;
        assert tesztLovag.getPszipont() == 0;
        assert tesztLovag.getManapont() == 0;

    }
}
