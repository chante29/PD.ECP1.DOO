package pd.doo.gestionvehiculos;

public class Coche extends VehiculosAlquilerSegunNumDia{
	
	private static final int DIA_MINIMO_LIMITE_1 = 1;
	private static final int DIA_MAXIMO_LIMITE_1 = 3;
	private static final int DIA_MINIMO_LIMITE_2 = 4;
	private static final int DIA_MAXIMO_LIMITE_2 = 7;
	private static final double PORCENTAJE_PAGAR_LIMITE_1 = 1;
	private static final double PORCENTAJE_PAGAR_LIMITE_2 = 0.8;
	private static final double PORCENTAJE_PAGAR_LIMITE_3 = 0.5;
	
	private Categoria categoria;
	
	public Coche(String idVehiculo, String descripcion, Categoria categoria) {
		super(idVehiculo, descripcion);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "\nTipo = "+ this.getClass().getSimpleName() + " \ncategoria = " + this.categoria.getClass().getSimpleName()
				+ "\n id vehiculo = " +this.getId() + "\n descripcion = " + this.getDescripcion();
		
	}


	@Override
	public double calcularPrecioDiaConcreto(int numDia) {
		double precio = 0;
		if(numDia >= Coche.DIA_MINIMO_LIMITE_1 && numDia <= Coche.DIA_MAXIMO_LIMITE_1){
			precio = this.categoria.darPrecioCategoria() * Coche.PORCENTAJE_PAGAR_LIMITE_1;
		}else if(numDia >= Coche.DIA_MINIMO_LIMITE_2 && numDia <= Coche.DIA_MAXIMO_LIMITE_2){
			precio = this.categoria.darPrecioCategoria() * Coche.PORCENTAJE_PAGAR_LIMITE_2;
		}else if(numDia > Coche.DIA_MAXIMO_LIMITE_2){
			precio = this.categoria.darPrecioCategoria() * Coche.PORCENTAJE_PAGAR_LIMITE_3;
		}else{
			assert false : "dias imposible";
		}
		return precio;
	}

}
