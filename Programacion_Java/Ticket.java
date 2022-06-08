
public class Ticket {
	//Atributos
	private String Finicio;
	private String Ffinal;
	Usuarios usuario;
	Coches coche;
	
	public String getFinicio() {
		return Finicio;
	}
	public void setFinicio(String finicio) {
		this.Finicio = finicio;
	}
	public String getFfinal() {
		return Ffinal;
	}
	public void setFfinal(String ffinal) {
		this.Ffinal = ffinal;
	}
	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	public Coches getCoche() {
		return coche;
	}
	public void setCoche(Coches coche) {
		this.coche = coche;
	}
	
	
	@Override
	public String toString() {
		return "Ticket [Finicio=" + Finicio + ", Ffinal=" + Ffinal + ", usuario=" + usuario + ", coche=" + coche + "]";
	}
	
	
	public Ticket(String finicio, String ffinal, Usuarios usuario, Coches coche) {
		super();
		this.setFinicio(finicio);
		this.setFfinal(ffinal);
		this.setUsuario(usuario);
		this.setCoche(coche);
	}

}
