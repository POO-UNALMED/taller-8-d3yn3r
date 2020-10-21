package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public int compareTo(Object o) {
		int res = golesRecibidos - ((Portero) o).golesRecibidos;
		if (res < 0) {
			res *= -1;
		}
		return res;
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de "
				+ super.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
}
