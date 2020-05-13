import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Add meg a karaktered nevét: ");
        String nev = input.next();
        try {
            System.out.println("Add meg a karaktered kasztját(elérhető kasztok: harcos, lovag, tolvaj, fejvadász): ");
            Kasztok kaszt = Kasztok.valueOf(input.next());
            System.out.println("Add meg a karaktered faját (elérhető fajok: ember, elf, félelf, törpe, ork): ");
            Fajok faj = Fajok.valueOf(input.next());
            createCharacter(nev, kaszt, faj);
        } catch (Exception e) {
            System.out.println("Az elérhető fajok és kasztok közül adj meg egyet!");
            System.out.println("Az alkalmazás újraindul ");
            restart(args);
        }
    }

    private static void restart(String[] strArr)
    {
        main(strArr);
    }

    static void createCharacter(String nev, Kasztok kaszt, Fajok faj) {
        IKarakter karakterKaszttal = null;
        IKarakter karakterFajjal = null;

        switch (kaszt) {
            case harcos:
                karakterKaszttal = new Karakter(new Harcos());
                break;
            case fejvadász:
                karakterKaszttal = new Karakter(new Assassin());
                break;
            case tolvaj:
                karakterKaszttal = new Karakter(new Tolvaj());
                break;
            case lovag:
                karakterKaszttal = new Karakter( new Lovag());
                break;
        }

        switch (faj) {
            case elf:
                karakterFajjal = new Elf(karakterKaszttal);
                break;
            case félelf:
                karakterFajjal = new FelElf(karakterKaszttal);
                break;
            case törpe:
                karakterFajjal = new Torpe(karakterKaszttal);
                break;
            case ork:
                karakterFajjal = new Ork(karakterKaszttal);
                break;
            default:
                karakterFajjal = karakterKaszttal;
                break;
        }

        System.out.println("----------------------- KARAKTERLAP ----------------------------");
        System.out.println("NÉV: " + nev);
        System.out.println("FAJ: " + faj);
        System.out.println("KASZT: " + kaszt);
        karakterFajjal.printValues();
    }
}
