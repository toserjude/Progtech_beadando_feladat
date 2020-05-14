import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Add meg a karaktered nevét: ");
        String nev = input.next();
        try {
            System.out.println("Add meg a karaktered kasztját(elérhető kasztok: harcos, lovag, tolvaj, fejvadász, varázsló): ");
            Kasztok kaszt = Kasztok.valueOf(input.next());
            System.out.println("Add meg a karaktered faját (elérhető fajok: ember, elf, félelf, törpe, ork): ");
            Fajok faj = Fajok.valueOf(input.next());
            Creation.createCharacter(nev, kaszt, faj);
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
}
