package pd.doo.coleccionoperaciones;

public class Subtraction  extends Operations {

	public Subtraction(double operator1, double operator2) {
		super(operator1, operator2);
	}

	@Override
	public double calcular() {
		return this.getOperator1() - this.getOperator2();
	}

	@Override
	public String toString() {
		return "[" + this.getOperator1() + "-" + this.getOperator2() + "]";
	}
    /*private final int operator1, operator2;

    public Subtraction(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public int subtract() {
        return this.operator1 - this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "-" + operator2 + "]";
    }*/

}
