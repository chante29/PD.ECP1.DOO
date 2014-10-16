package pd.doo.coleccionoperaciones;

public abstract class Operations {
    private double operator1;
    private double operator2;
    
    public Operations(double operator1, double operator2){
    	
    }
    
    public abstract double calcular();
    
    public abstract String toString();
/*
    public void add(Object operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;

                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }

    // MAL DISEÑADO... MAL CODIFICADO
    public int total() {
        int result = 0;
        String separator = "";
        for (Object operando : operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                if (operando.getClass().getSimpleName().equals("Addition")) {
                    result += ((Addition) operando).sum();
                } else {
                    result += ((Subtraction) operando).subtract();
                }
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }*/
}
