package pd.doo.gestionvehiculos;

public class CategoriaA extends Categoria{
	public static final char LETRA_CATEGORIA = 'A';
	private static final int PRECIO_CATEGORIA = 10;
	public CategoriaA(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaA.PRECIO_CATEGORIA;
	}

}
