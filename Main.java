package module2.assign3;

public class Main {
    public static void main(String[] args) {
        // Test with valid binary string
        try {
            String binaryString = "10101";
            long decimal = BinaryConverter.bin2Dec(binaryString);
            System.out.println("Decimal value: " + decimal);
        } 
        catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        // Test with invalid binary string
        try {
            String invalidBinaryString = "10201";
            long decimal = BinaryConverter.bin2Dec(invalidBinaryString);
            System.out.println("Decimal value: " + decimal);
        } 
        catch (NumberFormatException e) {
            System.err.println("Not a binary number");
        }
    }
}
