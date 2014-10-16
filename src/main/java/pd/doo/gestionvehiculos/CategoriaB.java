package pd.doo.gestionvehiculos;

public class CategoriaB extends Categoria{

	private static final int PRECIO_CATEGORIA= 15;
	public CategoriaB() {
		super();
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaB.PRECIO_CATEGORIA;
	}
}
