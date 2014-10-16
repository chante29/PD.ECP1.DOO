package pd.doo.gestionvehiculos;

public class CategoriaA extends Categoria{
	public static final char LETRA_CATEGORIA = 'A';
	public static final int PRECIO_CATEGORIA_A = 10;
	public CategoriaA(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return CategoriaA.PRECIO_CATEGORIA_A;
	}

}
