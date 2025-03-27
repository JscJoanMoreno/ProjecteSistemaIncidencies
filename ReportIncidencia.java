import java.time.LocalDateTime;

public class ReportIncidencia {
    private int id;
    private int grauNecesitat; // 1 = Baix, 2 = Mitjà, 3 = Alt
    private String material;
    private String aula;
    private String estat; // "pendent", "en procés", "resolta"
    private String descripcio;
    private int idTreballadorAssignat;
    private LocalDateTime dataResolucio;

    public ReportIncidencia(int id, int grauNecesitat, String material, String aula, String descripcio) {
        this.id = id;
        this.grauNecesitat = grauNecesitat;
        this.material = material;
        this.aula = aula;
        this.descripcio = descripcio;
        this.estat = "pendent"; // Per defecte, l'estat és pendent
        this.idTreballadorAssignat = -1; // No assignat
        this.dataResolucio = null; // No resolt
    }

    public int getId() {
        return id;
    }

    public int getGrauNecesitat() {
        return grauNecesitat;
    }

    public void setGrauNecesitat(int grauNecesitat) {
        this.grauNecesitat = grauNecesitat;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String nouEstat) {
        if (nouEstat.equals("pendent") || nouEstat.equals("en procés") || nouEstat.equals("resolta")) {
            this.estat = nouEstat;
            if (nouEstat.equals("resolta")) {
                this.dataResolucio = LocalDateTime.now(); // Marca la resolució
            }
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
                ", Treballador Assignat: " + (idTreballadorAssignat == -1 ? "Cap" : idTreballadorAssignat) +
                ", Data Resolució: " + (dataResolucio == null ? "No resolt" : dataResolucio);
    }
}
