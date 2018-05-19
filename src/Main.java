import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractPracownik pracownik;
        List<AbstractPracownik> pracownicy = new ArrayList<>();

        // Zwykly pracownik
        pracownik = new ZwyklyPracownik(3000);
        pracownicy.add(pracownik);

        // Pracownik pracujacy w szczegolnych warunkach
        pracownik = new ZwyklyPracownik(3000);
        pracownik = new DekoratorPracaWSzczegolnychWarunkach(pracownik);
        pracownicy.add(pracownik);

        // Pracownik pracujacy za granica, w szczegolnych warunkach, w specjalnej odziezy
        pracownik = new ZwyklyPracownik(3000);
        pracownik = new DekoratorPracaWSzczegolnychWarunkach(pracownik);
        pracownik = new DekoratorPracaZamiejscowa(pracownik);
        pracownik = new DekoratorSpecjalnaOdziez(pracownik);
        pracownicy.add(pracownik);


        for (int i = 0; i < pracownicy.size(); i++) {
            System.out.println("Pracownik nr " + (i + 1) + ":");
            System.out.println(pracownicy.get(i));
            System.out.println();
        }
    }
}
