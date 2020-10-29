package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MaxElement {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        float[] numbers = new float[size]; 
        System.out.print("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) 
        {
            numbers[index] = input.nextFloat();
        }
        float max = numbers[0];
        for (int index = 1; index < numbers.length; index++)
        {
            if(max < numbers[index])
            {
              max = numbers[index];
            }
        }
        System.out.print("Max number: " + max);
    }

}