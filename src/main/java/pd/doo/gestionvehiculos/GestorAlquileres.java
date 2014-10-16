package pd.doo.gestionvehiculos;

import java.util.ArrayList;

public class GestorAlquileres {
	private ArrayList<Vehiculo> vehiculos;
	
	public GestorAlquileres(){
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void darAltaVehiculo(Vehiculo vehiculoAlta){
		vehiculos.add(vehiculoAlta);
	}
	
	public double calcularPrecio(int idVehiculo, int dias){
		return obtenerVehiculo(idVehiculo).darPrecio(dias);
	}
	
	public Vehiculo obtenerVehiculo(int idVehiculo){
		Vehiculo vehiculo = null;
		for(Vehiculo vehiculoArray : vehiculos){
			if(vehiculoArray.getId() == idVehiculo){
				vehiculo = vehiculoArray;
			}
		}
		
		return vehiculo;
	}
}
