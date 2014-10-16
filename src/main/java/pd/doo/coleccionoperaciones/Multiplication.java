package pd.doo.coleccionoperaciones;

public class Multiplication  extends Operations {

	public Multiplication(double operator1, double operator2) {
		super(operator1, operator2);
	}

	@Override
	public double calcular() {
		return this.getOperator1() * this.getOperator2();
	}

	@Override
	public String toString() {
		return "[" + this.getOperator1() + "*" + this.getOperator2() + "]";
	}

}
