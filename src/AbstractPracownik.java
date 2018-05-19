public abstract class AbstractPracownik {
    protected String opis;
    protected double wynagrodzenie;

    public abstract String getOpis();

    public abstract double getWynagrodzenie();

    @Override
    public String toString() {
        return getOpis() + ". Zarabiam " + getWynagrodzenie();
    }
}
