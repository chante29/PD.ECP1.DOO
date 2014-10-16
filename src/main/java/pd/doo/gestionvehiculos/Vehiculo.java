package pd.doo.gestionvehiculos;

public abstract class Vehiculo {
	private int id;
	private String descripcion;
	
	public Vehiculo (int idVehiculo, String descripcion){
		id = idVehiculo;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void mostrarVehiculo(){
		toString();
	}
	
	@Override
	public abstract String toString();
	
	
	public abstract double darPrecio(int numDiasTotales);

	
}
