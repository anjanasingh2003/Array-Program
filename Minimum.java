import java.util.*;
public class Minimum
{
    public static int Minimum1(int number[])
    {
        int Smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++)
        {
            if(Smallest > number[i])
            {
                Smallest = number[i];
            }
        }
        return Smallest;
    }

    public static void main(String[] args) 
    {
        int number[] = {1,2,5,6,3,1,2};
        System.out.print("minimum value is : ");
        int res= Minimum1(number);
        System.out.println(res);
    }
}

