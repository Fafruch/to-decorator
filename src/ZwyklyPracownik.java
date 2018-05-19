class ZwyklyPracownik extends AbstractPracownik {
    private String opis = "Jestem zwyklym pracownikiem";

    public ZwyklyPracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public ZwyklyPracownik(double wynagrodzenie, String opis) {
        this.wynagrodzenie = wynagrodzenie;
        this.opis = opis;
    }

    @Override
    public String getOpis() {
        return opis;
    }

    @Override
    public double getWynagrodzenie() {
        return wynagrodzenie;
    }
}