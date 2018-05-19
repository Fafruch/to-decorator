class DekoratorPracaWSzczegolnychWarunkach extends AbstractPracownikDekorator {
    public DekoratorPracaWSzczegolnychWarunkach(AbstractPracownik pracownik) {
        super(pracownik);
    }

    @Override
    public String getOpis() {
        return pracownik.getOpis() + ", pracuje w szczegolnych warunkach";
    }

    @Override
    public double getWynagrodzenie() {
        return pracownik.getWynagrodzenie() + 1000;
    }
}