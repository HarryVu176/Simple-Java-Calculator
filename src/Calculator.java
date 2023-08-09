/**
 * Calculator.java
 * Purpose: This class will calculate the result of the operation
 * Coder: Anh Duc Vu (1057322)
 * Date: Aug 7, 2023
 */

public class Calculator {

    public class InvalidOperandException extends Exception
    {
        public InvalidOperandException()
        {
            super("Error: Invalid operand. Please enter a valid operand!");
        }
    }

    public class IllegalOperationException extends Exception
    {
        public IllegalOperationException()
        {
            super("Error: Invalid operation. Please enter a valid operation!");
        }
    }

    /**
     * This method will calculate the result of the operation
     * @param accumulator
     * @param operand
     * @param operator
     * @return result
     * @throws IllegalOperationException
     * @throws InvalidOperandException
     */
    public int calculate(int accumulator, int operand, String operator) throws IllegalOperationException, InvalidOperandException {
        int result = 0;

        // Apply the operation
        switch (operator) {
            case "+":
                result = accumulator + operand;
                break;
            case "-":
                result = accumulator - operand;
                break;
            case "*":
                result = accumulator * operand;
                break;
            case "/":
                if (operand != 0) {
                    result = accumulator / operand;
                } else {
                    throw new IllegalOperationException();
                }
                break;
            case "%":
                result = accumulator % operand;
                break;
            case "and":
                result = accumulator & operand;
                break;
            case "nand":
                result = ~(accumulator & operand);
                break;
            case "or":
                result = accumulator | operand;
                break;
            case "xor":
                result = accumulator ^ operand;
                break;
            case "not":
                result = ~accumulator;
                break;
            case "nor":
                result = ~(accumulator | operand);
                break;
            default:
                throw new InvalidOperandException();
        }
        return result;
    }
}
