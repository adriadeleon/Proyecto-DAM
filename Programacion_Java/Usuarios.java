import java.time.*;
import java.util.ArrayList;

public class Usuarios {
	private static int Contador=1; //Contador para incrementar ID
	//Atributos
	private int id; //autoincrementable
	private ArrayList<Coches> coches;
	private ArrayList<Tarjetas> tarjetas;
	Ticket ticket;
	private int telefono;
	private String correo;
	private String nombre;
	private String contraseña;
	private String DNI;
	
	public static int getContador() {
		return Contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
    public ArrayList<Coches> getCoches() {
		return coches;
	}

	public void setCoches(ArrayList<Coches> coches) {
		this.coches = coches;
	}

	public ArrayList<Tarjetas> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(ArrayList<Tarjetas> tarjetas) {
		this.tarjetas = tarjetas;
	}


 
	public Usuarios(int id, Coches coche, Tarjetas tarjeta, Ticket ticket, int telefono, String correo, String nombre,
			String contraseña, String dNI) {
		this.setId(Contador++); //Incrementamos ID en +1
		this.setTicket(ticket);
		this.setTarjetas(tarjetas);
		this.setCoches(coches);
		this.setTelefono(telefono);
		this.setCorreo(correo);
		this.setNombre(nombre);
		this.setContraseña(contraseña);
		this.setDNI(DNI);
	}

	public static void verCoches(ArrayList<Coches> coches) {
        for (Coches coche : coches) {
            System.out.println("Estos son tus coches:");
        }
    }
    
    public static void verTarjetas(ArrayList<Tarjetas> tarjetas) {
        for (Tarjetas tarjeta : tarjetas) {
            System.out.println("Estas son tus tarjetas:");
        }
    }
	
	
	
}
