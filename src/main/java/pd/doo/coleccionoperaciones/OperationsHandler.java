package pd.doo.coleccionoperaciones;

import java.util.ArrayList;

public class OperationsHandler {
	private ArrayList<Operations> operations;
	
	public OperationsHandler(){
		this.operations = new ArrayList<Operations>();
	}
	
	public double total(){
		double total = 0.0;
		for(Operations operation : operations){
			total += operation.calcular();
		}
		return total;
	}
	
	public void add(Operations operation){
		this.operations.add(operation);
	}
	
	public void reset(){
		this.operations = new ArrayList<Operations>();
	}
	
	@Override
	public String toString() {
		String operaciones = "";
		for(int numOperation = 0;numOperation < operations.size() - 1; numOperation++){
			operaciones += operations.get(numOperation).toString() + " + ";
		}
		operaciones += operations.get(operations.size() - 1).toString() + " >>>";
		return operaciones;
	}
}
