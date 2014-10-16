package pd.doo.gestionvehiculos;

public class CategoriaC extends Categoria{

	private static final int PRECIO_CATEGORIA = 20;
	public CategoriaC() {
		super();
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaC.PRECIO_CATEGORIA;
	}
}
