package pd.doo.coleccionoperaciones;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsHandlerTest {
	private Summation summation;
	private Subtraction subtraction;
	private Multiplication multiplication;
	private OperationsHandler operationsHandler;
	
	@Before
    public void ini() {
		this.operationsHandler = new OperationsHandler();
		this.summation = new Summation(3.2, 1.2);
		this.subtraction = new Subtraction(3.2, 1.2);
		this.multiplication = new Multiplication(3.0, 2.0);
	}
	
	@Test
    public void testCalcularSummation() {
		assertEquals(4.4, summation.calcular(), 10e-5);
    }
	
	@Test
    public void testCalcularSubtraction() {
		assertEquals(2.0, subtraction.calcular(), 10e-5);
    }
	
	@Test
    public void testCalcularMultiplication() {
		assertEquals(6.0, multiplication.calcular(), 10e-5);
    }
	
	@Test
    public void testAddOperationsHandler() {
		this.operationsHandler.add(summation);
		assertEquals(4.4, operationsHandler.total(), 10e-5);
    }
	
	@Test
    public void testTotalOperationsHandler() {
		this.operationsHandler.add(summation);
		this.operationsHandler.add(subtraction);
		this.operationsHandler.add(multiplication);
		assertEquals(12.4, operationsHandler.total(), 10e-5);
    }
	
	
}
