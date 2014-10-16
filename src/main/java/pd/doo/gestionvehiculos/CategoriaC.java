package pd.doo.gestionvehiculos;

public class CategoriaC extends Categoria{
	public CategoriaC(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return Categoria.PRECIO_CATEGORIA_C;
	}
}
