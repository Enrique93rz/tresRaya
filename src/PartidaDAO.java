import java.sql.*;
import java.util.*;

public class PartidaDAO {

	public ArrayList<PartidaDTO>listarPartidas(){
		ArrayList<PartidaDTO>lista = new ArrayList<>();
		String sql = "SELECT * FROM Partida";
		
		try(Conexion con = Conexion.getConnection();
			PreparedStatement ps = con.pre;
			ResultSet rs = ps.executeQuery()){
			while (rs.next()) {
				PartidaDTO p = new PartidaDTO();
				p.setId(rs.getInt("id"));
				p.setJugX(rs.getInt("jugX"));
				p.setJugO(rs.getInt("jugO"));
				p.setEstado(rs.getString("estado"));
				lista.add(p);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
