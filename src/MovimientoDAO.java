import java.sql.*;
import java.util.*;
public class MovimientoDAO {

	public List<MovimientoDTO>obtenerMovimientos(int partidaId){
		List<MovimientoDTO>lista = new ArrayList<>();
		
		try (Connection con = ConexionBD.getConexion()){
			String sql = "SELECT * FROM movimientos WHERE partida_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, partidaId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				lista.add(new MovimientoDTO(
						partidaId,
						rs.getInt("fila"),
						rs.getInt("columna"),
						rs.getString("jugador")
						));
			}
			
		}catch (Exception e) {e.printStackTrace();}	

		return lista;
	}
	
	public void insertarMovimiento(MovimientoDTO mov) {
		try(Connection con = ConexionBD.getConexion()){
			String sql = "INSERT INTO movimientos (partida_id, fila, columna, jugador VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, mov.getPartidaId());
			ps.setInt(2,  mov.)
		}catch (Exception e) {e.printStackTrace();}
	}
	
	
	
		
}
