 import java.util.*;

 public class Binary 
 {
     static int binarySearch(int key, int number[])
     {
        int start=0;
        int end = number.length-1;
        while(start <=end)
        {
           int mid = start+end/2;
           if(number[mid] == key)
           {
            return mid;
           }

           if(number[mid] < key)
           {
            return mid +1;
           }
           else
           {
            if(number[mid] > key)
            {
                return mid-1;
            }
        }
    }
          return -1;
     }

     public static void main(String[] args)
      {
        int number[] = {2,4,6,8,10,12,14,20};
        int key = 10; 
        System.out.print("key values :");
        int res= binarySearch(key,number);
        System.out.println(res);

     }
    
 }
