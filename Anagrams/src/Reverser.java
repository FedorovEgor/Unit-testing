import java.util.Stack;
import java.util.StringJoiner;

public class Reverser {


    public String letterAnagramProducer(String initialString) {

        String[] stringArray = initialString.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ","", "");

        for (String eachString : stringArray) {
            Stack<Character> stack = new Stack<>();


            for (char currentCharacter : eachString.toCharArray()) {
                if (Character.isLetter(currentCharacter))
                    stack.push(currentCharacter);
            }

            StringBuilder reversedSubstring = reverseWord(eachString, stack);
            stringJoiner.add(reversedSubstring);
        }

        return stringJoiner.toString();
    }


    private StringBuilder reverseWord(String eachString, Stack<Character> stack) {
        StringBuilder reversedSubstring = new StringBuilder();
        for (char c : eachString.toCharArray()) {
            if (Character.isLetter(c))
                reversedSubstring.append(stack.pop());
            else
                reversedSubstring.append(c);
        }
        return reversedSubstring;
    }
}
