package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayReversal {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        String[] characters = new String[size];
        String[] reversedCharacters = new String[size]; 
        System.out.print("Enter symbols: ");
        for (int index = 0; index < characters.length; index++) 
        {
          characters[index] = input.next();
        }
        for (int index = size - 1; index >= 0; index--)
        {
          reversedCharacters[(size - 1) - index] = characters[index];
        }
        String numbersAsString = Arrays.toString(reversedCharacters);
        System.out.print("Reversed symbols: " + numbersAsString);
    }

}