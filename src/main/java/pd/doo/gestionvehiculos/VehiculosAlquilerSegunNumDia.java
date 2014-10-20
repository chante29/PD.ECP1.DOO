package pd.doo.gestionvehiculos;

public abstract class VehiculosAlquilerSegunNumDia extends Vehiculo {

	public VehiculosAlquilerSegunNumDia(String idVehiculo, String descripcion) {
		super(idVehiculo, descripcion);
	}

	@Override
	public abstract String toString();

	@Override
	public double darPrecio(int diasTotales) {
		double precio = 0.0;
		
		for(int numDia = 1; numDia <= diasTotales; numDia++){
			precio += calcularPrecioDiaConcreto(numDia);
		}
		return precio;
	}
	
	public abstract double calcularPrecioDiaConcreto(int numDia);

}
