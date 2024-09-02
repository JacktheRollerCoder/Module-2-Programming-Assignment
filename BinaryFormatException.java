/*12.9 (BINARYFORMATEXCEPTION) Exercise 12.7 implements the bin2Dec method to throw a 
BinaryFormatException if the string is not a binary string. Define a custom exception called 
BinaryFormatException. Implement the bin2Dec method to throw a BinaryFormatException if the string
 is not a binary string. */
package module2.assign3;

public class BinaryFormatException extends Exception {
    // Constructor that accepts a message
    public BinaryFormatException(String message) {
        super(message);
    }
}