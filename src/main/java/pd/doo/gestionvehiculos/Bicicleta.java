package pd.doo.gestionvehiculos;

public class Bicicleta extends VehiculosAlquilerSegunNumDia {
	private static final int DIA_MINIMO_LIMITE_1 = 1;
	private static final int DIA_MAXIMO_LIMITE_1 = 2;
	private static final int PRECIO_LIMITE_1 = 3;
	private static final int PRECIO_LIMITE_2 = 2;
	
	
	
	public Bicicleta(int idVehiculo, String descripcion) {
		super(idVehiculo, descripcion);
	}

	@Override
	public String toString() {
		return "\nTipo = "+ this.getClass().getSimpleName() + " \nid vehiculo = " +this.getId() + " \ndescripcion = " + this.getDescripcion();
	}


	@Override
	public double calcularPrecioDiaConcreto(int numDia) {
		double precio = 0;
		if(numDia >= Bicicleta.DIA_MINIMO_LIMITE_1 && numDia <= Bicicleta.DIA_MAXIMO_LIMITE_1){
			precio = Bicicleta.PRECIO_LIMITE_1;
		}else if(numDia > Bicicleta.DIA_MAXIMO_LIMITE_1){
			precio = Bicicleta.PRECIO_LIMITE_2;
		}else{
			assert false : "dias imposibles";
		}
		return precio;
	}

}
