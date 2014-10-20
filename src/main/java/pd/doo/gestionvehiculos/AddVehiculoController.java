package pd.doo.gestionvehiculos;


public class AddVehiculoController {
	private String id = "";
	private String descripcion="";
	private Vehiculo VehiculoAdd = null;
	
	private static String[] tipoVehiculos = {"Coche Categoria A", "Coche Categoria B", "Coche Categoria C",
		"Moto", "Bicicleta"}; 
	
	public AddVehiculoController(String id){
		this.id = id;
		
	}
	public boolean existeVehiculo(){
		boolean existe = false;
    	if(!id.equals("") && FactoriaVehiculos.getFactory().obtenerVehiculo(id) != null){
    		existe = true;
    	}
    	return existe;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String[] getTipoVehiculos(){
		return AddVehiculoController.tipoVehiculos;
	}
	
	private void setVehiculo(String tipoVehiculo){
		if(tipoVehiculo.equals("Coche Categoria A")){
			VehiculoAdd = new Coche(id, descripcion, new CategoriaA());
		}else if(tipoVehiculo.equals("Coche Categoria B")){
			VehiculoAdd = new Coche(id, descripcion, new CategoriaB());
		}else if(tipoVehiculo.equals("Coche Categoria C")){
			VehiculoAdd = new Coche(id, descripcion, new CategoriaC());
		}else if(tipoVehiculo.equals("Moto")){
			VehiculoAdd = new Moto(id, descripcion);
		}else if(tipoVehiculo.equals("Bicicleta")){
			VehiculoAdd = new Bicicleta(id, descripcion);
		}else{
			assert false : "tipo vehiculo imposible";
		}
	}
	
	public void addVehiculo (String tipoVehiculo){
		this.setVehiculo(tipoVehiculo);
		FactoriaVehiculos.getFactory().darAltaVehiculo(VehiculoAdd);
	}
	
	public Vehiculo getVehiculo(){
		return VehiculoAdd;
	}
}
