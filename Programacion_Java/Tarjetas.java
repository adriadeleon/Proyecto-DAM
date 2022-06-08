
public class Tarjetas{

	private int pin;
	private int numero;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "Tarjetas [pin=" + pin + ", numero=" + numero + "]";
	}
	
	
	public Tarjetas(int pin, int numero) {
		super();
		this.setPin(pin);
		this.setNumero(numero);
	}
}
