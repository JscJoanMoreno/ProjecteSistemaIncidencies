import java.time.LocalDateTime;

public class Treballador extends Persona {
    private LocalDateTime horariDisponible;

    public Treballador(int id, String nom, LocalDateTime horariDisponible) {
        super(id, nom);
        this.horariDisponible = horariDisponible;
    }

    public LocalDateTime getHorariDisponible() { return horariDisponible; }
}
