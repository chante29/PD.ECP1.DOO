package pd.doo.gestionvehiculos;


import upm.jbb.IO;

public class MainView {
	private Vehiculo vehiculo;
    
    public void addVehiculo() {
    	AddVehiculoController addVehiculoController = new AddVehiculoController(IO.in.readString("Introduce el id del vehículo"));
    	while(addVehiculoController.existeVehiculo()){
    		IO.out.println("Id existente");
    		addVehiculoController.setId(IO.in.readString("Introduce el id del vehículo"));
    	}
    	addVehiculoController.setDescripcion(IO.in.readString("Introduce una descripcion"));
    	addVehiculoController.addVehiculo((String) IO.in.select(addVehiculoController.getTipoVehiculos(), "Selecciona el tipo de vehículo"));
        IO.out.println("\nAñadido vehiculo: " + addVehiculoController.getVehiculo().toString());
    }
    
    public void mostrarVehiculos(){
    	IO.out.println("\nLa lista de vehiculos es=" + FactoriaVehiculos.getFactory().toString());
    }
    
    
    

    public void mostrarAlquiler() {
    	
    	this.vehiculo = FactoriaVehiculos.getFactory().obtenerVehiculo(String.valueOf(IO.in.select(FactoriaVehiculos.getFactory().keys(), "Elige un vehiculo")));
        
        int numeroDias = IO.in.readInt();
        IO.out.println(" \nAlquilar el vehiculo : " + vehiculo.toString()
        		+ "\n" + numeroDias + " día/s, cuesta = " + vehiculo.darPrecio(numeroDias));
    }

    public static void main(String[] args) {
        IO.in.addController(new MainView());
    }
}
