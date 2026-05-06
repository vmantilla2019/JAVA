package pck;

public class laminas {
	int nrodelamina;
	String nombreJugador;
	String equipo;
	String esEspecial;
	public laminas(int nrodelamina, String nombreJugador, String equipo, String esEspecial) {
		super();
		this.nrodelamina = nrodelamina;
		this.nombreJugador = nombreJugador;
		this.equipo = equipo;
		this.esEspecial = esEspecial;
	}
	public int getNrodelamina() {
		return nrodelamina;
	}
	public void setNrodelamina(int nrodelamina) {
		this.nrodelamina = nrodelamina;
	}
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getEsEspecial() {
		return esEspecial;
	}
	public void setEsEspecial(String esEspecial) {
		this.esEspecial = esEspecial;
	}
}
	