package pd.doo.gestionvehiculos;

public class CategoriaB extends Categoria{

	public CategoriaB(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return Categoria.PRECIO_CATEGORIA_B;
	}
}
