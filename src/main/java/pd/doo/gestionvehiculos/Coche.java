package pd.doo.gestionvehiculos;

public class Coche extends Vehiculo{
	private Categoria categoria;
	
	public Coche(int idVehiculo, String descripcion, Categoria categoria) {
		super(idVehiculo, descripcion);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double darPrecio(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}

}
