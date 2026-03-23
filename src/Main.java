
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PartidaDAO partidaDAO = new PartidaDAO();

        List<PartidaDTO> partidas = partidaDAO.obtenerPartidas();

        System.out.println("PARTIDAS:");
        for (PartidaDTO p : partidas) {
            System.out.println(p.getId() + " - " + p.getEstado());
        }

        System.out.print("Elige partida: ");
        int id = sc.nextInt();

        MovimientoDAO movDAO = new MovimientoDAO();
        List<MovimientoDTO> movimientos = movDAO.obtenerMovimientos(id);

        Tablero t = new Tablero();
        t.cargarMovimientos(movimientos);
        t.pintar();
    }
}
