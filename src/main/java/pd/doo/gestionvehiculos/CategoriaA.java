package pd.doo.gestionvehiculos;

public class CategoriaA extends Categoria{
	
	public CategoriaA(char categoria) {
		super(categoria);
	}

	@Override
	public int darPrecioCategoria() {
		return Categoria.PRECIO_CATEGORIA_A;
	}

}
