public class Creation {
    static void createCharacter(String nev, Kasztok kaszt, Fajok faj) {
        IKarakter alapKarakter = null;
        IKarakter dekoráltKarakter;

        switch (kaszt) {
            case harcos:
                alapKarakter = new Karakter(new Harcos());
                break;
            case fejvadász:
                alapKarakter = new Karakter(new Assassin());
                break;
            case tolvaj:
                alapKarakter = new Karakter(new Tolvaj());
                break;
            case lovag:
                alapKarakter = new Karakter( new Lovag());
                break;
            case varázsló:
                alapKarakter = new Karakter( new Varazslo());
                break;
        }

        switch (faj) {
            case elf:
                dekoráltKarakter = new Elf(alapKarakter);
                break;
            case félelf:
                dekoráltKarakter = new FelElf(alapKarakter);
                break;
            case törpe:
                dekoráltKarakter = new Torpe(alapKarakter);
                break;
            case ork:
                dekoráltKarakter = new Ork(alapKarakter);
                break;
            default:
                dekoráltKarakter = alapKarakter;
                break;
        }

        System.out.println("----------------------- KARAKTERLAP ----------------------------");
        System.out.println("NÉV: " + nev);
        System.out.println("FAJ: " + faj);
        System.out.println("KASZT: " + kaszt);
        System.out.println("SZINT: 1");
        dekoráltKarakter.printValues();
    }
}
