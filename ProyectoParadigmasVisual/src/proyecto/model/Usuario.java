package proyecto.model;

public class Usuario {
	
	private String codigoU;
	private String nombre;
	private String password;
	private String carrera;
	
	public Usuario(String codigoU, String nombre, String password, String carrera) {
		super();
		this.codigoU = codigoU;
		this.nombre = nombre;
		this.password = password;
		this.carrera = carrera;
	}

	public String getCodigoU() {
		return codigoU;
	}

	public void setCodigoU(String codigoU) {
		this.codigoU = codigoU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Usuario [codigoU=" + codigoU + ", nombre=" + nombre + ", password=" + password + ", carrera=" + carrera
				+ "]";
	}

	
}
