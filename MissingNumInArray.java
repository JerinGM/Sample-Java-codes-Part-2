public class MissingNumInArray
{   // find the missing number x from an unsorted array
    // all the numbers from 1 to n are present except for the number n
    // I will be doing it using 2 for loops
    // You can also get the sum of number till n.
    // The actual sum will have the X included so the sum you get should be subtracted from actual sum till n
    public static void main(String[] args)
    {
        int[] arr = {6,3,1,9,8,2,5,4,10};
        int len = arr.length;
        int counter = 0;
        for(int i = 1; i <= len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                if (i == arr[j])
                {
                    counter = counter + 1;
                    break;
                }
            }
            if(counter == 0)
            {
                System.out.println(i);
            }
            counter = 0;
        }
    }
}