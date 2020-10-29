package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MinIndex {

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
        float min = numbers[0];
        int minIndex = 0;
        for (int index = 1; index < numbers.length; index++)
        {
            if(min > numbers[index])
            {
              min = numbers[index];
              minIndex = index;
            }
        }
        System.out.print("Min index: " + minIndex);
    }

}