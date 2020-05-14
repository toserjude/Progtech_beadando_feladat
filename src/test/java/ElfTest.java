import org.junit.Before;
import org.junit.Test;

public class ElfTest {
    @Test
    public void elfDecoratorWorksWell() {
        Karakter tesztLovag = new Karakter(LovagFactory.LOVAG);

        int ero = tesztLovag.getEro();
        int gyorsasag = tesztLovag.getGyorsasag();
        int allokepesseg = tesztLovag.getAllokepesseg();
        int ugyesseg = tesztLovag.getUgyesseg();
        int szepseg = tesztLovag.getSzepseg();

        IKarakter tesztElf = new Elf(tesztLovag);

        assert tesztElf.getEro() == ero - 2;
        assert tesztElf.getGyorsasag() == gyorsasag + 2;
        assert tesztElf.getAllokepesseg() == allokepesseg - 1;
        assert tesztElf.getUgyesseg() == ugyesseg + 1;
        assert tesztElf.getSzepseg() == szepseg + 1;
    }
}
