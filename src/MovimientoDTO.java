
public class MovimientoDTO {

	private int partida;
	private int coordX;
    private int coordY;
    private String contenido;
    
    
    public MovimientoDTO() {}
    
    public MovimientoDTO(int partida, int coordX, int coordY, String contenido) {
    	this.partida=partida;
    	this.coordX=coordX;
    	this.coordY=coordY;
    	this.contenido=contenido;
    	
    	
    	
    	
    }

	public int getPartida() {
		return partida;
	}

	public void setPartida(int partida) {
		this.partida = partida;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


}