import java.time.LocalDateTime;

public class ReportIncidencia {
    private int grauNecesitat;
    private String material;
    private String aula;
    private String estat;
    private String descripcio;
    private int idTreballadorAssignat;
    private LocalDateTime dataResolucio;

    public ReportIncidencia(int grauNecesitat, String material, String aula, String estat, String descripcio, int idTreballadorAssignat, LocalDateTime dataResolucio) {
        this.grauNecesitat = grauNecesitat;
        this.material = material;
        this.aula = aula;
        this.estat = estat;
        this.descripcio = descripcio;
        this.idTreballadorAssignat = idTreballadorAssignat;
        this.dataResolucio = dataResolucio;
    }

    public int getGrauNecesitat() {
        return grauNecesitat;
    }

    public void setGrauNecesitat(int grauNecesitat) {
        this.grauNecesitat = grauNecesitat;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getIdTreballadorAssignat() {
        return idTreballadorAssignat;
    }

    public void setIdTreballadorAssignat(int idTreballadorAssignat) {
        this.idTreballadorAssignat = idTreballadorAssignat;
    }

    public LocalDateTime getDataResolucio() {
        return dataResolucio;
    }

    public void setDataResolucio(LocalDateTime dataResolucio) {
        this.dataResolucio = dataResolucio;
    }

    @Override
    public String toString() {
        return "ReportIncidencia{" +
                "grauNecesitat=" + grauNecesitat +
                ", material='" + material + '\'' +
                ", aula='" + aula + '\'' +
                ", estat='" + estat + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", idTreballadorAssignat=" + idTreballadorAssignat +
                ", dataResolucio=" + dataResolucio +
                '}';
    }
}
