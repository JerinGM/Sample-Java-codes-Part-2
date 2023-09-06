import java.util.Arrays;
public class Arr2numSumEqualsGivenValue
{
    public static boolean AddingArr(int[] a, int gN) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == gN) {
                    return true;
                }
            }
        } return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6, 8, 9, 10, 0};
        //you can change the given number to see if it displays the correct output or not
        int givenNumber = 10;
        boolean sumCheck;
        sumCheck = AddingArr(arr, givenNumber);
        if(sumCheck)
        {
            System.out.println("Yes, there are numbers within the array that adds upto the Given number");
        }
        else
        {
            System.out.println("There are no such numbers that adds upto the given number");
        }
    }
}