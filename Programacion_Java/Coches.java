
public class Coches {
	//Atributos
	private String matricula;
	private String marca;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Coches [matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	
	public Coches(String matricula, String marca) {
		super();
		this.setMarca(marca);
		this.setMatricula(matricula);
	}
	
	
	
	
}
