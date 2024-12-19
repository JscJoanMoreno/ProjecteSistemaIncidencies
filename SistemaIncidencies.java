import java.lang.reflect.Array;
import java.util.ArrayList;

public class SistemaIncidencies {
    private ArrayList<Usuari>usuaris ;
    private ArrayList<Treballador>treballadors;
    private ArrayList<ReportIncidencia>incidencies;

    public SistemaIncidencies(ArrayList<Usuari> usuaris, ArrayList<Treballador> treballadors, ArrayList<ReportIncidencia> incidencies) {
        this.usuaris = new ArrayList<>();
        this.treballadors = new ArrayList<>();
        this.incidencies = new ArrayList<>();
    }

    public void agregarUsuari(Usuari usuari){
        usuaris.add(usuari);
    }
    public void agregarTreballador(Treballador treballador) {
        treballadors.add(treballador);
    }
    public void agregarIncidencia(ReportIncidencia incidencia){
            incidencies.add(incidencia);
    }


    public ArrayList<Usuari> getUsuaris() {
        return usuaris;
    }

    public void setUsuaris(ArrayList<Usuari> usuaris) {
        this.usuaris = usuaris;
    }

    public ArrayList<Treballador> getTreballadors() {
        return treballadors;
    }

    public void setTreballadors(ArrayList<Treballador> treballadors) {
        this.treballadors = treballadors;
    }

    public ArrayList<ReportIncidencia> getIncidencies() {
        return incidencies;
    }

    public void setIncidencies(ArrayList<ReportIncidencia> incidencies) {
        this.incidencies = incidencies;
    }



    @Override
    public String toString() {
        return "SistemaIncidencies{" +
                "usuaris=" + usuaris +
                ", treballadors=" + treballadors +
                ", incidencies=" + incidencies +
                '}';
    }
}
