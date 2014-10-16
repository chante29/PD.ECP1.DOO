package pd.doo.gestionvehiculos;

public class CategoriaC extends Categoria{
	public static final char LETRA_CATEGORIA = 'C';
	private static final int PRECIO_CATEGORIA = 20;
	public CategoriaC(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaC.PRECIO_CATEGORIA;
	}
}
