import java.util.Scanner;

public class IncidenciaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaIncidencies sistema = new SistemaIncidencies();

        sistema.agregarIncidencia(new ReportIncidencia(1, 3, "Projector", "Aula 101", "No s'encén"));
        sistema.agregarIncidencia(new ReportIncidencia(2, 1, "Ordinador", "Aula 202", "Pantalla blava"));
        sistema.agregarIncidencia(new ReportIncidencia(3, 2, "Wifi", "Aula 303", "Senyal molt feble"));

        boolean sortir = false;
        while (!sortir) {
            System.out.println("\n📌 Menú:");
            System.out.println("1. Veure incidències");
            System.out.println("2. Assignar treballador");
            System.out.println("3. Actualitzar estat");
            System.out.println("4. Sortir");
            System.out.print("Opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    sistema.mostrarIncidencies();
                    break;
                case 2:
                    System.out.print("ID de la incidència: ");
                    int id = sc.nextInt();
                    System.out.print("ID del treballador: ");
                    int idTreballador = sc.nextInt();
                    sistema.assignarTreballador(id, idTreballador);
                    break;
                case 3:
                    System.out.print("ID de la incidència: ");
                    int idInc = sc.nextInt();
                    System.out.print("Nou estat (pendent / en procés / resolta): ");
                    String nouEstat = sc.next();
                    sistema.actualitzarEstat(idInc, nouEstat);
                    break;
                case 4:
                    sortir = true;
                    break;
                default:
                    System.out.println("❌ Opció no vàlida.");
            }
        }
        sc.close();
    }
}
