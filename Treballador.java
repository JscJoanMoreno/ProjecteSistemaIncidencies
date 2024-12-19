import java.time.LocalDateTime;

public class Treballador {
    private LocalDateTime horariDisponible;
    private int idTreballador;
    private String nomTrebalador;

    public Treballador(LocalDateTime horariDisponible, int idTreballador, String nomTrebalador) {
        this.horariDisponible = horariDisponible;
        this.idTreballador = idTreballador;
        this.nomTrebalador = nomTrebalador;
    }

    public LocalDateTime getHorariDisponible() {
        return horariDisponible;
    }

    public void setHorariDisponible(LocalDateTime horariDisponible) {
        this.horariDisponible = horariDisponible;
    }

    public int getIdTreballador() {
        return idTreballador;
    }

    public void setIdTreballador(int idTreballador) {
        this.idTreballador = idTreballador;
    }

    public String getNomTrebalador() {
        return nomTrebalador;
    }

    public void setNomTrebalador(String nomTrebalador) {
        this.nomTrebalador = nomTrebalador;
    }

    @Override
    public String toString() {
        return "Treballador{" +
                "horariDisponible=" + horariDisponible +
                ", idTreballador=" + idTreballador +
                ", nomTrebalador='" + nomTrebalador + '\'' +
                '}';
    }

}
