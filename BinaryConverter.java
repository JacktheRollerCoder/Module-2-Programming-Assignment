package module2.assign3;
/**
 * *12.7 (NUMBERFORMATEXCEPTION) Write the bin2Dec(String binaryString) method to convert 
 * a binary string into a decimal number. Implement the bin2Dec method to throw a 
 * NumberFormatException if the string is not a binary string. Write a test program that
 *  prompts the user to enter a binary number as a string and displays its decimal 
 * equivalent. If the method throws an exception, display "Not a binary number".
 */

public class BinaryConverter {
    // Method to convert binary string to decimal
    public static long bin2Dec(String binaryString) throws NumberFormatException {
        if (!isValidBinary(binaryString)) {
            throw new NumberFormatException("Invalid binary string: " + binaryString);
        }
        
        // Convert binary string to decimal
        long decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(binaryString.length() - 1 - i);
            if (bit == '1') {
                decimalValue += Math.pow(2, i);
            }
        }
        return decimalValue;
    }

    // Helper method to check if a string is a valid binary string
    private static boolean isValidBinary(String str) {
        if (str == null || str.isEmpty()) return false;
        for (char ch : str.toCharArray()) {
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }
}
