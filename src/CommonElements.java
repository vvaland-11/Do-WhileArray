import java.util.Arrays;
import java.util.Scanner;
public class CommonElements {
        public static void main(String args[])
        { int size;
            System.out.println("Enter Size of Both Array");     //input size of array
            Scanner sc=new Scanner(System.in);
            size=sc.nextInt();
            int array1[]=new int[size];
            int array2[]=new int[size];
            System.out.println("Enter Element of Array1");   //input array1
            for(int i=0;i<size;i++)
            {
                array1[i]=sc.nextInt();
            }
            System.out.println("Enter Element of Array2"); //input array2
            for(int j=0;j<size;j++)
            {
                array2[j]=sc.nextInt();
            }
            System.out.println("Array1:"+Arrays.toString(array1));
            System.out.println("Array2:"+Arrays.toString(array2));
            for(int i=0;i<array1.length;i++)
            {
                for(int j=0;j<array2.length;j++)
                {
                    if(array1[i]==array2[j])
                    {
                        System.out.println("Common Element between two array:"+(array1[i]));
                    }
//
                }
            }
        }

    }

