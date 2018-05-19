abstract class AbstractPracownikDekorator extends AbstractPracownik {
    protected AbstractPracownik pracownik;

    public AbstractPracownikDekorator(AbstractPracownik pracownik) {
        this.pracownik = pracownik;
    }

    @Override
    public abstract String getOpis();

    @Override
    public abstract double getWynagrodzenie();
}