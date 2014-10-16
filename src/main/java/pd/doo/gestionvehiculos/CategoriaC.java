package pd.doo.gestionvehiculos;

public class CategoriaC extends Categoria{
	private int precio;
	public CategoriaC(char categoria) {
		super(categoria);
		this.precio = 20;
	}

	@Override
	public int darPrecio() {
		return precio;
	}
}
