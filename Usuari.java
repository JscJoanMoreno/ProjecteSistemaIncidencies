public final class Usuari extends Persona {
    private String tipus;

    public Usuari(int id, String nom, String tipus) {
        super(id, nom);
        this.tipus = tipus;
    }

    public String getTipus() { return tipus; }
}
