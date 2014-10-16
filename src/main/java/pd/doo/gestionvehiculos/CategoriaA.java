package pd.doo.gestionvehiculos;

public class CategoriaA extends Categoria{
	private static final int PRECIO_CATEGORIA = 10;
	public CategoriaA() {
		super();
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaA.PRECIO_CATEGORIA;
	}

}
