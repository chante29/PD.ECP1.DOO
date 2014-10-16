package pd.doo.gestionvehiculos;

import upm.jbb.IO;

public class GestionVehiculosMain {
    private Vehiculo[] vehiculos = {new Coche(1, "Furgoneta", new CategoriaB(CategoriaB.LETRA_CATEGORIA)), new Moto(2, "Moto")
    , new Bicicleta(3, "Bicicleta"), new Coche(4, "Camion", new CategoriaC(CategoriaC.LETRA_CATEGORIA)), new Coche(5, "Turismo", new CategoriaA(CategoriaA.LETRA_CATEGORIA))} ;

    private Vehiculo vehiculo = null;

    public void aniadirVehiculo() {
       // this.vehiculo = (Vehiculo) IO.in.select(alquileres, "Elige un creador");
    }

    public void mostrarAlquiler() {
    	this.vehiculo = (Vehiculo) IO.in.select(vehiculos, "Elige un vehiculo");
         //IO.out.println("Seleccionado vehiculo: " + this.vehiculo.toString());
        int numeroDias = IO.in.readInt();
        IO.out.println(" Alquilar el vehiculo : " + vehiculo.toString()
        		+ "\n" + numeroDias + " día/s, cuesta = " + vehiculo.darPrecio(numeroDias));
    }

    public static void main(String[] args) {
        IO.in.addController(new GestionVehiculosMain());
    }
}

/*private Creator[] creadores = {new Creator1(), new Creator2()};

private Creator creador = creadores[0];

public void tipoCreador() {
    this.creador = (Creator) IO.in.select(creadores, "Elige un creador");
}

public void crearProducto() {
    IO.out.println("Creado producto: " + this.creador.crearProducto().toString());
}

public static void main(String[] args) {
    IO.in.addController(new FactoryMethodMain());
}*/