package pd.doo.gestionvehiculos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;


public class GestorVehiculosTest {

	private Coche cocheCategoriaA;
	private Coche cocheCategoriaB;
	private Coche cocheCategoriaC;
	private Moto moto;
	private Bicicleta bicicleta;
	
	@Before
    public void ini() {
		this.cocheCategoriaA = new Coche("1111XXX", "CocheA", new CategoriaA());
		this.cocheCategoriaB = new Coche("2222XXX", "CocheB", new CategoriaB());
		this.cocheCategoriaC = new Coche("3333XXX", "CocheC", new CategoriaC());
		this.moto = new Moto("4444XXX", "moto");
		this.bicicleta = new Bicicleta("5555XXX","bicicleta");
	}
	
	
	 @Test
	    public void testDarAltaVehiculo() {
		 	FactoriaVehiculos.getFactory().darAltaVehiculo(cocheCategoriaA);
	        assertSame(this.cocheCategoriaA, FactoriaVehiculos.getFactory().obtenerVehiculo("1111XXX"));
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaATresDias() {
			assertEquals(30.0, this.cocheCategoriaA.darPrecio(3), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaASieteDias() {
			assertEquals(62.0, this.cocheCategoriaA.darPrecio(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaADiezDias() {
			assertEquals(77.0, this.cocheCategoriaA.darPrecio(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaBTresDias() {
			assertEquals(45.0, this.cocheCategoriaB.darPrecio(3), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaBSieteDias() {
			assertEquals(93.0, this.cocheCategoriaB.darPrecio(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaBDiezDias() {
			assertEquals(115.5, this.cocheCategoriaB.darPrecio(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaCTresDias() {
			assertEquals(60.0, this.cocheCategoriaC.darPrecio(3), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaCSieteDias() {
			assertEquals(124.0, this.cocheCategoriaC.darPrecio(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaCDiezDias() {
			assertEquals(154.0, this.cocheCategoriaC.darPrecio(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerMotoSieteDias() {
			assertEquals(56.0, this.moto.darPrecio(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerMotoDiezDias() {
			assertEquals(70.0, this.moto.darPrecio(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerBicicletaDosDias() {
			assertEquals(6.0, this.bicicleta.darPrecio(2), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerBicicletaCuatroDias() {
			assertEquals(10.0, this.bicicleta.darPrecio(4), 10e-5);
	    }
}
