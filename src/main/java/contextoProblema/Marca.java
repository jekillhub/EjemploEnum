package contextoProblema;

public enum Marca {
    FORD("Ford"),
    NISSAN("Nissan"),
    MERCEDES("Mercedes Benz"),
    PEUGEOT("Peugeot");

    private final String marca;

    Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
