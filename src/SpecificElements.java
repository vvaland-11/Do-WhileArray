import java.util.Arrays;
public class SpecificElements {

        //to remove specific element from an array

        public static void main(String[] args) {

            int[] array = {25,14,56,15,36,56,77,18,29,49};

            System.out.println("Original Array : "+ Arrays.toString(array));

            //Remove the second element (index->1, value->14) of the array
            int removeIndex = 1;

            for (int i = removeIndex; i < array.length- 1 ; i++)
            {
                array[i] = array[i + 1];
            }
            //We cannot alter
//We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice

            System.out.println("after removing the second element : "+Arrays.toString(array));

        }
}
