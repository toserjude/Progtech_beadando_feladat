import org.junit.Test;

public class KockadobasTeszt {
    @Test
    public void k6GivesValueBetweenZeroAnd6() {
        int dobas = Kockadobas.k6();
        assert dobas > 0 && dobas < 7;
    }

    @Test
    public void _3k6GivesValueBetween3And18() {
        int dobas = Kockadobas._3k6();
        assert dobas >= 2 && dobas <= 18;
    }

    @Test
    public void _2k6_6GivesValueBetween8And18() {
        int dobas = Kockadobas._2k6_6();
        assert dobas >= 8 && dobas <= 18;
    }
}
