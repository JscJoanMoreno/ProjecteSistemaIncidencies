public class Usuari {
        private int idUsuari;
        private String nom;
        private String tipus;

        public Usuari (String nom, String tipus, int idUsuari){
            this.nom = nom;
            this.tipus = tipus;
            this.idUsuari = idUsuari;
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

    public int getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }

    @Override
    public String toString() {
        return "Usuari{" +
                "idUsuari=" + idUsuari +
                ", nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
