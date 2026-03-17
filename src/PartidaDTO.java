
public class PartidaDTO {

	
private int id;
private int jugX;
private int jugO;
private String estado;


public PartidaDTO() {}


public PartidaDTO(int id, int jugX, int jugO, String estado) {
	this.id=id;
	this.jugX=jugX;
	this.jugO=jugO;
	this.estado=estado;
	
	
	
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getJugX() {
	return jugX;
}


public void setJugX(int jugX) {
	this.jugX = jugX;
}


public int getJugO() {
	return jugO;
}


public void setJugO(int jugO) {
	this.jugO = jugO;
}


public String getEstado() {
	return estado;
}


public void setEstado(String estado) {
	this.estado = estado;
}
}
