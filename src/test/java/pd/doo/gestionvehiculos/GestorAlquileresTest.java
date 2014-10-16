package pd.doo.gestionvehiculos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;


public class GestorAlquileresTest {

	private Coche cocheCategoriaA;
	private Coche cocheCategoriaB;
	private Coche cocheCategoriaC;
	private Moto moto;
	private Bicicleta bicicleta;
	private GestorAlquileres gestorAlquileres;
	
	@Before
    public void ini() {
		this.gestorAlquileres = new GestorAlquileres();
		this.cocheCategoriaA = new Coche(1, "CocheA", new CategoriaA());
		this.cocheCategoriaB = new Coche(2, "CocheB", new CategoriaB());
		this.cocheCategoriaC = new Coche(3, "CocheC", new CategoriaC());
		this.moto = new Moto(4, "moto");
		this.bicicleta = new Bicicleta(5,"bicicleta");
	}
	
	
	 @Test
	    public void testDarAltaVehiculo() {
		 	this.gestorAlquileres.darAltaVehiculo(cocheCategoriaA);
	        assertSame(this.cocheCategoriaA, this.gestorAlquileres.obtenerVehiculo(1));
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
