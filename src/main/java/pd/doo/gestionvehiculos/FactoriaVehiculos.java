package pd.doo.gestionvehiculos;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class FactoriaVehiculos {
	private SortedMap<String, Vehiculo> listaVehiculos = new TreeMap<String, Vehiculo>();
	private static FactoriaVehiculos factoriaAlquileres = null;
	
	private FactoriaVehiculos(){
	}
	
	public static FactoriaVehiculos getFactory(){
		if(factoriaAlquileres == null){
			factoriaAlquileres = new FactoriaVehiculos();
		}
		return factoriaAlquileres;
	}
	
	public void darAltaVehiculo(Vehiculo vehiculoAlta){
		listaVehiculos.put(vehiculoAlta.getId(),vehiculoAlta);
	}
	
	public String[] keys() {
        return this.listaVehiculos.keySet().toArray(new String[0]);
    }
	
	public double calcularPrecio(String idVehiculo, int dias){
		return obtenerVehiculo(idVehiculo).darPrecio(dias);
	}
	
	public Vehiculo obtenerVehiculo(String idVehiculo){
		
		
		Vehiculo vehiculo = null;
	
		for(Entry<String, Vehiculo> entry : listaVehiculos.entrySet()) {
			  String key = entry.getKey();
			  if(key.equals(idVehiculo)){
				  vehiculo = entry.getValue();  
			  }
			}
		
		return vehiculo;
	}
	
	@Override
	public String toString(){
		String vehiculos = "";
		for(Entry<String, Vehiculo> entry : listaVehiculos.entrySet()) {
			    vehiculos += " \n"+ entry.getValue().toString();  
			  
			}
		return vehiculos;
		
	}
	
	public Object[] toArray(){
		return this.listaVehiculos.keySet().toArray();
	}
}
