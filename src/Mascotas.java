
public class Mascotas {
	private int clavemascota;
	private String nombremascota;
	private String Especie;
	private int edad;
	public Mascotas() {
		super();
	}
	public Mascotas(int clavemascota, String nombremascota, String especie, int edad) {
		super();
		this.clavemascota = clavemascota;
		this.nombremascota = nombremascota;
		Especie = especie;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Mascotas [clavemascota=" + clavemascota + ", nombremascota=" + nombremascota + ", Especie=" + Especie
				+ ", edad=" + edad + "]\n";
	}
	public int getClavemascota() {
		return clavemascota;
	}
	public void setClavemascota(int clavemascota) {
		this.clavemascota = clavemascota;
	}
	public String getNombremascota() {
		return nombremascota;
	}
	public void setNombremascota(String nombremascota) {
		this.nombremascota = nombremascota;
	}
	public String getEspecie() {
		return Especie;
	}
	public void setEspecie(String especie) {
		Especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
