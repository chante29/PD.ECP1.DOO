package pd.doo.gestionvehiculos;

public class CategoriaA extends Categoria{
	private int precio;
	public CategoriaA(char categoria) {
		super(categoria);
		this.precio = 10;
	}

	@Override
	public int darPrecio() {
		return precio;
	}

}
