package pd.doo.gestionvehiculos;

public abstract class Categoria {
	
	public static final int PRECIO_CATEGORIA_A = 10;
	public static final int PRECIO_CATEGORIA_B = 15;
	public static final int PRECIO_CATEGORIA_C = 20;
	private char categoria;
	public Categoria(char categoria){
		
	}
	
	
	public abstract int darPrecioCategoria();
	
}
