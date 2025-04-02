public class ReportIncidencia {
    private final int id;
    private final int grauNecesitat;
    private final String material;
    private final String aula;
    private String estat;
    private final String descripcio;
    private int idTreballadorAssignat;

    public ReportIncidencia(int id, int grauNecesitat, String material, String aula, String descripcio) {
        this.id = id;
        this.grauNecesitat = grauNecesitat;
        this.material = material;
        this.aula = aula;
        this.descripcio = descripcio;
        this.estat = "pendent";
        this.idTreballadorAssignat = -1;
    }

    public int getId() { return id; }
    public String getEstat() { return estat; }

    public void setEstat(String nouEstat) {
        if (nouEstat.equals("pendent") || nouEstat.equals("en procés") || nouEstat.equals("resolta")) {
            this.estat = nouEstat;
        }
    }

    public void assignarTreballador(int idTreballador) {
        this.idTreballadorAssignat = idTreballador;
        this.estat = "en procés";
    }

    @Override
    public String toString() {
        return "Incidencia ID: " + id +
                ", Prioritat: " + grauNecesitat +
                ", Estat: " + estat +
                ", Material: " + material +
                ", Aula: " + aula +
                ", Descripció: " + descripcio +
                ", Treballador Assignat: " + (idTreballadorAssignat == -1 ? "Cap" : idTreballadorAssignat);
    }
}
