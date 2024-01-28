import java.util.*;
public class Maximun
{
    public static int Maximum(int number[])
    {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++)
        {
            if(largest <number[i])
            {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) 
    {
        int number[] = {1,2,5,6,3,1,2};
        System.out.print("largest values :");
        int res= Maximum(number);
        System.out.println(res);
    }
    
}
