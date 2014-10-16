package pd.doo.gestionvehiculos;

public class CategoriaB extends Categoria{
	public static final char LETRA_CATEGORIA = 'B';
	private static final int PRECIO_CATEGORIA= 15;
	public CategoriaB(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaB.PRECIO_CATEGORIA;
	}
}
