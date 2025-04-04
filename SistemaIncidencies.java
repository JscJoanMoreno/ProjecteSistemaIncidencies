import java.util.ArrayList;

public class SistemaIncidencies {
    private ArrayList<ReportIncidencia> incidencies;

    public SistemaIncidencies() {
        this.incidencies = new ArrayList<>();
    }

    public void agregarIncidencia(ReportIncidencia incidencia) {
        incidencies.add(incidencia);
    }

    public void assignarTreballador(int idIncidencia, int idTreballador) {
        for (ReportIncidencia incidencia : incidencies) {
            if (incidencia.getId() == idIncidencia) {
                incidencia.assignarTreballador(idTreballador);
                System.out.println("Incidència " + idIncidencia + " assignada al treballador " + idTreballador);
                return;
            }
        }
        System.out.println("No s'ha trobat la incidència.");
    }

    public void actualitzarEstat(int idIncidencia, String nouEstat) {
        for (ReportIncidencia incidencia : incidencies) {
            if (incidencia.getId() == idIncidencia) {
                incidencia.setEstat(nouEstat);
                System.out.println("Estat de la incidència " + idIncidencia + " canviat a " + nouEstat);
                return;
            }
        }
        System.out.println("No s'ha trobat la incidència.");
    }

    public void mostrarIncidencies() {
        for (ReportIncidencia incidencia : incidencies) {
            System.out.println(incidencia);
        }
    }
}
