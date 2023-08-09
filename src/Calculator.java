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

    public int calculate(int accumulator, int operand, String operator, String mode) throws IllegalOperationException, InvalidOperandException {
        int result = 0;

        // Convert values based on mode
        switch (mode) {
            case "oct":
                accumulator = Integer.parseInt(Integer.toString(accumulator), 8);
                operand = Integer.parseInt(Integer.toString(operand), 8);
                break;
            case "hex":
                accumulator = Integer.parseInt(Integer.toString(accumulator), 16);
                operand = Integer.parseInt(Integer.toString(operand), 16);
                break;
            case "bin":
                accumulator = Integer.parseInt(Integer.toString(accumulator), 2);
                operand = Integer.parseInt(Integer.toString(operand), 2);
                break;
            case "dec":
            default:
                // Values remain as they are in decimal mode
                break;
        }

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
            case "mod":
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

        // Convert the result back to the requested mode
        switch (mode) {
            case "oct":
                result = Integer.parseInt(Integer.toOctalString(result));
                break;
            case "hex":
                result = Integer.parseInt(Integer.toHexString(result).toUpperCase());
                break;
            case "bin":
                result = Integer.parseInt(Integer.toBinaryString(result));
                break;
            case "dec":
            default:
                // Values remain as they are in decimal mode
                break;
        }
        return result;
    }
}
