class DekoratorPracaZamiejscowa extends AbstractPracownikDekorator {
    public DekoratorPracaZamiejscowa(AbstractPracownik pracownik) {
        super(pracownik);
    }

    @Override
    public String getOpis() {
        return pracownik.getOpis() + ", pracuje za granica";
    }

    @Override
    public double getWynagrodzenie() {
        return pracownik.getWynagrodzenie() + 1500;
    }
}