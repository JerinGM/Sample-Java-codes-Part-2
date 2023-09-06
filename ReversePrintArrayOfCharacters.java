public class ReversePrintArrayOfCharacters {
    public static void main(String[] args)
    {
        char[] charArray = "This is my Yoda    ,.  Do or do not there is not  `1try".toCharArray();
        rearrangeWords(charArray);
    }

    public static void rearrangeWords(char[] charArray) {
        int length = charArray.length;
        int start = 0;

        // Reverse the entire character array
        reverseArray(charArray, 0, length - 1);
        System.out.println(charArray);
        for (int endInLoop = 0; endInLoop < length; endInLoop++) {
            if (charArray[endInLoop] == ' ' || endInLoop == length - 1) {
                if (endInLoop == length - 1) {
                    // If it's the last word, include it in the reversal
                    reverseArray(charArray, start, endInLoop);
                } else {
                    //System.out.println(charArray);
                    reverseArray(charArray, start, endInLoop - 1);
                }
                start = endInLoop + 1;
            }
        }
        System.out.println(charArray);
    }
    public static void reverseArray(char[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}