package kantor.office;

public enum Currency {

    COP("COP"),
    PLN("PLN"),
    EUR("EUR"),
    RUB("RUB");

    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
