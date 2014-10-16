package pd.doo.gestionvehiculos;

public class CategoriaB extends Categoria{
	private int precio;
	public CategoriaB(char categoria) {
		super(categoria);
		this.precio = 15;
	}

	@Override
	public int darPrecio() {
		return precio;
	}
}
