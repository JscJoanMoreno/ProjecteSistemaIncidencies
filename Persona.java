public abstract class Persona {
    protected int id;
    protected String nom;

    public Persona(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
}
