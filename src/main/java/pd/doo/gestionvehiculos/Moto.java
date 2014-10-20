package pd.doo.gestionvehiculos;

public class Moto extends Vehiculo{

	private static final int DIA_MINIMO_LIMITE_1 = 1;
	private static final int DIA_MAXIMO_LIMITE_1 = 7;
	private static final int PRECIO_LIMITE_1 = 8;
	private static final int PRECIO_LIMITE_2 = 7;
	
	
	public Moto(String idVehiculo, String descripcion) {
		super(idVehiculo, descripcion);
	}

	@Override
	public String toString() {
		return "\nTipo = "+ this.getClass().getSimpleName() + " \nid vehiculo = " +this.getId() + " \ndescripcion = " + this.getDescripcion();
		
	}


	@Override
	public double darPrecio(int numDias) {
		double precio = 0;
		if(numDias >= Moto.DIA_MINIMO_LIMITE_1 && numDias <= Moto.DIA_MAXIMO_LIMITE_1){
			precio = numDias * Moto.PRECIO_LIMITE_1;
		}else if(numDias > Moto.DIA_MAXIMO_LIMITE_1){
			precio = numDias * Moto.PRECIO_LIMITE_2;
		}else{
			assert false : "dias imposible";
		}
		return precio;
	}

}
