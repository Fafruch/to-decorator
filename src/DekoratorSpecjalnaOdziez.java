class DekoratorSpecjalnaOdziez extends AbstractPracownikDekorator {
    public DekoratorSpecjalnaOdziez(AbstractPracownik pracownik) {
        super(pracownik);
    }

    @Override
    public String getOpis() {
        return pracownik.getOpis() + ", musze pracowac w specjalnej odziezy";
    }

    @Override
    public double getWynagrodzenie() {
        return pracownik.getWynagrodzenie() + 200;
    }
}