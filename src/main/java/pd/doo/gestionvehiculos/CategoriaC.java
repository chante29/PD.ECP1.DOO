package pd.doo.gestionvehiculos;

public class CategoriaC extends Categoria{
	public static final char LETRA_CATEGORIA = 'C';
	public static final int PRECIO_CATEGORIA_C = 20;
	public CategoriaC(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaC.PRECIO_CATEGORIA_C;
	}
}
