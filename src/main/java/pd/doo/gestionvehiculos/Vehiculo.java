package pd.doo.gestionvehiculos;

public abstract class Vehiculo {
	private int id;
	private String descripcion;
	
	public Vehiculo (int idVehiculo, String descripcion){
		
	}
	
	public void mostrarVehiculo(){
		toString();
	}
	
	@Override
	public abstract String toString();
	
	public double darPrecio(int dias){
		double precio = 0.0;
		for(int numDia = 1; numDia <= dias; numDia++){
			precio += calcularPrecioDia(numDia);
		}
		return precio;
	}
	
	public abstract double calcularPrecioDia(int numDia);
	
}
