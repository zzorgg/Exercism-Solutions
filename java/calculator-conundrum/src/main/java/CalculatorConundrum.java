class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String s = "";
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if(operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");    
        } else {
            switch (operation) {
                case "+":
                s = operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                break;
                case "*":
                s = operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                break;
                case "/":
                try {
                    s = operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                break;
                default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }
        return s;
    }
}
