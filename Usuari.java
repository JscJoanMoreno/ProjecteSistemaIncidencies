public class Usuari {
        private String nom;
        private String tipus;

        public Usuari (String nom, String tipus){
            this.nom = nom;
            this.tipus = tipus;
        }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Usuari{" +
                "nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
