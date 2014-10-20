package pd.doo.gestionvehiculos;


import upm.jbb.IO;

public class MainView {
	private Vehiculo vehiculo;
    
    public void addVehiculo() {
    	AddVehiculoController addVehiculoController = new AddVehiculoController(IO.in.readString("Introduce el id del veh�culo"));
    	while(addVehiculoController.existeVehiculo()){
    		IO.out.println("Id existente");
    		addVehiculoController.setId(IO.in.readString("Introduce el id del veh�culo"));
    	}
    	addVehiculoController.setDescripcion(IO.in.readString("Introduce una descripcion"));
    	addVehiculoController.addVehiculo((String) IO.in.select(addVehiculoController.getTipoVehiculos(), "Selecciona el tipo de veh�culo"));
        IO.out.println("\nA�adido vehiculo: " + addVehiculoController.getVehiculo().toString());
    }
    
    public void mostrarVehiculos(){
    	IO.out.println("\nLa lista de vehiculos es=" + FactoriaVehiculos.getFactory().toString());
    }
    
    
    

    public void mostrarAlquiler() {
    	
    	this.vehiculo = FactoriaVehiculos.getFactory().obtenerVehiculo(String.valueOf(IO.in.select(FactoriaVehiculos.getFactory().keys(), "Elige un vehiculo")));
        
        int numeroDias = IO.in.readInt();
        IO.out.println(" \nAlquilar el vehiculo : " + vehiculo.toString()
        		+ "\n" + numeroDias + " d�a/s, cuesta = " + vehiculo.darPrecio(numeroDias));
    }

    public static void main(String[] args) {
        IO.in.addController(new MainView());
    }
}
