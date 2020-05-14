import org.junit.Test;

public class VarazsloTest {
    @Test
    public void tesztVarazsloIsAVarazslo() {
        Karakter tesztVarazslo = new Karakter(new Varazslo());

        assert tesztVarazslo.getEro() >= 3;
        assert tesztVarazslo.getGyorsasag() >= 3;
        assert tesztVarazslo.getAllokepesseg() >= 3;
        assert tesztVarazslo.getUgyesseg() >= 3;
        assert tesztVarazslo.getEgeszseg() >= 3;
        assert tesztVarazslo.getSzepseg() >= 3;
        assert tesztVarazslo.getIntelligencia() >= 12;
        assert tesztVarazslo.getAkaratero() >= 12;
        assert tesztVarazslo.getAsztral() >= 12;

        assert tesztVarazslo.getEp() >= 3;
        assert tesztVarazslo.getFp() >= 3;
        // kaszt specifikus értékek
        assert tesztVarazslo.getKE() == 2;
        assert tesztVarazslo.getTE() == 15;
        assert tesztVarazslo.getVE() == 70;
        assert tesztVarazslo.getCE() == 0;
        assert tesztVarazslo.getPszipont() == 0;
        assert tesztVarazslo.getManapont() == 10;

    }
}
