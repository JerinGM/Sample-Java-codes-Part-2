import java.util.Arrays;
import static java.lang.Character.*;
public class FlipCapitalisationOf2DArray
{
    public static void main(String[] args)
    {
        String[][] words = {{"My", "Name", "IS", "JERIN", "George", "maTHEw"},{"this", "is", "A", "SIMPLE", "javA", "cODe"}};
        char c;
        String word;
        StringBuilder newWord;
        System.out.println("My 2D Array initially looks like " + "\n" + Arrays.deepToString(words).replace("[","").replace("],","\n").replace("]", ""));
        for (int outterArray = 0; outterArray < words.length; outterArray++)
       {
           for (int innerArray = 0; innerArray < words[outterArray].length; innerArray++)
           {
               word = words[outterArray][innerArray];
               newWord = new StringBuilder();
               for (int i =0; i<word.length(); i++)
               {
               c = word.charAt(i);
               if (isUpperCase(c))
               {
                   c = toLowerCase(c);
               }
               else if (isLowerCase(c))
               {
                   c = toUpperCase(c);
               }
               newWord = newWord.append(c);
           }

               words[outterArray][innerArray] = newWord.toString();


       }
    }
        System.out.println(Arrays.deepToString(words).replace("[", "").replace("],", "\n"));
}
}